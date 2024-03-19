package com.test.generator.instruction;

import org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * I found that it is not easy to find a class with the "dup2_x1" instruction presented,
 * so I tried with ASM to generate such class.
 * I used {@link org.objectweb.asm.util.ASMifier} to help generate some content inside the main function
 */
public class Dup2X1Generator {
    private static final String SIMPLE_CLASS_NAME = "Dup2X1Case";

//    public static void main(String[] args) throws IOException {
//        ASMifier.main(new String[]{"com.test.generator.instruction.A"});
//    }

    public static void main(String[] args) throws IOException {
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        FieldVisitor fieldVisitor;
        MethodVisitor methodVisitor;

        classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC | Opcodes.ACC_SUPER | Opcodes.ACC_SYNTHETIC, "com/generated/cases/method/instruction/" + SIMPLE_CLASS_NAME, null, "java/lang/Object", new String[]{"com/test/cases/method/instruction/InstructionAnalyzer"});

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
            methodVisitor.visitLocalVariable("this", String.format("Lcom/generated/cases/method/instruction/%s;", SIMPLE_CLASS_NAME), null, label0, label1, 0);
            methodVisitor.visitMaxs(0, 0);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "test_0x5d", "(III)V", null, null);
            {
                AnnotationVisitor annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/test/cases/method/instruction/Instruction;", true);
                annotationVisitor0.visit("value", 0x5d);
                annotationVisitor0.visit("name", "dup2_x1");
                annotationVisitor0.visitEnd();
            }
            methodVisitor.visitVarInsn(Opcodes.ILOAD, 1);
            methodVisitor.visitVarInsn(Opcodes.ILOAD, 2);
            methodVisitor.visitVarInsn(Opcodes.ILOAD, 3);
            methodVisitor.visitInsn(Opcodes.DUP2_X1);
            methodVisitor.visitInsn(Opcodes.POP);
            methodVisitor.visitInsn(Opcodes.POP);
            methodVisitor.visitInsn(Opcodes.POP);
            methodVisitor.visitInsn(Opcodes.POP);
            methodVisitor.visitInsn(Opcodes.POP);
            methodVisitor.visitInsn(Opcodes.RETURN);
            methodVisitor.visitMaxs(0, 0);
            methodVisitor.visitEnd();
        }

        String dirName = "src/test/resources/com/generated/cases/method/instruction";
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
