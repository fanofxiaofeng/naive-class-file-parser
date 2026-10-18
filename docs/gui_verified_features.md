# GUI Verified Features

This document lists the features of the Swing GUI (entry point `com.study.ui.GuiMain`)
that have been verified. Verification comes in two flavors:

- **Automated verification**: JUnit unit tests
  ([src/test/java/com/test/ui/](../src/test/java/com/test/ui/)). They do not open a
  window; instead they instantiate each panel directly, walk the component tree, and
  assert on the strings written into the component models
  (`JTable` / `JTextField` / `JTextArea` / `JList` / `JLabel`) — that is, the text
  actually displayed on screen. Components are created and read on the EDT.
  Run them with `mvn test`; 15 cases in total, regressed on every build.
- **Manual verification**: rendering and interaction behaviors (highlighting,
  jumping, popups) cannot be covered by component-model assertions; follow
  [5. Manual Verification Steps](#5-manual-verification-steps).

## 1. Class File Top-Level Information (Overview Panel)

| Item | GUI presentation | Example | Verified via |
|---|---|---|---|
| magic | Uppercase hex with `0x` prefix | `0xCAFEBABE` | Automated |
| minor version | Decimal integer | `0` | Automated |
| major version | Decimal integer + annotated Java version (45–69 mapped to JDK 1.1 ~ Java 25) | `61 (Java 17)` | Automated |
| access_flags summary line | `0x%04x` + list of set flag names | `0x0021  ACC_PUBLIC, ACC_SUPER` | Automated |
| access_flags detail table | Embedded full JVMS Table 4.1-A (9 rows: Flag name / Value / Set / Interpretation); set rows show `✓` in the Set column, unset rows are empty | ACC_PUBLIC and ACC_SUPER rows show `✓` | Automated |
| access_flags set-row highlight | Light green background + bold | — | Manual |
| this_class / super_class | Constant pool index + resolved fully qualified name | `#2  // com/test/ui/cases/GuiShowcaseCase`, `#3  // java/lang/Object` | Automated |
| constant_pool_count | Raw value + number of valid entries | `105  (104 valid entries)` | Automated |
| fields_count / methods_count / attributes_count | Decimal integers | — | Automated |

## 2. Constant Pool (Constant Pool Panel)

The table has four columns: `#` (constant pool index) / `tag` / `raw description` /
`resolved detail`, with one row per slot (row count = constant_pool_count − 1,
verified automatically).

- **Leaf entries** (no internal references): `raw description` shows the value itself,
  and `resolved detail` is empty.
- **Compound entries** (referencing other constants): `raw description` shows the raw
  `#N` references, and `resolved detail` shows the resolved, human-readable text.

Covered tags (JVMS §4.4 Table 4.4-A). The automated fixture
[GuiShowcaseCase.java](../src/test/java/com/test/ui/cases/GuiShowcaseCase.java)
triggers all of the tags below from a single class:

| tag | Constant type | raw description example | resolved detail example | Verified via |
|---|---|---|---|---|
| 1 | CONSTANT_Utf8 | `abc` | — (leaf, column empty) | Automated |
| 3 | CONSTANT_Integer | `98765` | — | Automated |
| 4 | CONSTANT_Float | `98765.0f` (with `f` suffix) | — | Automated |
| 5 | CONSTANT_Long | `-4294967296l` (with `l` suffix) | — | Automated |
| 6 | CONSTANT_Double | `1.0d` (with `d` suffix) | — | Automated |
| 7 | CONSTANT_Class | `#N` | `com/test/ui/cases/GuiShowcaseCase` | Automated |
| 8 | CONSTANT_String | `#N` | The referenced Utf8 content (`abc`) | Automated |
| 9 | CONSTANT_Fieldref | `#N.#N` | Produced by field access (getfield/putfield of `counter`) | Automated (presence) |
| 10 | CONSTANT_Methodref | `#N.#N` | Produced by virtual calls (`String.toUpperCase`) | Automated (presence) |
| 11 | CONSTANT_InterfaceMethodref | `#N.#N` | `java/util/List.size` | Automated |
| 12 | CONSTANT_NameAndType | `#N:#N` | Member name + descriptor | Automated (presence) |
| 15 | CONSTANT_MethodHandle | Bootstrap method reference of invokedynamic | — | Automated (presence) |
| 16 | CONSTANT_MethodType | Method descriptor | — | Automated (presence) |
| 18 | CONSTANT_InvokeDynamic | String concat / lambda | — | Automated (presence) |
| 17 / 19 / 20 | CONSTANT_Dynamic / Module / Package | — | — | Not covered |

> "Automated (presence)" means the test asserts that a row with this tag exists in the
> expected format, without asserting its full detail text.

### Two Slots (tags 5 and 6 only)

Long / Double entries occupy two constant pool indexes per JVMS §4.4.5; the following
slot gets its own row, described precisely by type and owning index (verified
automatically, including the slot count and the back-reference to the preceding index):

```
#28  Long    -4294967296l
#29          (unusable slot: second half of the Long at #28)
#32  Double  1.0d
#33          (unusable slot: second half of the Double at #32)
```

### Panel Interactions

| Interaction | Description | Verified via |
|---|---|---|
| Filter | The input box at the top filters by index / tag / text content; the row count shrinks accordingly and is restored once cleared | Automated (row-count changes) + Manual (live-response feel) |
| `#N` jump | Double-clicking a row jumps to the constant entry it references; when there are multiple references a popup lets the user pick; if the target is hidden by the current filter, the filter is cleared first | Manual |

## 3. Fields / Methods / Class Attributes Panels

These three panels never went through early manual verification; the automated tests
are their first systematic verification (all assert that "selecting a row fills the
detail pane with the presenter output, identical to the CLI").

| Panel | Automated coverage |
|---|---|
| Fields | Row count = fields_count; column names (access flags / name / type / descriptor / attributes) and count label ` Fields: N`; descriptor column of the `counter` / `LONG_CONSTANT` / `text` rows; selecting a row shows the field name, the `descriptor:` line and the `ConstantValue` attribute; the selected field's access flags are rendered as the embedded JVMS Table 4.5-A (9 rows × 4 columns, set rows show `✓` in the Set column, Interpretation column quotes JVMS SE 27 verbatim, updating with the selection) |
| Methods | Row count = methods_count; column names (access flags / name / descriptor / attributes) and count label ` Methods: N`; descriptor column of the `<init>` / `interfaceCall` / `stringConcat` rows; selecting a row shows the `descriptor:` line and the `Code:` attribute; the selected method's access flags are rendered as the embedded JVMS Table 4.6-A (12 rows × 4 columns, set rows show `✓` in the Set column, Interpretation column quotes JVMS SE 27 verbatim, updating with the selection) |
| Attributes | List size = attributes_count, count label ` Class attributes: N`; `SourceFile` detail contains the source file name; the `Record` attribute without a presenter (fixture [GuiRecordCase.java](../src/test/java/com/test/ui/cases/GuiRecordCase.java)) shows the placeholder `(detailed presentation for this attribute is not implemented yet; attribute_length = N)` |

## 4. Automated Test Inventory

| Test class | Cases | Coverage |
|---|---|---|
| `OverviewPanelTest` | 2 | Top-level field texts; access flags table 9 rows × 4 columns with `✓` marks |
| `ConstantPoolPanelTest` | 5 | Row count and headers; tag coverage; leaf values and compound details; two-slot behavior; filter |
| `FieldsPanelTest` | 3 | Fields table; row-selection detail; embedded Table 4.5-A updating with the selected field |
| `MethodsPanelTest` | 3 | Methods table; row-selection detail; embedded Table 4.6-A updating with the selected method |
| `AttributesPanelTest` | 2 | Attributes list; details with implemented / unimplemented presenter |

How to run:

```bash
mvn test -Dtest='com.test.ui.*Test'   # GUI tests only
mvn test                              # full regression
```

## 5. Manual Verification Steps

Verification case: [Main.java](Main.java), compiled with `javac` (version 21) to
produce the `Main.class` file.

Start the GUI with the following command and select the `Main.class` file:

```bash
mvn compile exec:java -Pgui
```

Items requiring manual confirmation (not coverable by automation):

- Overview panel: in the access_flags table, **set rows are highlighted with a light
  green background + bold**, unset rows render normally;
- Fields / Methods panels: set rows in the access_flags tables (Table 4.5-A /
  4.6-A) use the same light green + bold highlight (the `✓` marks and the
  selection sync are covered by automation);
- Constant pool panel: `#N` double-click jump, the popup for choosing among multiple
  references, and clearing the filter automatically when the target is hidden;
- Constant pool panel: the filter box responds to typing immediately.
