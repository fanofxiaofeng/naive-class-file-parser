# 设计文档 — naive-class-file-parser

一个从零实现的 JVM `.class` 文件解析器。在同一份领域模型之上提供两种前端：

- **CLI** —— 输出风格模仿 `javap -v -p`，并通过 `scripts/all.sh` 与 javap 对比做回归测试。
- **Swing GUI** —— 交互式浏览常量池、字段、方法与属性，支持 `#N` 交叉引用跳转。

## 架构

```
 字节流 ──▶ io ──▶ parser ──▶ type（领域模型）──▶ present（CLI，文本输出）
               （拉取式解析器）   （值对象为主）       └─▶ ui（Swing GUI，表格视图）
```

| 层 | 职责 | 依赖 |
|---|---|---|
| `com.study.io` | 大端 `u1/u2/u4` 类型化读取 | — |
| `com.study.parser` | 把字节变成领域模型 | `io`、`type` |
| `com.study.type` | 领域模型：常量池、字段、方法、属性、指令、descriptor、signature | 仅 `io` 中的类型 |
| `com.study.present` | javap 风格的文本渲染 | `type`、`util` |
| `com.study.ui` | Swing GUI，同一模型之上的第二展示层 | `parser`、`type`、`present` |
| `com.study.constants` / `annotations` / `util` | 枚举（`ConstantKind`、访问标志等）、`@SupportedPredefinedAttribute`、工具类 | — |

## 核心设计点

### 1. 拉取式解析（`Parser<T>`）

所有解析器都是函数式接口 `@FunctionalInterface Parser<T> { T parse(); }`，背后由一个
`ContentReader` 供字节。`MainParser` 按 class 文件结构顺序统筹：
magic → 版本号 → 常量池 → 访问标志 → this/super → 接口 → 字段 → 方法 → 属性，
最终产出一个 `ParseResult`。没有中间字节树——解析器直接构造模型对象。

### 2. 常量池：`LeafCpInfo` 与 `CompoundCpInfo` 二分

`CpInfo` 分为两组：

- **leaf（叶子型）** —— 自包含的值（`ConstantUtf8`、`ConstantInteger` 等），用 `desc()` 渲染。
- **compound（复合型）** —— 引用其他常量的条目（`ConstantClass`、`ConstantFieldref`、
  `ConstantMethodHandle` 等），提供 `componentDesc(constantPool)`（原始 `#N` 引用）
  与 `decoratedDetail(constantPool)`（引用已解析为可读文本）。

槽位语义：`Long`/`Double` 占**两个**索引；`ConstantPoolParser` 插入 `null` 不可用槽（JVMS 称其为 unusable），
而 `ConstantPool implements Iterable<Pair<Integer, CpInfo>>` 对使用者屏蔽了这一差异。
模型中所有 `#N` 索引都是真实的 JVMS 索引——这正是 GUI 交叉引用跳转能轻松实现的原因。

### 3. 属性分派与安全降级

`AttributeInfoParser` 先把属性原始字节读进 `U1InputStream`，再按属性**名称** switch
分派到具体解析器（`Code` → `CodeAttributeParser`、`StackMapTable` →
`StackMapTableAttributeParser` …）。未知名称降级为 `RawAttributeInfo` 而不是抛异常——
因此遇到还不认识的属性（`module-info`、`Record` 等）时解析器依然能继续工作。

`@SupportedPredefinedAttribute` 注解标记 presenter 能渲染哪些 `AttributeInfo` 字段，
使展示层可以在运行时发现已支持的属性。

### 4. 一个模型，两种视图

展示与模型通过 `PrintStreamWrapper`（可包装任意 `PrintStream`/`OutputStream`）解耦：

- CLI presenter 输出到文件（`scripts/result/output.txt`）。
- GUI 详情面板**复用同一批 presenter**，通过 `TextCapture`（背后是一个
  `ByteArrayOutputStream`）捕获文本。因此 GUI 中方法详情——包括 Code 指令、
  异常表、`LineNumberTable`——与 CLI 输出逐字节一致、永远同步。

### 5. 类型安全的线上类型

`U1`/`U2`/`U4` 是轻量值类（共同基类 `AbstractU`），代码中不使用裸 `int`/`long`。
这既避免混淆"字节数"与"索引"，也把无符号语义集中到一处（`toInt()`、`toLong()`、十六进制打印）。

### 6. 指令与验证类型

`CodeInputStream` + `InstructionFactory`（下分各类工厂：`ConstantsFactory`、
`LoadsFactory`、`MathFactory` 等）把 `code[]` 字节解码为 `AbstractInstruction` 子类
（`OneByteInstruction`、`TwoByteInstruction` 等）。`StackMapTable` 帧与
`VerificationTypeInfo` 各有独立的工厂层级，分别位于 `type/info/frame` 与
`type/info/verification`。

## 包地图（关键类节选）

| 包 | 关键类 | 角色 |
|---|---|---|
| `io` | `ContentReader`、`BasicInputStream`、`U1InputStream`、`CodeInputStream` | 字节读取 |
| `parser` | `MainParser`、`ParseResult`、`ConstantPoolParser`、`FieldInfoParser`、`MethodInfoParser`、`AttributeInfoParser`、`Main`（CLI 入口） | 统筹解析 |
| `parser.attribute` | 每种属性一个 parser（`CodeAttributeParser`、`RuntimeVisibleAnnotationsAttributeParser` 等） | 属性体解析 |
| `type` | `U1/U2/U4`、`ConstantPool`、`ItemsContainer`（count + items 的 record） | 模型核心 |
| `type.constant` | `CpInfo`、`leaf.LeafCpInfo`、`compound.CompoundCpInfo` | 常量池条目 |
| `type.info` | `FieldInfo`、`MethodInfo`、`AbstractInfo`（访问标志/名称/descriptor）、`ElementValue` | 成员与注解 |
| `type.info.attribute` | `AttributeInfo` + 约 20 个具体属性 + `RawAttributeInfo` | 属性 |
| `type.instruction` | `AbstractInstruction`、`factory.*` | 字节码指令 |
| `type.descriptor` / `type.signature` | `FieldDescriptor`、`MethodDescriptor`、各类 builder | 人类可读类型 |
| `present` | `MainPresenter`、`ConstantPoolPresenter`、`FieldInfoPresenter`、`MethodInfoPresenter`、`AttributesPresenter` | 文本渲染 |
| `ui` | `GuiMain`、`MainFrame`、`ClassFileParsingService` | GUI 外壳 |
| `ui.panel` | `OverviewPanel`、`ConstantPoolPanel`、`FieldsPanel`、`MethodsPanel`、`AttributesPanel` | GUI 视图 |
| `ui.support` | `TextCapture`、`CpReferences`（`#N` 正则识别）、`TextAreas` | GUI 辅助 |

## 运行方式

```bash
# CLI（输出到 scripts/result/output.txt，再用 scripts/all.sh 与 javap 输出的结果进行对比）
mvn compile exec:java -DthePath=SomeClass

# GUI（无命令行参数；启动后在界面中选择 .class 文件）
mvn compile exec:java -Pgui
```

## 扩展点

- **新增属性** —— 增加一个 `AttributeInfo` 子类、一个 `AttributeParser`，并在
  `AttributeInfoParser` 中加一个 `case`。展示侧再加 presenter 并注册。
  在此之前该属性会安全地显示为 `RawAttributeInfo`。
- **新增常量池 tag** —— 增加 `ConstantKind` 枚举值与 `CpInfo` 子类（leaf 或 compound），
  在 `CpInfoParser`/`ConstantPoolParser` 中注册。
- **新增输出格式（JSON/HTML）** —— 在 `present` 旁边再写一个 `ParseResult` 的消费者即可，
  不要改动模型。

## 已知缺口（截至目前）

- 尚未解析：运行时可见/不可见的**参数注解**与**类型注解**。
- 部分较新的属性（`Module`、`Record`、`Code` 中较少见的子属性）会降级为 `RawAttributeInfo`。
- 仓库根目录的 `detail.md` 记录了正在实现中的 class 文件结构。
