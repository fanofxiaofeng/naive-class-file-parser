# class 文件格式
根据 [4.1. The ClassFile Structure](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.1) 的描述, 
class 文件的格式如下

```
ClassFile {
    u4             magic;
    u2             minor_version;
    u2             major_version;
    u2             constant_pool_count;
    cp_info        constant_pool[constant_pool_count-1];
    u2             access_flags;
    u2             this_class;
    u2             super_class;
    u2             interfaces_count;
    u2             interfaces[interfaces_count];
    u2             fields_count;
    field_info     fields[fields_count];
    u2             methods_count;
    method_info    methods[methods_count];
    u2             attributes_count;
    attribute_info attributes[attributes_count];
}
```
本项目中用 [ParseResult.java](src/main/java/com/study/parser/ParseResult.java) 来表示一个 class 文件的解析结果

## 常量池(The Constant Pool)
### The CONSTANT_Class_info Structure
根据 [4.4.1. The CONSTANT_Class_info Structure](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.4.1) 中的描述
CONSTANT_Class_info 的结构如下
```
CONSTANT_Class_info {
    u1 tag; // The tag item has the value CONSTANT_Class (7).
    u2 name_index;
}
```
在本项目中用 [ConstantClass.java](src/main/java/com/study/type/constant/ConstantClass.java) 来表示

### The CONSTANT_Fieldref_info, CONSTANT_Methodref_info, and CONSTANT_InterfaceMethodref_info Structures
根据 [4.4.2. The CONSTANT_Fieldref_info, CONSTANT_Methodref_info, and CONSTANT_InterfaceMethodref_info Structures](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.4.2) 中的描述
CONSTANT_Fieldref_info CONSTANT_Methodref_info CONSTANT_InterfaceMethodref_info 的结构如下
```
CONSTANT_Fieldref_info {
    u1 tag; // The tag item of a CONSTANT_Fieldref_info structure has the value CONSTANT_Fieldref (9).
    u2 class_index;
    u2 name_and_type_index;
}

CONSTANT_Methodref_info {
    u1 tag; // The tag item of a CONSTANT_Methodref_info structure has the value CONSTANT_Methodref (10).
    u2 class_index;
    u2 name_and_type_index;
}

CONSTANT_InterfaceMethodref_info {
    u1 tag; // The tag item of a CONSTANT_InterfaceMethodref_info structure has the value CONSTANT_InterfaceMethodref (11).
    u2 class_index;
    u2 name_and_type_index;
}
```
在本项目中分别用 
[ConstantFieldref.java](src/main/java/com/study/type/constant/ConstantFieldref.java)
[ConstantMethodref.java](src/main/java/com/study/type/constant/ConstantMethodref.java)
[ConstantInterfaceMethodref.java](src/main/java/com/study/type/constant/ConstantInterfaceMethodref.java)
来表示

### The CONSTANT_String_info Structure
根据 [4.4.3. The CONSTANT_String_info Structure](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.4.3) 中的描述
CONSTANT_String_info 的结构如下
```
CONSTANT_String_info {
    u1 tag; // The tag item of the CONSTANT_String_info structure has the value CONSTANT_String (8).
    u2 string_index;
}
```
在本项目中用 [ConstantString.java](src/main/java/com/study/type/constant/ConstantString.java) 来表示

## 字段表(Fields)
每个字段都由一个 field_info 来描述
根据 [4.5. Fields](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.5) 中的描述
field_info 的结构如下
```
field_info {
    u2             access_flags;
    u2             name_index;
    u2             descriptor_index;
    u2             attributes_count;
    attribute_info attributes[attributes_count];
}
```
在本项目中用 [FieldInfo.java](src/main/java/com/study/type/info/FieldInfo.java) 来表示

# 运行指南
javap 命令可以对 class 文件进行解析
例如我们可以使用如下命令对 xx.class 进行解析
```
javap -v -p xx.class
```
本项目的目标是输出内容与 `javap -v -p` 一致

## 比较完整结果
在本项目的顶层目录(即 [pom.xml](pom.xml) 所在目录)执行如下命令
```bash
./scripts/all.sh 'target/classes/com/study/parser/BasicParser.class'
```
就可以看到运行结果了

## 只比较常量池的解析结果
在本项目的顶层目录(即 [pom.xml](pom.xml) 所在目录)执行如下命令
```bash
./scripts/constantPool.sh 'target/classes/com/study/parser/BasicParser.class'   
```
就可以看到常量池的解析结果的比较了

# 其他
[Chapter 4. The class File Format](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html) 中详细描述了 class 文件的格式, 本项目中的代码从中收益良多.

如何通过 `mvn` 命令来运行 `main` 函数可以参考 [(stackoverflow) Maven Run Project](https://stackoverflow.com/questions/1089285/maven-run-project)