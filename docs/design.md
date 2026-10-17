# Design Document — naive-class-file-parser

A from-scratch JVM `.class` file parser. It ships two front-ends over one shared
domain model:

- **CLI** — output mimics `javap -v -p` and is regression-tested against it (`scripts/all.sh`).
- **Swing GUI** — an interactive browser for the constant pool, fields, methods and
  attributes, with cross-reference navigation (`#N` jumping).

## Architecture

```
 bytes ──▶ io ──▶ parser ──▶ type (domain model) ──▶ present (CLI, text)
                (pull-based     (immutable-leaning      └─▶ ui (Swing GUI,
                 parsers)        value classes)              table views)
```

| Layer | Responsibility | Depends on |
|---|---|---|
| `com.study.io` | Typed reading of big-endian `u1/u2/u4` streams | — |
| `com.study.parser` | Turn bytes into the domain model | `io`, `type` |
| `com.study.type` | Domain model: constant pool, fields, methods, attributes, instructions, descriptors, signatures | `io` (types only) |
| `com.study.present` | javap-like textual rendering | `type`, `util` |
| `com.study.ui` | Swing GUI, a second view layer over the same model | `parser`, `type`, `present` |
| `com.study.constants` / `annotations` / `util` | Enums (`ConstantKind`, access flags…), `@SupportedPredefinedAttribute`, helpers | — |

## Key Design Points

### 1. Pull-based parsing (`Parser<T>`)

Every parser is a `@FunctionalInterface Parser<T> { T parse(); }` backed by a
`ContentReader`. `MainParser` orchestrates them in class-file order:
magic → version → constant pool → flags → this/super → interfaces →
fields → methods → attributes, producing one `ParseResult`.
There is no intermediate byte tree — parsers construct model objects directly.

### 2. Constant pool: `LeafCpInfo` vs `CompoundCpInfo`

`CpInfo` splits into two families:

- **leaf** — self-contained values (`ConstantUtf8`, `ConstantInteger`, …), rendered via `desc()`.
- **compound** — entries referencing other entries (`ConstantClass`, `ConstantFieldref`,
  `ConstantMethodHandle`, …). They expose `componentDesc(constantPool)` (raw `#N` references)
  and `decoratedDetail(constantPool)` (references resolved to readable text).

Slot semantics: `Long`/`Double` entries occupy **two** indices; `ConstantPoolParser`
inserts a `null` phantom slot, and `ConstantPool implements Iterable<Pair<Integer, CpInfo>>`
hides the gap handling from consumers. All `#N` indexes in the model are the real
JVMS indexes, which is what makes GUI cross-reference jumping trivial.

### 3. Attribute dispatch with a safe fallback

`AttributeInfoParser` reads the attribute's raw bytes into a `U1InputStream`, then
switches on the attribute **name** to pick a concrete parser
(`Code` → `CodeAttributeParser`, `StackMapTable` → `StackMapTableAttributeParser`, …).
Unknown names degrade to `RawAttributeInfo` instead of throwing — the parser keeps
working on class files with attributes it does not understand yet
(`module-info`, `Record`, …).

`@SupportedPredefinedAttribute` marks which `AttributeInfo` fields a presenter can
render, letting the presentation layer discover supported attributes at runtime.

### 4. One model, two views

Presentation is decoupled from the model via `PrintStreamWrapper`
(wraps any `PrintStream`/`OutputStream`):

- CLI presenters write to a file (`scripts/result/output.txt`).
- GUI detail panels **reuse the very same presenters**, capturing their output with
  `TextCapture` (a `ByteArrayOutputStream` behind the same wrapper).
  Method detail in the GUI — including Code instructions, exception table and
  `LineNumberTable` — is therefore byte-identical to CLI output, forever in sync.

### 5. Type-safe wire types

`U1`/`U2`/`U4` are tiny value classes (shared base `AbstractU`) used everywhere
instead of raw `int`/`long`. This prevents mixing up byte counts and indexes, and
centralizes unsigned semantics (`toInt()`, `toLong()`, hex printing).

### 6. Instructions & verification types

`CodeInputStream` + `InstructionFactory` (with per-category factories:
`ConstantsFactory`, `LoadsFactory`, `MathFactory`, …) decode the `code[]` array into
`AbstractInstruction` subclasses (`OneByteInstruction`, `TwoByteInstruction`, …).
`StackMapTable` frames and `VerificationTypeInfo` have their own factory hierarchies
under `type/info/frame` and `type/info/verification`.

## Package Map (selected key classes)

| Package | Key classes | Role |
|---|---|---|
| `io` | `ContentReader`, `BasicInputStream`, `U1InputStream`, `CodeInputStream` | byte reading |
| `parser` | `MainParser`, `ParseResult`, `ConstantPoolParser`, `FieldInfoParser`, `MethodInfoParser`, `AttributeInfoParser`, `Main` (CLI entry) | orchestration |
| `parser.attribute` | one parser per attribute (`CodeAttributeParser`, `RuntimeVisibleAnnotationsAttributeParser`, …) | attribute bodies |
| `type` | `U1/U2/U4`, `ConstantPool`, `ItemsContainer` (count + items record) | model core |
| `type.constant` | `CpInfo`, `leaf.LeafCpInfo`, `compound.CompoundCpInfo` | constant pool entries |
| `type.info` | `FieldInfo`, `MethodInfo`, `AbstractInfo` (access flags/name/descriptor), `ElementValue` | members & annotations |
| `type.info.attribute` | `AttributeInfo` + ~20 concrete attributes + `RawAttributeInfo` | attributes |
| `type.instruction` | `AbstractInstruction`, `factory.*` | bytecode instructions |
| `type.descriptor` / `type.signature` | `FieldDescriptor`, `MethodDescriptor`, builders | human-readable types |
| `present` | `MainPresenter`, `ConstantPoolPresenter`, `FieldInfoPresenter`, `MethodInfoPresenter`, `AttributesPresenter` | text rendering |
| `ui` | `GuiMain`, `MainFrame`, `ClassFileParsingService` | GUI shell |
| `ui.panel` | `OverviewPanel`, `ConstantPoolPanel`, `FieldsPanel`, `MethodsPanel`, `AttributesPanel` | GUI views |
| `ui.support` | `TextCapture`, `CpReferences` (regex `#N` finder), `TextAreas` | GUI helpers |

## Running

```bash
# CLI (writes scripts/result/output.txt, then diff against javap via scripts/all.sh)
mvn compile exec:java -DthePath=SomeClass

# GUI
mvn compile exec:java -Pgui -Dexec.args="path/to/Some.class"
```

## Extension Points

- **New attribute** — add an `AttributeInfo` subclass, an `AttributeParser`, and a
  `case` in `AttributeInfoParser`. For presentation, add the presenter and register it.
  Until then the attribute safely shows as `RawAttributeInfo`.
- **New constant pool tag** — add a `ConstantKind` entry and a `CpInfo` subclass
  (leaf or compound), register in `CpInfoParser`/`ConstantPoolParser`.
- **New output format (JSON/HTML)** — implement another consumer of `ParseResult`
  next to `present`; do not change the model.

## Known Gaps (as of now)

- Runtime visible/invisible **parameter annotations** and **type annotations**
  are not parsed yet.
- Some newer attributes (`Module`, `Record`, `Code`'s rarer sub-attributes) fall
  back to `RawAttributeInfo`.
- `detail.md` at the repo root tracks the class-file structure being implemented.
