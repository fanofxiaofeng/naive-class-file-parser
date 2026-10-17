# GUI 已验证功能清单

本文档列举 Swing GUI（入口 `com.study.ui.GuiMain`）中**已经实际验证过**的功能。

验证用例：[Main.java](Main.java)，使用 `javac` 编译（`javac` 的版本为 21），生成 `Main.class` 文件。


使用如下命令启动本项目的GUI后，选择 `Main.class` 文件，然后验证 GUI 展示内容。

```bash
mvn compile exec:java -Pgui
```

## 一、Class 文件顶层信息（Overview 面板）

| 项目 | GUI 展示形式 | 示例 | 状态 |
|---|---|---|---|
| 魔数（magic） | 十六进制大写，带 `0x` 前缀 | `0xCAFEBABE` | 已验证 |
| 次版本号（minor version） | 十进制整数 | `0` | 已验证 |
| 主版本号（major version） | 十进制整数 + 自动标注 Java 版本（45–69 映射到 JDK 1.1 ~ Java 25） | `65 (Java 21)` | 已验证 |
| access_flags | ① 摘要行：`0x%04x` + 生效 flag 名列表；② 下方嵌入完整的 JVMS Table 4.1-A 表格（9 行：Flag name / Value / Set / Interpretation），**当前类生效的行以浅绿背景 + 加粗高亮**，未生效行正常显示 | `0x0021 ACC_PUBLIC, ACC_SUPER`，表格中 ACC_PUBLIC、ACC_SUPER 两行高亮 | 已验证 |
| this_class | 常量池索引 + 解析出的全限定名 | `// Main` | 已验证 |
| super_class | 常量池索引 + 解析出的全限定名 | `// java/lang/Object` | 已验证 |

## 二、常量池（Constant Pool 面板）

表格四列：`#`（常量池索引）/ `tag` / `raw description` / `resolved detail`。

- **叶子型条目**（无内部引用）：`raw description` 显示值本身，`resolved detail` 列为空。
- **复合条目**（引用其他常量）：`raw description` 显示原始 `#N` 引用，
  `resolved detail` 显示引用解析后的可读文本。

已验证的 tag（JVMS §4.4 Table 4.4-A）：

| tag | 常量类型 | raw description 示例 | resolved detail 示例 | 状态 |
|---|---|---|---|---|
| 1 | CONSTANT_Utf8 | `"Hello World\t\n\b"` | —（叶子型，此列为空） | 已验证 |
| 3 | CONSTANT_Integer | `98765	` | — | 已验证 |
| 4 | CONSTANT_Float | `98765.0f`（带 `f` 后缀） | — | 已验证 |
| 5 | CONSTANT_Long | `98765l`（带 `l` 后缀） | — | 已验证 |
| 6 | CONSTANT_Double | `98765.0d`（带 `d` 后缀） | — | 已验证 |
| 7 | CONSTANT_Class | `#4` | `java/lang/Object` | 已验证 |
| 8 | CONSTANT_String | `#15` | 对应的 Utf8 字符串内容 | 已验证 |

### 双槽位（tag 5、6 特有）

Long / Double 条目按 JVMS §4.4.5 占两个常量池索引，其后的空槽单独占一行，
描述精确到类型与所属索引，例如：

```
#28  Long    -4294967296l
#29          (unusable slot: second half of the Long at #28)
#32  Double  1.0d
#33          (unusable slot: second half of the Double at #32)
```

### 已验证的面板交互

- **过滤**：顶部输入框按 序号 / tag / 文本内容 实时过滤。
- **`#N` 跳转**：双击某行，跳转到其引用的常量条目；引用有多个时弹出菜单供选择；
  目标被过滤条件隐藏时自动清除过滤后再定位。
