#!/bin/bash
# 请在本项目顶层目录(即与 `pom.xml` 处于同一目录时)执行本脚本

mvn compile

rm result/standard.txt 2>/dev/null
rm result/output.txt 2>/dev/null

# 将 `javap` 命令输出的常量池信息输出至 `scripts/result/standard.txt` 中
javap -v -p target/classes/com/study/parser/Toy.class > scripts/result/standard.txt

mvn compile exec:java

echo 'diff 的结果如下'
diff scripts/result/standard.txt scripts/result/output.txt