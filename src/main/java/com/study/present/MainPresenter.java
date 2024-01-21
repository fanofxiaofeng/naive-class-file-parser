package com.study.present;

import com.study.constants.PresentKind;
import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.util.PaddingUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.PrintStream;
import java.util.*;

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

        if (presentKinds.contains(PresentKind.COUNT)) {
            showCount();
        }

        if (presentKinds.contains(PresentKind.CONSTANT_POOL)) {
            new ConstantPoolPresenter(result, printStream).present();
        }

        printStream.println('{');

        if (presentKinds.contains(PresentKind.FIELDS)) {
            showFields();
        }
//        if (fieldsCount.toInt() > 0 && methodsCount.toInt() > 0) {
//            printStream.println();
//        }

//        showMethods();

//        showAttributes();
        printStream.println('}');
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
        stringBuilder.append(message);
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

        String result = PaddingUtils.prepend(stringBuilder.toString(), DEFAULT_LEFT_PADDING_CNT);
        printStream.println(result);
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
                        PaddingUtils.prepend(mainPart, DEFAULT_LEFT_PADDING_CNT),
                        42
                );

        ConstantPool constantPool = result.getConstantPool();
        Optional<String> detail = constantPool.detail(someClass);

        if (detail.isEmpty()) {
            throw new IllegalArgumentException();
        }

        String content = String.format("%s// %s", padded, detail.get());
        printStream.println(content);
    }


    private void showCount() {
        String content = String.format("interfaces: %d, fields: %d, methods: %d, attributes: %d",
                result.getInterfacesCount().toInt(),
                result.getFields().fieldsCount().toInt(),
                result.getMethodsCount().toInt(),
                result.getAttributesCount().toInt());

        printStream.println(PaddingUtils.prepend(content, DEFAULT_LEFT_PADDING_CNT));
    }

    private void showFields() {
        new FieldsPresenter(result, printStream).present();
    }
}

