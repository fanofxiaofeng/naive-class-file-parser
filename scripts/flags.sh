#!/bin/bash
# 请在本项目顶层目录(即与 `pom.xml` 处于同一目录时)执行本脚本

mvn compile

rm result/standard.txt 2>/dev/null
rm result/output.txt 2>/dev/null

# 将 `javap` 命令输出的 flags 信息输出至 `scripts/result/standard.txt` 中
javap -v -p target/classes/com/study/parser/Toy.class | sed -n '/flags/,/Constant/p' | sed -n '1p' > scripts/result/standard.txt

mvn compile exec:java
touch scripts/result/temp.txt
sed -n '/flags/,/Constant/p' scripts/result/output.txt | sed -n '1p' > scripts/result/temp.txt
mv scripts/result/temp.txt scripts/result/output.txt

echo 'diff 的结果如下'
diff scripts/result/standard.txt scripts/result/output.txt