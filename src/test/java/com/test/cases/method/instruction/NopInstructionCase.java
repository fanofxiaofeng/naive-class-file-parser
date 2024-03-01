package com.test.cases.method.instruction;


import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.FileOutputStream;
import java.io.IOException;

public class NopInstructionCase {
    public static void main(String[] args) throws IOException {
        ClassWriter classWriter = new ClassWriter(0);
        classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "com/test/cases/method/instruction/NopContainer", null, "java/lang/Object", new String[]{});
        MethodVisitor methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "theMethod", "()V", null, null);
        methodVisitor.visitCode();
        methodVisitor.visitInsn(Opcodes.NOP);
        methodVisitor.visitMaxs(0, 1);
        methodVisitor.visitEnd();
        classWriter.visitEnd();

        byte[] result = classWriter.toByteArray();
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/test/java/com/test/cases/method/instruction/NopContainer.class")) {
            fileOutputStream.write(result);
        }
    }
}
