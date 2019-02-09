#!/bin/bash

# 请在本项目顶层目录(即与 `pom.xml` 处于同一目录时)执行本脚本

# usage:
# ./scripts/all.sh ${the relative path to the class file}

# example:
# ./scripts/all.sh 'target/classes/com/study/parser/ParseResult.class'

mvn compile
# javap 命令的运行结果输出至此文件
STANDARD_FILE='scripts/result/standard.txt'

# 本项目的运行结果输出至此文件
OUTPUT_FILE='scripts/result/output.txt'

rm ${STANDARD_FILE} 2>/dev/null
rm ${OUTPUT_FILE} 2>/dev/null

printf '%-20s -> %s\n' '$1' $1
printf '%-20s -> %s\n' '${STANDARD_FILE}' ${STANDARD_FILE}
printf '%-20s -> %s\n' '${OUTPUT_FILE}' ${OUTPUT_FILE}

# 将 `javap` 命令输出的常量池信息输出至 `${STANDARD_FILE}` 中
javap -v -p $1 > ${STANDARD_FILE}

mvn compile exec:java -DthePath=$1

echo 'diff 的结果如下'
diff ${STANDARD_FILE} ${OUTPUT_FILE}
# echo 'comm 的结果如下'
# comm ${STANDARD_FILE} ${OUTPUT_FILE}