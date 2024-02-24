#!/bin/bash

# Please run this script in the root directory of this project

# usage:
# ./scripts/fields.sh ${the relative path to the class file}

# example:
# ./scripts/fields.sh 'target/classes/com/study/parser/ParseResult.class'

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

# 将 `javap` 命令输出的 fields 信息输出至 `scripts/result/standard.txt` 中
javap -v -p $1 | sed -n '/^{$/,/);/p' | sed -e '1d' -e '$d' | sed '$d' > ${STANDARD_FILE}

mvn compile exec:java -DthePath=$1

sed -n '/^{$/,/);/p' scripts/result/output.txt | sed -e '1d' -e '$d' | sed '$d' > ${TEMP_FILE}
mv ${TEMP_FILE} ${OUTPUT_FILE}

echo "${STANDARD_FILE} 的行数: " "$(awk 'END{print NR}' ${STANDARD_FILE})"
echo "${OUTPUT_FILE} 的行数: " "$(awk 'END{print NR}' ${OUTPUT_FILE})"
echo 'diff 的结果如下'
diff ${STANDARD_FILE} ${OUTPUT_FILE}