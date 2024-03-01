package com.study.present.attribute;

import com.study.io.CodeInputStream;
import com.study.parser.ParseResult;
import com.study.present.AbstractPresenter;
import com.study.type.ConstantPool;
import com.study.type.U1;
import com.study.type.info.attribute.CodeAttribute;
import com.study.type.instruction.AbstractCmd;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.Optional;

public class CodeAttributePresenter extends AbstractAttributePresenter<CodeAttribute> {

    public CodeAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, CodeAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        ConstantPool constantPool = result.getConstantPool();
        String headerLine = constantPool.desc(attribute.getAttributeNameIndex()) + ":";
        printStreamWrapper.printlnWithIndentLevel(headerLine, baseIndentLevel);
        String countInfo = String.format("stack=%s, locals=%s, args_size=%s",
                attribute.getMaxStack().toInt(),
                attribute.getMaxLocals().toInt(),
                calculateArgsSize(constantPool));

        printStreamWrapper.printlnWithIndentLevel(countInfo, baseIndentLevel + 1);
        InstructionsPresenter instructionsPresenter = new InstructionsPresenter(result, printStreamWrapper, attribute.getCode());
        instructionsPresenter.present();
    }

    private int calculateArgsSize(ConstantPool constantPool) {
        return attribute.getMethodInfo().calculateArgsSize(constantPool);
    }

    class InstructionsPresenter extends AbstractPresenter {

        private final List<U1> code;

        protected InstructionsPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, List<U1> code) {
            super(result, printStreamWrapper);
            this.code = code;
        }

        @Override
        public void doPresent() {
            ConstantPool constantPool = result.getConstantPool();
            CodeInputStream codeInputStream = new CodeInputStream(code);
            for (Pair<Integer, AbstractCmd> pair : codeInputStream) {
                int currentIndex = pair.getKey();
                AbstractCmd cmd = pair.getValue();
                String indexPart = buildIndexPart(currentIndex);
                String namePart = cmd.getName();
                switch (cmd.size()) {
                    case 1 ->
                            printStreamWrapper.printlnWithIndentLevel(String.format("%s: %s", indexPart, namePart), baseIndentLevel + 1);
                    case 2, 3, 5 -> {
                        Optional<String> operandDesc = cmd.operandDesc();
                        if (operandDesc.isPresent()) {
                            namePart = StringUtils.rightPad(namePart, 13);
                            Optional<String> detail = cmd.detail(constantPool);
                            if (detail.isPresent()) {
                                String temp =
                                        StringUtils.rightPad(
                                                String.format("%s %s", namePart, operandDesc.get()),
                                                33);
                                printStreamWrapper.printlnWithIndentLevel(
                                        String.format("%s: %s // %s",
                                                indexPart,
                                                temp,
                                                detail.get()
                                        ),
                                        baseIndentLevel + 1
                                );
                            } else {
                                printStreamWrapper.printlnWithIndentLevel(String.format("%s: %s %s", indexPart, namePart, operandDesc.get()), baseIndentLevel + 1);
                            }
                        } else {
                            printStreamWrapper.printlnWithIndentLevel("todo...??", baseIndentLevel + 1);
                        }
                    }
                    default -> printStreamWrapper.printlnWithIndentLevel("todo...", baseIndentLevel + 1);
                }
            }
        }

        private String buildIndexPart(int currentIndex) {
            return StringUtils.leftPad("" + currentIndex, 4, ' ');
        }
    }
}
