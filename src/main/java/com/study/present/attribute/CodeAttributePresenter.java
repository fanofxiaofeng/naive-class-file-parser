package com.study.present.attribute;

import com.study.io.CodeInputStream;
import com.study.parser.ParseResult;
import com.study.present.AbstractPresenter;
import com.study.present.Presenter;
import com.study.present.instruction.DelegateInstructionPresenter;
import com.study.type.ConstantPool;
import com.study.type.U1;
import com.study.type.info.attribute.CodeAttribute;
import com.study.type.instruction.AbstractInstruction;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class CodeAttributePresenter extends AbstractAttributePresenter<CodeAttribute> {

    public CodeAttributePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, CodeAttribute attribute, int baseIndentLevel) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine();

        ConstantPool constantPool = result.getConstantPool();
        String countInfo = String.format("stack=%s, locals=%s, args_size=%s",
                attribute.getMaxStack().toInt(),
                attribute.getMaxLocals().toInt(),
                calculateArgsSize(constantPool));

        printStreamWrapper.printlnWithIndentLevel(countInfo, baseIndentLevel + 1);
        InstructionsPresenter instructionsPresenter = new InstructionsPresenter(result, printStreamWrapper, attribute.getCode());
        instructionsPresenter.present();

        ExceptionTablePresenter exceptionTablePresenter = new ExceptionTablePresenter(result, printStreamWrapper, attribute.getExceptionTableList());
        exceptionTablePresenter.present();

        attribute.getAttributes().forEach(attributeInfo -> {
            Presenter presenter =
                    AbstractAttributePresenter.build(
                            result,
                            printStreamWrapper,
                            attributeInfo,
                            baseIndentLevel + 1
                    );
            presenter.present();
        });
    }

    private int calculateArgsSize(ConstantPool constantPool) {
        return attribute.getMethodInfo().calculateArgsSize(constantPool);
    }

    static class ExceptionTablePresenter extends AbstractPresenter {

        private final List<CodeAttribute.ExceptionTable> exceptionTableList;

        private ExceptionTablePresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, List<CodeAttribute.ExceptionTable> exceptionTableList) {
            super(result, printStreamWrapper);
            this.exceptionTableList = exceptionTableList;
        }

        @Override
        public void doPresent() {
            if (exceptionTableList.isEmpty()) {
                return;
            }

            printStreamWrapper.printlnWithIndentLevel("Exception table:", 3);
            printStreamWrapper.printlnWithIndentLevel("   from    to  target type", 3);
            ConstantPool constantPool = result.getConstantPool();
            exceptionTableList.forEach(exceptionTable -> {
                String classDesc = (exceptionTable.catchType().toInt() == 0) ?
                        "any" :
                        ("Class " + constantPool.detail(exceptionTable.catchType()));
                printStreamWrapper.printlnWithIndentLevel(
                        String.format("   %s %s %s   %s",
                                StringUtils.leftPad("" + exceptionTable.startPc().toInt(), 5),
                                StringUtils.leftPad("" + exceptionTable.endPc().toInt(), 5),
                                StringUtils.leftPad("" + exceptionTable.handlerPc().toInt(), 5),
                                classDesc
                        ), 3);
            });
        }
    }

    static class InstructionsPresenter extends AbstractPresenter {

        private final List<U1> code;

        protected InstructionsPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, List<U1> code) {
            super(result, printStreamWrapper);
            this.code = code;
        }

        @Override
        public void doPresent() {
            CodeInputStream codeInputStream = new CodeInputStream(code);
            for (AbstractInstruction instruction : codeInputStream) {
                new DelegateInstructionPresenter(result, printStreamWrapper, instruction).present();
            }
        }
    }
}
