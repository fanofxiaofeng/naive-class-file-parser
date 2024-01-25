package com.study.util;

import com.study.constants.Const;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class PrintStreamWrapper {

    private final PrintStream printStream;

    private int printlnCount;

    public PrintStreamWrapper(String fileName) throws FileNotFoundException {
        this(new PrintStream(fileName));
    }

    public PrintStreamWrapper(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void println(char c) {
        printStream.println(c);
        printlnCount++;
    }

    public void println(String content) {
        printStream.println(content);
        printlnCount++;
    }

    public void print(String content) {
        printStream.print(content);
    }

    public void println() {
        printStream.println();
        printlnCount++;
    }

    public void printlnWithIndentLevel(String content, int indentLevel) {
        printStream.print(" ".repeat(Const.INDENT_FOR_EACH_LEVEL * indentLevel));
        println(content);
    }

    public void printWithIndentLevel(String content, int indentLevel) {
        printStream.print(" ".repeat(Const.INDENT_FOR_EACH_LEVEL * indentLevel));
        print(content);
    }

    public void batchPrintln(List<String> contents) {
        String joinedResult = String.join(System.lineSeparator(), contents);
        printStream.println(joinedResult);
        printlnCount += contents.size();
    }

    public int getPrintlnCount() {
        return printlnCount;
    }
}
