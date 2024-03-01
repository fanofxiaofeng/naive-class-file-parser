# Class file structure
According to [4.1. The ClassFile Structure](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.1), 
class file has the following structure.

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

In this project, we use [ParseResult.java](src/main/java/com/study/parser/ParseResult.java) to save the parse result of class files. 

## The Constant Pool
### The CONSTANT_Class_info Structure
According to [4.4.1. The CONSTANT_Class_info Structure](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.4.1),
the structure of `CONSTANT_Class_info` is
```
CONSTANT_Class_info {
    u1 tag; // The tag item has the value CONSTANT_Class (7).
    u2 name_index;
}
```

We use [ConstantClass.java](src/main/java/com/study/type/constant/compound/ConstantClass.java) to save this structure.

### The CONSTANT_Fieldref_info, CONSTANT_Methodref_info, and CONSTANT_InterfaceMethodref_info Structures
According to [4.4.2. The CONSTANT_Fieldref_info, CONSTANT_Methodref_info, and CONSTANT_InterfaceMethodref_info Structures](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.4.2)
the structure of `CONSTANT_Fieldref_info`, `CONSTANT_Methodref_info`, `CONSTANT_InterfaceMethodref_info` can be seen as follows.

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

We use the following class to represent the corresponding structures.
[ConstantFieldref.java](src/main/java/com/study/type/constant/compound/ConstantFieldref.java)
[ConstantMethodref.java](src/main/java/com/study/type/constant/compound/ConstantMethodref.java)
[ConstantInterfaceMethodref.java](src/main/java/com/study/type/constant/compound/ConstantInterfaceMethodref.java)

### The CONSTANT_String_info Structure
According to [4.4.3. The CONSTANT_String_info Structure](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.4.3),

the structure of `CONSTANT_String_info` is
```
CONSTANT_String_info {
    u1 tag; // The tag item of the CONSTANT_String_info structure has the value CONSTANT_String (8).
    u2 string_index;
}
```

We use [ConstantString.java](src/main/java/com/study/type/constant/compound/ConstantString.java) for it.

## Fields
Each field is represented by `field_info`.
According to [4.5. Fields](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-4.html#jvms-4.5),
the structure of `field_info` is
```
field_info {
    u2             access_flags;
    u2             name_index;
    u2             descriptor_index;
    u2             attributes_count;
    attribute_info attributes[attributes_count];
}
```

We use [FieldInfo.java](src/main/java/com/study/type/info/FieldInfo.java) for it.

# How to run
`javap` command can parse class files.

For example, we can run the following command to parse `xxx.class`
```
javap -v -p xxx.class
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