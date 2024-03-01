package com.test.attribute.synthetic;

import org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * I found that it is not easy to find a class with the "Synthetic" attribute presented,
 * so I used ASM to generate such class.
 * I used {@link org.objectweb.asm.util.ASMifier} to help generate some content inside the main function
 */
public class Generator {

    private static final String SIMPLE_CLASS_NAME = "Generated";

    public static void main(String[] args) throws IOException {
        ClassWriter classWriter = new ClassWriter(0);
        FieldVisitor fieldVisitor;
        MethodVisitor methodVisitor;

        classWriter.visit(Opcodes.V1_4, Opcodes.ACC_PUBLIC | Opcodes.ACC_SUPER | Opcodes.ACC_ABSTRACT | Opcodes.ACC_SYNTHETIC, "com/generated/attribute/synthetic/" + SIMPLE_CLASS_NAME, null, "java/lang/Object", null);

        {
            fieldVisitor = classWriter.visitField(Opcodes.ACC_PRIVATE | Opcodes.ACC_SYNTHETIC, "fieldOne", "I", null, null);
            fieldVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(7, label0);
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
            methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            methodVisitor.visitInsn(Opcodes.RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", String.format("Lcom/generated/attribute/synthetic/%s;", SIMPLE_CLASS_NAME), null, label0, label1, 0);
            methodVisitor.visitMaxs(1, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(Opcodes.ACC_SYNTHETIC | Opcodes.ACC_ABSTRACT, "methodOne", "()V", null, null);
            methodVisitor.visitEnd();
        }

        String dirName = "src/test/resources/com/generated/attribute/synthetic";
        File file = new File(dirName);
        if (!file.exists()) {
            boolean result = file.mkdirs();
            if (result) {
                String message = String.format("dir: %s was created successfully", dirName);
                System.out.println(message);
            }
        }

        byte[] result = classWriter.toByteArray();
        try (FileOutputStream fileOutputStream = new FileOutputStream(String.format("%s/%s.class", dirName, SIMPLE_CLASS_NAME))) {
            fileOutputStream.write(result);
        }
    }
}
