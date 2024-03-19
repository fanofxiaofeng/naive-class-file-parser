package com.test.generator.instruction;

import com.test.annotations.GeneratedBy;
import org.apache.commons.lang3.StringUtils;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TableSwitchGenerator {
    public static void main(String[] args) throws FileNotFoundException {
        String pathname = "src/test/java/com/test/cases/method/instruction";
        String outputClassName = "TableSwitchInstructionSpecialCase";

        StringBuilder builder = new StringBuilder();
        builder.append(String.format("package %s;%n", StringUtils.removeStart(String.format("%s", pathname), "src/test/java/").replace('/', '.')));
        builder.append(System.lineSeparator());
        builder.append(String.format("import %s;%n", GeneratedBy.class.getCanonicalName()));
        builder.append(String.format("import %s;%n", TableSwitchGenerator.class.getCanonicalName()));
        builder.append(System.lineSeparator());
        builder.append(String.format("@GeneratedBy(%s.class)%n", TableSwitchGenerator.class.getSimpleName()));
        builder.append(String.format("public class TableSwitchInstructionSpecialCase implements InstructionAnalyzer {%n"));
        builder.append(String.format("    @Instruction(value = 0xaa, name = \"tableswitch\")%n"));
        builder.append(String.format("    public void test(int number) {%n"));
        builder.append(String.format("        int answer = switch (number) {%n"));

        int ratio = 10;
        int delta = -10100;
        for (int i = 0; i <= 10; i++) {
            String s = IntStream.range(i * ratio + delta, (i + 1) * ratio + delta).filter(e -> e % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining(", "));
            builder.append(String.format("            case %s -> %s;%n", s, i));
        }
        builder.append(String.format("            default -> -1;%n"));
        builder.append(String.format("        };%n"));
        builder.append(String.format("    }%n"));
        builder.append(String.format("}%n"));
        System.out.println(builder);

        String outputFileName = String.format("%s/%s.java", pathname, outputClassName);
        try (PrintStream printStream = new PrintStream(outputFileName)) {
            printStream.print(builder);
        }
    }
}
