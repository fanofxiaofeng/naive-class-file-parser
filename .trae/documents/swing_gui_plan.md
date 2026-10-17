# Swing 图形界面实施计划

## 目标（已确认方向）

保持现有 CLI（与 `javap -v -p` 对拍）完全不变，新增一个基于 Java Swing 的桌面 GUI。
GUI 是挂在同一个 `ParseResult` 领域模型上的**第二展示层**，不引入 Python、不引入 JSON 中介。

核心体验定位（超越 javap 文本输出的部分）：

- 常量池表格化展示，支持按 tag / 关键字过滤；
- 常量池条目中的 `#N` 引用可点击跳转（如 `#5.#13` → 点 `#5` 跳到第 5 项）；
- 字段 / 方法表格化浏览，方法下钻查看 Code 属性（指令、异常表、局部变量表等）；
- 打开任意磁盘路径的 `.class` 文件（支持拖拽），不再限于 classpath 资源。

## Repository Research（调研结论）

- 分层清晰：`io` → `parser` → `type`（领域模型）→ `present`（文本展示）。
  展示层只依赖 `ParseResult` 与 `PrintStreamWrapper`，GUI 可作为平行新层，不改动现有解析逻辑。
- [MainParser.java](file:///Users/jinyang/IdeaProjects/naive-class-file-parser/src/main/java/com/study/parser/MainParser.java) 构造器接受 `ContentReader`；
  [BasicInputStream.java](file:///Users/jinyang/IdeaProjects/naive-class-file-parser/src/main/java/com/study/io/BasicInputStream.java) 包装任意 `InputStream`，
  故 `new MainParser(new BasicInputStream(new FileInputStream(path))).parse()` 即可解析磁盘文件。
- [Main.java](file:///Users/jinyang/IdeaProjects/naive-class-file-parser/src/main/java/com/study/parser/Main.java) 目前只接受 classpath 资源，且把输出写死到 `scripts/result/output.txt`。
- [ConstantPool.java](file:///Users/jinyang/IdeaProjects/naive-class-file-parser/src/main/java/com/study/type/ConstantPool.java) 实现 `Iterable<Pair<Integer, CpInfo>>`，
  天然带"逻辑序号"（long/double 占两个槽位、下一槽为 null 的语义已由迭代器封装）；
  `CpInfo` 有 `getTag()` / `desc()`，复合条目有 `detail(ConstantPool)` 解析引用。
- [ItemsContainer.java](file:///Users/jinyang/IdeaProjects/naive-class-file-parser/src/main/java/com/study/type/ItemsContainer.java) 是 record；
  [FieldInfo](file:///Users/jinyang/IdeaProjects/naive-class-file-parser/src/main/java/com/study/type/info/FieldInfo.java) /
  [MethodInfo](file:///Users/jinyang/IdeaProjects/naive-class-file-parser/src/main/java/com/study/type/info/MethodInfo.java)
  已提供 flags 描述、人类可读类型等辅助方法，可直接用于表格列。
- 现有 `present` 层的 presenter 输出纯文本到 `PrintStreamWrapper`；GUI 的详情面板可**复用这些 presenter**，
  把输出捕获成字符串放进只读文本区（需给 `PrintStreamWrapper` 增加一个接受 `OutputStream` 的构造方式）。
- Java 17 + Maven，Swing 为 JDK 自带，无需新依赖；可选引入 FlatLaf（单一小依赖）改善观感。

## Files and Modules

### 新增（包 `com.study.ui`）

- `ClassFileParsingService.java`：`Path → ParseResult` 的统一入口（封装 `BasicInputStream` + `MainParser` + 异常信息）。
- `GuiMain.java`：GUI 启动入口（Swing EDT 启动、可选设置 FlatLaf）。
- `MainFrame.java`：主窗口。菜单/工具栏"打开文件"（`JFileChooser`）、窗口支持 `.class` 文件拖拽；
  左侧 `JTree`（类概要 / 常量池 / 字段 / 方法 / 类属性），右侧 `JPanel` 卡片随树节点切换。
- `panel/OverviewPanel.java`：magic、版本、flags、this/super/interfaces、各项计数（复用 `MainPresenter` 已有的拼装逻辑思路）。
- `panel/ConstantPoolPanel.java`：`JTable` 列 = `#` / `tag` / `原始描述(desc)` / `解析详情(detail)`；
  顶部过滤框（按序号、tag 名、文本内容过滤）；详情列中的 `#N` 以链接样式渲染，点击/双击跳转到对应行；
  long/double 的 null 槽显示"（占用两个槽位）"。
- `panel/FieldsPanel.java`：列 = 访问标志 / 名称 / 字段类型（人类可读）/ descriptor / 属性数；下钻显示该字段属性详情。
- `panel/MethodsPanel.java`：列 = 访问标志 / 名称 / 返回值+参数（人类可读）/ descriptor / 属性数；
  下钻面板显示方法属性；Code 属性中指令等富文本区域复用现有 presenter 捕获的文本。
- `panel/AttributesPanel.java`：类级别属性列表 + 详情。
- `support/CpReference.java`（小工具）：从 detail 文本中识别 `#N` / `#N:#M` 引用及其在文本中的位置，供跳转与高亮使用。
- `support/TextCapture.java`（小工具）：把现有 presenter 的输出捕获为 `String`（基于 `ByteArrayOutputStream`）。

### 修改

- [PrintStreamWrapper.java](file:///Users/jinyang/IdeaProjects/naive-class-file-parser/src/main/java/com/study/util/PrintStreamWrapper.java)：
  新增接受 `OutputStream` 的构造器（现有文件路径构造器保持不变），供 GUI 捕获文本。
- [Main.java](file:///Users/jinyang/IdeaProjects/naive-class-file-parser/src/main/java/com/study/parser/Main.java)：
  参数支持文件系统路径（classpath 资源方式保留兼容，或直接统一走文件路径）；解析与展示的拼装可复用 `ClassFileParsingService`。
- [pom.xml](file:///Users/jinyang/IdeaProjects/naive-class-file-parser/pom.xml)：
  - 可选加入 `com.formdev:flatlaf`（若不希望加依赖，则用 JDK 自带跨平台 LAF，功能不受影响）；
  - `exec-maven-plugin` 增加 GUI 入口配置（如 `-Dgui=true` 时 mainClass 为 `com.study.ui.GuiMain`），或新增一个 maven profile。
- `scripts/run.sh` 等脚本不动。

## Implementation Steps（依赖顺序）

1. **入口文件化**：新增 `ClassFileParsingService`；改造 `Main` 支持磁盘路径；`PrintStreamWrapper` 支持 `OutputStream`。
   验证：CLI 输出与改造前逐字节一致（跑 `scripts/all.sh` 对拍）。
2. **GUI 骨架**：`GuiMain` + `MainFrame`（打开文件、拖拽、左右分栏、树导航），用 `SwingWorker` 后台解析避免卡 EDT；
   解析失败弹错误对话框。先做"概览"页。
3. **常量池页（核心页）**：`JTable` + 过滤 + `#N` 跳转 + 双槽位展示。
4. **字段 / 方法页**：两个表格 + 下钻详情；Code 等文本区通过 `TextCapture` 复用对应 presenter 输出。
5. **类属性页 + 收尾**：类级别属性浏览；FlatLaf（可选）；窗口标题显示当前类名与文件路径。
6. **打包与入口**：pom profile / exec 配置；可执行 jar（maven-jar-plugin mainClass 指向 GUI，CLI 用 `--cli` 参数保留）。

## Dependencies and Considerations

- 仅用 JDK 自带 Swing；FlatLaf 为唯一可选新依赖，加不加都不影响功能。
- 现有测试（ASM/JUnit 对拍）不改、不挂 GUI 依赖；GUI 代码以手工验证为主。
- GUI 不改任何 `type` / `parser` 下的类；如确需模型新能力，优先在模型上加只读方法，不动解析行为。
- 未完成的注解（参数注解、类型注解等）属于解析层缺口，不在本期 GUI 范围；
  GUI 通过现有属性展示机制自然呈现已支持部分，后续补解析时 GUI 自动受益。
- `#N` 跳转一期采用"detail 文本正则识别 + 行定位"的轻量方案，避免改动所有 `CpInfo` 子类；
  将来需要引用图谱等更强能力时，再在模型层显式暴露引用关系。

## Validation

- `mvn -q compile` 通过；`scripts/all.sh` 对拍输出与改造前一致（回归 CLI）。
- 用 GUI 打开：
  1. 本项目 `target/classes` 下的 class（如 `com/study/parser/MainParser.class`）；
  2. 测试用例中含丰富注解 / Code 的 class（`target/test-classes` 下的 Case 类）。
- 手工验收：
  - 常量池过滤可用；点击 `#N` 正确跳转；long/double 后空槽提示正确；
  - 字段/方法表格内容与同文件 CLI 输出一致；方法 Code 下钻可见指令文本；
  - 打开不存在 / 非法 class 文件时弹出友好错误而不是堆栈崩溃；拖拽打开可用。

## Risks

- **某些 class 含未支持属性导致解析异常**（如 `module-info.class`、Record/Sealed 新属性）：
  打开动作做异常兜底并提示；不作为 GUI 本身缺陷处理。
- **presenter 捕获文本的缩进/换行与文件输出不一致**：通过 `OutputStream` 构造器走完全相同的写出路径，规避双份逻辑。
- **Swing 跨平台观感差**：一期用系统 LAF；FlatLaf 作为一行代码的可选项，随时可加。
- **表格中长文本（Utf8、detail）性能**：一期先普通渲染；若常量池条目极多，再引入惰性/省略渲染，不提前优化。
