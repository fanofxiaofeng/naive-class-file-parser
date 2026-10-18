# GUI 已验证功能清单

本文档列举 Swing GUI（入口 `com.study.ui.GuiMain`）中已经验证的功能。验证方式分为两类：

- **自动化验证**：JUnit 单元测试（[src/test/java/com/test/ui/](../src/test/java/com/test/ui/)），
  不创建窗口，直接实例化各面板并遍历组件树，断言写入组件模型
  （`JTable` / `JTextField` / `JTextArea` / `JList` / `JLabel`）的字符串——
  即界面上实际展示的文字；组件的创建与读取均在 EDT 上执行。
  运行 `mvn test` 即可执行，共 15 个用例，每次构建自动回归。
- **人工验证**：高亮、跳转、弹窗等渲染与交互行为无法通过组件模型断言覆盖，
  按 [五、人工验证步骤](#五人工验证步骤) 操作确认。

## 一、Class 文件顶层信息（Overview 面板）

| 项目 | GUI 展示形式 | 示例 | 验证方式 |
|---|---|---|---|
| 魔数（magic） | 十六进制大写，带 `0x` 前缀 | `0xCAFEBABE` | 自动化 |
| 次版本号（minor version） | 十进制整数 | `0` | 自动化 |
| 主版本号（major version） | 十进制整数 + 自动标注 Java 版本（45–69 映射到 JDK 1.1 ~ Java 25） | `61 (Java 17)` | 自动化 |
| access_flags 摘要行 | `0x%04x` + 生效 flag 名列表 | `0x0021  ACC_PUBLIC, ACC_SUPER` | 自动化 |
| access_flags 明细表 | 内嵌完整的 JVMS Table 4.1-A（9 行：Flag name / Value / Set / Interpretation），生效行 Set 列为 `✓`，未生效行为空 | ACC_PUBLIC、ACC_SUPER 两行 `✓` | 自动化 |
| access_flags 生效行高亮 | 浅绿背景 + 加粗 | — | 人工 |
| this_class / super_class | 常量池索引 + 解析出的全限定名 | `#2  // com/test/ui/cases/GuiShowcaseCase`、`#3  // java/lang/Object` | 自动化 |
| constant_pool_count | 原始值 + 有效条目数换算 | `105  (104 valid entries)` | 自动化 |
| fields_count / methods_count / attributes_count | 十进制整数 | — | 自动化 |

## 二、常量池（Constant Pool 面板）

表格四列：`#`（常量池索引）/ `tag` / `raw description` / `resolved detail`，
行数 = constant_pool_count − 1（自动化验证）。

- **叶子型条目**（无内部引用）：`raw description` 显示值本身，`resolved detail` 列为空。
- **复合条目**（引用其他常量）：`raw description` 显示原始 `#N` 引用，
  `resolved detail` 显示引用解析后的可读文本。

已覆盖的 tag（JVMS §4.4 Table 4.4-A）。自动化 fixture
[GuiShowcaseCase.java](../src/test/java/com/test/ui/cases/GuiShowcaseCase.java)
一个类即可触发下列全部 tag：

| tag | 常量类型 | raw description 示例 | resolved detail 示例 | 验证方式 |
|---|---|---|---|---|
| 1 | CONSTANT_Utf8 | `abc` | —（叶子型，此列为空） | 自动化 |
| 3 | CONSTANT_Integer | `98765` | — | 自动化 |
| 4 | CONSTANT_Float | `98765.0f`（带 `f` 后缀） | — | 自动化 |
| 5 | CONSTANT_Long | `-4294967296l`（带 `l` 后缀） | — | 自动化 |
| 6 | CONSTANT_Double | `1.0d`（带 `d` 后缀） | — | 自动化 |
| 7 | CONSTANT_Class | `#N` | `com/test/ui/cases/GuiShowcaseCase` | 自动化 |
| 8 | CONSTANT_String | `#N` | 对应的 Utf8 字符串内容（`abc`） | 自动化 |
| 9 | CONSTANT_Fieldref | `#N.#N` | 字段读写产生（`counter` 的 getfield/putfield） | 自动化（出现性） |
| 10 | CONSTANT_Methodref | `#N.#N` | 虚方法调用产生（`String.toUpperCase`） | 自动化（出现性） |
| 11 | CONSTANT_InterfaceMethodref | `#N.#N` | `java/util/List.size` | 自动化 |
| 12 | CONSTANT_NameAndType | `#N:#N` | 成员名 + 描述符 | 自动化（出现性） |
| 15 | CONSTANT_MethodHandle | invokedynamic 引导方法引用 | — | 自动化（出现性） |
| 16 | CONSTANT_MethodType | 方法描述符 | — | 自动化（出现性） |
| 18 | CONSTANT_InvokeDynamic | 字符串拼接 / lambda | — | 自动化（出现性） |
| 17 / 19 / 20 | CONSTANT_Dynamic / Module / Package | — | — | 未覆盖 |

> "自动化（出现性）"表示测试断言该 tag 的行存在且格式正确，未逐一断言其 detail 文本。

### 双槽位（tag 5、6 特有）

Long / Double 条目按 JVMS §4.4.5 占两个常量池索引，其后的空槽单独占一行，
描述精确到类型与所属索引（自动化验证，含槽位数量与前序索引指向）：

```
#28  Long    -4294967296l
#29          (unusable slot: second half of the Long at #28)
#32  Double  1.0d
#33          (unusable slot: second half of the Double at #32)
```

### 面板交互

| 交互 | 说明 | 验证方式 |
|---|---|---|
| 过滤 | 顶部输入框按 序号 / tag / 文本内容 过滤；行数随之收窄、清空后恢复 | 自动化（行数变化）+ 人工（实时响应体感） |
| `#N` 跳转 | 双击某行跳转到其引用的常量条目；引用有多个时弹出菜单供选择；目标被过滤条件隐藏时自动清除过滤后再定位 | 人工 |

## 三、字段 / 方法 / 类属性面板

这三个面板未做过早期人工验证，自动化测试是其首批系统性验证（均断言
"选中行后详情区显示与 CLI 完全一致的 presenter 文本"）。

| 面板 | 自动化覆盖点 |
|---|---|
| Fields | 行数 = fields_count；列名（access flags / name / type / descriptor / attributes）与计数标签 ` Fields: N`；`counter` / `LONG_CONSTANT` / `text` 行的 descriptor 列；选中行详情含字段名、`descriptor:` 行、`ConstantValue` 属性；选中字段的 access_flags 以内嵌 JVMS Table 4.5-A 呈现（9 行 × 4 列，生效行 Set 列为 `✓`，Interpretation 列为 JVMS SE 27 原文，随选中字段联动） |
| Methods | 行数 = methods_count；列名（access flags / name / descriptor / attributes）与计数标签 ` Methods: N`；`<init>` / `interfaceCall` / `stringConcat` 行的 descriptor 列；选中行详情含 `descriptor:` 行、`Code:` 属性；选中方法的 access_flags 以内嵌 JVMS Table 4.6-A 呈现（12 行 × 4 列，生效行 Set 列为 `✓`，Interpretation 列为 JVMS SE 27 原文，随选中方法联动） |
| Attributes | 列表条数 = attributes_count，计数标签 ` Class attributes: N`；`SourceFile` 详情含源文件名；无 presenter 的 `Record` 属性（fixture [GuiRecordCase.java](../src/test/java/com/test/ui/cases/GuiRecordCase.java)）显示占位文案 `(detailed presentation for this attribute is not implemented yet; attribute_length = N)` |

## 四、自动化测试清单

| 测试类 | 用例数 | 覆盖点 |
|---|---|---|
| `OverviewPanelTest` | 2 | 顶层字段文本；access flags 表格 9 行 × 4 列及 `✓` 标记 |
| `ConstantPoolPanelTest` | 5 | 行数与表头；tag 覆盖；叶子值与复合条目 detail；双槽位；过滤 |
| `FieldsPanelTest` | 3 | 字段表格；选中行详情；内嵌 Table 4.5-A 随选中字段联动 |
| `MethodsPanelTest` | 3 | 方法表格；选中行详情；内嵌 Table 4.6-A 随选中方法联动 |
| `AttributesPanelTest` | 2 | 属性列表；已实现 / 未实现 presenter 的详情 |

运行方式：

```bash
mvn test -Dtest='com.test.ui.*Test'   # 只跑 GUI 测试
mvn test                              # 全量回归
```

## 五、人工验证步骤

验证用例：[Main.java](Main.java)，使用 `javac` 编译（`javac` 的版本为 21），生成 `Main.class` 文件。

使用如下命令启动本项目的 GUI 后，选择 `Main.class` 文件：

```bash
mvn compile exec:java -Pgui
```

需人工确认的事项（自动化无法覆盖）：

- Overview 面板：access_flags 表格中**生效行以浅绿背景 + 加粗高亮**，未生效行正常显示；
- Fields / Methods 面板：access_flags（Table 4.5-A / 4.6-A）生效行的浅绿 + 加粗高亮（`✓` 标记与联动已由自动化覆盖）；
- 常量池面板：`#N` 双击跳转、多引用时弹出选择菜单、目标被过滤隐藏时自动清除过滤后再定位；
- 常量池面板：过滤框输入即时响应。
