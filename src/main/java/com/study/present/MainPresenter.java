package com.study.present;

import com.study.constants.ClassAccessFlags;
import com.study.constants.PresentKind;
import com.study.parser.ParseResult;
import com.study.type.ConstantPool;
import com.study.type.U2;
import com.study.util.PrintStreamWrapper;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Set;
import java.util.StringJoiner;

import static com.study.constants.Const.MAGIC_NUMBER;

public class MainPresenter extends AbstractPresenter {

    private final Set<PresentKind> presentKinds;

    private static final int DEFAULT_INDENT_LEVEL = 1;

    public MainPresenter(ParseResult result, PrintStreamWrapper printStreamWrapper, Set<PresentKind> presentKinds) {
        super(result, printStreamWrapper);
        this.presentKinds = presentKinds;
    }

    @Override
    public void doPresent() {
        if (!result.getMagic().toString().equals(MAGIC_NUMBER)) {
            throw new AssertionError("Magic number is not as expected!");
        }

        if (presentKinds.contains(PresentKind.HEADER)) {
            presentHeader();
        }

        if (presentKinds.contains(PresentKind.VERSION)) {
            presentVersion();
        }

        if (presentKinds.contains(PresentKind.ACCESS_FLAGS)) {
            presentAccessFlags();
        }

        if (presentKinds.contains(PresentKind.THIS_CLASS)) {
            presentThisClass();
        }

        if (presentKinds.contains(PresentKind.SUPER_CLASS)) {
            presentSuperClass();
        }

        if (presentKinds.contains(PresentKind.COUNT)) {
            presentCount();
        }

        if (presentKinds.contains(PresentKind.CONSTANT_POOL)) {
            presentConstantPool();
        }

        printStreamWrapper.println('{');

        int cnt = 0;
        if (presentKinds.contains(PresentKind.FIELDS)) {
            cnt += presentFields();
        }

        if (presentKinds.contains(PresentKind.METHODS)) {
            // If some fields have been presented, we need to print a line before presenting methods
            if (cnt > 0 && !result.getMethods().items().isEmpty()) {
                printStreamWrapper.println();
            }
            presentMethods();
        }
        printStreamWrapper.println('}');

        if (presentKinds.contains(PresentKind.ATTRIBUTES)) {
            presentAttributes();
        }
    }

    private void presentHeader() {
        new ClassFileHeaderLinePresenter(result, printStreamWrapper).present();
    }

    private void presentVersion() {
        presentVersion(result.getMinorVersion(), "minor version");
        presentVersion(result.getMajorVersion(), "major version");
    }

    private void presentVersion(U2 version, String name) {
        String message = String.format("%s: %s", name, version.toInt());
        printStreamWrapper.printlnWithIndentLevel(message, DEFAULT_INDENT_LEVEL);
    }

    private void presentAccessFlags() {
        StringBuilder stringBuilder = new StringBuilder();

        U2 accessFlags = result.getAccessFlags();

        String message = String.format("flags: (0x%04x)", accessFlags.toInt());
        stringBuilder.append(message);

        StringJoiner joiner = new StringJoiner(", ");
        Arrays.stream(ClassAccessFlags.values()).
                filter(item -> accessFlags.isOn(item.getFlag())).
                forEach(item -> joiner.add(item.toString()));
        if (joiner.length() > 0) {
            stringBuilder.append(' ');
            stringBuilder.append(joiner);
        }

        printStreamWrapper.printlnWithIndentLevel(stringBuilder.toString(), DEFAULT_INDENT_LEVEL);
    }

    private void presentThisClass() {
        presentSomeClass(result.getThisClass(), "this_class");
    }

    private void presentSuperClass() {
        U2 superClass = result.getSuperClass();
        // note: "java.lang.Object" has no super class
        if (superClass.toInt() == 0) {
            printStreamWrapper.printlnWithIndentLevel("super_class: #0", DEFAULT_INDENT_LEVEL);
            return;
        }
        presentSomeClass(result.getSuperClass(), "super_class");
    }

    private void presentSomeClass(U2 someClass, String name) {
        String mainPart = String.format("%s: #%s", name, someClass.toInt());

        String padded = StringUtils.rightPad(mainPart, 39);

        ConstantPool constantPool = result.getConstantPool();
        String detail = constantPool.detail(someClass);

        String content = String.format("%s // %s", padded, detail);
        printStreamWrapper.printlnWithIndentLevel(content, DEFAULT_INDENT_LEVEL);
    }

    private void presentCount() {
        String content = String.format("interfaces: %d, fields: %d, methods: %d, attributes: %d",
                result.getInterfaces().size(),
                result.getFields().getCount(),
                result.getMethods().getCount(),
                result.getAttributes().getCount());

        printStreamWrapper.printlnWithIndentLevel(content, DEFAULT_INDENT_LEVEL);
    }

    private void presentConstantPool() {
        new ConstantPoolPresenter(result, printStreamWrapper).present();
    }

    private int presentFields() {
        return new FieldsPresenter(result, printStreamWrapper).present();
    }

    private void presentMethods() {
        new MethodsPresenter(result, printStreamWrapper).present();
    }

    private void presentAttributes() {
        new AttributesPresenter(result, printStreamWrapper).present();
    }
}