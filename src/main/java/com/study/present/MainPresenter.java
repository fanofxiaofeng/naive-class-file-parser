package com.study.present;

import com.study.constants.PresentKind;
import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;

import java.io.PrintStream;
import java.util.EnumSet;
import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;

import com.study.type.constant.*;
import com.study.util.Extend;
import com.study.util.PaddingUtils;
import org.apache.commons.lang3.StringUtils;

import static com.study.constants.Const.MAGIC_NUMBER;

public class MainPresenter extends AbstractPresenter {

    public MainPresenter(ParseResult result, PrintStream printStream) {
        super(result, printStream);
    }

    @Override
    public void present() {
        present(EnumSet.allOf(PresentKind.class));
    }

    public void present(EnumSet<PresentKind> presentKinds) {
        if (!result.getMagic().toString().equals(MAGIC_NUMBER)) {
            throw new AssertionError("Magic number is not as expected!");
        }

        if (presentKinds.contains(PresentKind.VERSION)) {
            showVersion();
        }

        if (presentKinds.contains(PresentKind.ACCESS_FLAGS)) {
            showAccessFlags();
        }

        if (presentKinds.contains(PresentKind.THIS_CLASS)) {
            showThisClass();
        }

        if (presentKinds.contains(PresentKind.SUPER_CLASS)) {
            showSuperClass();
        }


//        showCount();

        if (presentKinds.contains(PresentKind.CONSTANT_POOL)) {
            new ConstantPoolPresenter(result, printStream).present();
        }

        printStream.println('{');

//        showFields();

//        if (fieldsCount.toInt() > 0 && methodsCount.toInt() > 0) {
//            printStream.println();
//        }

//        showMethods();

//        showAttributes();
    }

    private void showVersion() {
        showVersion(result.getMinorVersion(), "minor version");
        showVersion(result.getMajorVersion(), "major version");
    }

    private void showVersion(U2 version, String name) {
        String message = String.format("%s: %s", name, version.toInt());
        printStream.println(PaddingUtils.prepend(message, DEFAULT_LEFT_PADDING_CNT));
    }

    private static final Map<Integer, String> map = new TreeMap<>() {
        {
            put(0x0001, "ACC_PUBLIC");
            put(0x0010, "ACC_FINAL");
            put(0x0020, "ACC_SUPER");
            put(0x0200, "ACC_INTERFACE");
            put(0x0400, "ACC_ABSTRACT");
            put(0x1000, "ACC_SYNTHETIC");
            put(0x2000, "ACC_ANNOTATION");
            put(0x4000, "ACC_ENUM");
        }
    };

    private void showAccessFlags() {
        StringBuilder stringBuilder = new StringBuilder();
        U2 accessFlags = result.getAccessFlags();
        String message = String.format("flags: (0x%04x)", accessFlags.toInt());
        stringBuilder.append(StringUtils.leftPad(message, DEFAULT_LEFT_PADDING_CNT));
        StringJoiner joiner = new StringJoiner(", ");

        map.forEach((key, value) -> {
            if (accessFlags.isOn(key)) {
                joiner.add(value);
            }
        });

        if (joiner.length() > 0) {
            stringBuilder.append(' ');
            stringBuilder.append(joiner);
        }
        printStream.println(stringBuilder);
    }

    private void showThisClass() {
        showSomeClass(result.getThisClass(), "this_class");
    }

    private void showSuperClass() {
        showSomeClass(result.getSuperClass(), "super_class");
    }

    private void showSomeClass(U2 someClass, String name) {
        String mainPart = String.format("%s: #%d", name, someClass.toInt());

        String padded =
                StringUtils.rightPad(
                        StringUtils.leftPad(mainPart, mainPart.length() + DEFAULT_LEFT_PADDING_CNT),
                        42
                );
        StringBuilder builder = new StringBuilder();
        builder.append(padded);
        builder.append("// ");
        builder.append(result.getConstantPool().get(someClass).detail());

        printStream.println(builder);
    }

    private void showConstantPool() {
        printStream.println("Constant pool:");

        ConstantPool constantPool = result.getConstantPool();
        int count = constantPool.getCount().toInt();

        int index = 1;
        while (index < count) {
            // "  #42" 这种格式的字符串(leading whitespace 的数量是计算出来的)
            AbstractConstant constant = constantPool.get(index);
            constant.validate();

            StringBuilder stringBuilder = new StringBuilder();
            String format = withThreeWidthControl();
            stringBuilder.append(String.format(format, "#" + index, constant.getTag().getType(), constant.desc()));
            if (hasDetail(constant)) {
                Extend.extendTo(stringBuilder, 42);
                stringBuilder.append("// ").append(constant.detail());
            }

            rightTrim(stringBuilder);
            printStream.println(stringBuilder);

            if (occupyOneSlot(constant)) {
                index++;
            } else {
                index += 2;
            }
        }
    }

    // todo 类型可能有遗漏
    private boolean hasDetail(AbstractConstant constant) {
        return
                (constant instanceof ConstantMethodref) ||
                        (constant instanceof ConstantFieldref) ||
                        (constant instanceof ConstantNameAndType) ||
                        (constant instanceof ConstantString) ||
                        (constant instanceof ConstantClass) ||
                        (constant instanceof ConstantInterfaceMethodref)
                ;
    }

    private String withThreeWidthControl() {
        int count = result.getConstantPool().getCount().toInt();
        int width = String.format("  #%d", count).length();

        // partOneControl 是类似于 "%5s" 这样的字符串
        String partOneControl = String.format("%%%ds", width);
        String partTwoControl = "%-19s";
        String partThreeControl = "%s";
        return String.format("%s = %s%s", partOneControl, partTwoControl, partThreeControl);
    }

    private boolean occupyOneSlot(AbstractConstant constant) {
        return !(constant instanceof ConstantDouble) &&
                !(constant instanceof ConstantLong);
    }

    /**
     * 删除右边的 whitespace, 逻辑参考了 {@link String#trim()}
     *
     * @param stringBuilder 要对它进行操作
     */
    private void rightTrim(StringBuilder stringBuilder) {
        while (stringBuilder.charAt(stringBuilder.length() - 1) <= ' ') {
            stringBuilder = stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}

