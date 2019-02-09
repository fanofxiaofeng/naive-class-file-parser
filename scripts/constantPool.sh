#!/bin/bash

# 请在本项目顶层目录(即与 `pom.xml` 处于同一目录时)执行本脚本

# usage:
# ./scripts/constantPool.sh ${the relative path to the class file}

# example:
# ./scripts/constantPool.sh 'target/classes/com/study/parser/ParseResult.class'

mvn compile
STANDARD_FILE='scripts/result/standard.txt'
OUTPUT_FILE='scripts/result/output.txt'
TEMP_FILE='scripts/result/temp.txt'

rm ${STANDARD_FILE} 2>/dev/null
rm ${OUTPUT_FILE} 2>/dev/null

printf '%-20s -> %s\n' '$1' $1
printf '%-20s -> %s\n' '${STANDARD_FILE}' ${STANDARD_FILE}
printf '%-20s -> %s\n' '${OUTPUT_FILE}' ${OUTPUT_FILE}
printf '%-20s -> %s\n' '${TEMP_FILE}' ${TEMP_FILE}

# 将 `javap` 命令输出的常量池信息输出至 `${STANDARD_FILE}` 中
javap -v -p $1 | sed -n '/^Constant pool:$/,/^{$/p' | grep  '^ *#' > ${STANDARD_FILE}

mvn compile exec:java -DthePath=$1

touch ${TEMP_FILE}
sed -n '/^Constant pool:$/,/^{$/p' ${OUTPUT_FILE} | grep '^ *#' > ${TEMP_FILE}
mv ${TEMP_FILE} ${OUTPUT_FILE}

echo "${STANDARD_FILE} 的行数(即 javap 命令解析出的常量池 entry 数): " "$(awk 'END{print NR}' ${STANDARD_FILE})"
echo "${OUTPUT_FILE} 的行数(即 本项目解析出的常量池 entry 数): " "$(awk 'END{print NR}' ${OUTPUT_FILE})"
echo 'diff 的结果如下'
diff ${STANDARD_FILE} ${OUTPUT_FILE}
