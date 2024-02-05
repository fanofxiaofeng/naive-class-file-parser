package com.study.present.attribute;

import com.study.constants.NestedClassAccessFlags;
import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.type.info.attribute.InnerClassesAttribute;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.function.Predicate;

public class InnerClassesAttributePresenter extends AbstractAttributePresenter<InnerClassesAttribute> {

    private static final int FIXED_WIDTH = 40;

    private static final Set<NestedClassAccessFlags> skippedFlags = EnumSet.of(
            NestedClassAccessFlags.ACC_INTERFACE,
            NestedClassAccessFlags.ACC_ANNOTATION,
            NestedClassAccessFlags.ACC_ENUM
    );

    public InnerClassesAttributePresenter(ParseResult result,
                                          PrintStreamWrapper printStreamWrapper,
                                          InnerClassesAttribute attribute,
                                          int baseIndentLevel
    ) {
        super(result, printStreamWrapper, attribute, baseIndentLevel);
    }

    @Override
    public void doPresent() {
        presentHeaderLine();
        presentDetails();
    }

    private void presentDetails() {
        attribute.getClasses().forEach(innerClass -> {
            String desc = buildDesc(innerClass);
            String details = buildDetails(innerClass);
            String combined;
            if (desc.length() < FIXED_WIDTH) {
                combined = String.format("%s// %s",
                        StringUtils.rightPad(desc, FIXED_WIDTH),
                        details
                );
            } else {
                combined = String.format("%s// %s",
                        desc + " ",
                        details
                );
            }
            printStreamWrapper.printlnWithIndentLevel(combined, baseIndentLevel + 1);
        });
    }

    private String buildDetails(InnerClassesAttribute.InnerClass innerClass) {
        U2 innerNameIndex = innerClass.getInnerNameIndex();
        U2 innerClassInfoIndex = innerClass.getInnerClassInfoIndex();
        U2 outerClassInfoIndex = innerClass.getOuterClassInfoIndex();

        ConstantPool constantPool = result.getConstantPool();
        if (innerNameIndex.toInt() == 0 && outerClassInfoIndex.toInt() == 0) {
            return "class " + constantPool.detail(innerClassInfoIndex);
        }

        if (outerClassInfoIndex.toInt() == 0) {
            return String.format("%s=class %s",
                    constantPool.desc(innerNameIndex),
                    constantPool.detail(innerClassInfoIndex)
            );
        }

        return String.format("%s=class %s of class %s",
                constantPool.desc(innerNameIndex),
                constantPool.detail(innerClassInfoIndex),
                constantPool.detail(outerClassInfoIndex)
        );
    }

    private String buildDesc(InnerClassesAttribute.InnerClass innerClass) {
        String accessFlagsDesc = buildAccessFlagsDesc(innerClass.getInnerClassAccessFlags());
        String indexDesc = buildIndexDesc(innerClass);

        if (accessFlagsDesc.isEmpty()) {
            return indexDesc + ";";
        }

        return String.format("%s %s;", accessFlagsDesc, indexDesc);
    }

    private String buildIndexDesc(InnerClassesAttribute.InnerClass innerClass) {
        U2 innerNameIndex = innerClass.getInnerNameIndex();
        U2 innerClassInfoIndex = innerClass.getInnerClassInfoIndex();
        U2 outerClassInfoIndex = innerClass.getOuterClassInfoIndex();

        if (innerNameIndex.toInt() == 0 && outerClassInfoIndex.toInt() == 0) {
            return String.format("#%s", innerClassInfoIndex.toInt());
        }

        if (outerClassInfoIndex.toInt() == 0) {
            return String.format("#%s= #%s", innerNameIndex.toInt(), innerClassInfoIndex.toInt());
        }

        return String.format("#%s= #%s of #%s",
                innerNameIndex.toInt(),
                innerClassInfoIndex.toInt(),
                outerClassInfoIndex.toInt()
        );
    }

    private String buildAccessFlagsDesc(U2 innerClassAccessFlags) {
        Predicate<NestedClassAccessFlags> predicate = nestedClassAccessFlags -> nestedClassAccessFlags == NestedClassAccessFlags.ACC_ABSTRACT &&
                (innerClassAccessFlags.isOn(NestedClassAccessFlags.ACC_INTERFACE.getFlag()) ||
                        innerClassAccessFlags.isOn(NestedClassAccessFlags.ACC_ANNOTATION.getFlag()));

        List<String> descriptions = new ArrayList<>();
        Arrays.stream(NestedClassAccessFlags.values()).
                filter(accessFlag -> innerClassAccessFlags.isOn(accessFlag.getFlag())).
                filter(attribute -> predicate.negate().test(attribute)).
                filter(attribute -> !skippedFlags.contains(attribute)).
                forEach(accessFlag -> descriptions.add(accessFlag.getSimpleName()));
        return String.join(" ", descriptions);
    }


    private void presentHeaderLine() {
        String attributeName = result.getConstantPool().desc(attribute.getAttributeNameIndex());
        printStreamWrapper.printlnWithIndentLevel(String.format("%s:", attributeName), baseIndentLevel);
    }
}
