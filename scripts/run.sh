#!/bin/bash

mvn compile exec:java -Dexec.mainClass="com.study.parser.Main" -Dexec.args="target/classes/com/study/parser/Toy.class"
