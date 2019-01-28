#!/bin/bash

# mvn compile
javap -v -p target/classes/com/study/parser/BasicParser.class | sed -n '/^Constant pool:$/,/^{$/p' | grep  '^ *#'
