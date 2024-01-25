package com.study.constants;

public class Abc {
    //    @I2
//    @I3
//    @I4
    @Deprecated
//    @I5
//    @I6
//    @I7
//    @I8
//    @I9
//    @I10
//    @I11
//    @III(v1 = 13L, v2 = 25, v3 = 35.7F, v4 = "walo")
    @Some(
            f = 234,
            b = (byte) 1,
            ch = 'a',
//            n = 63,
            data = {2, 49, 37},
            s = "\"Hello world\"",
            c = Abc.class,
            caf = ClassAccessFlags.ACC_ENUM,
            iiis = {
                    @III(v1 = 30L, v2 = 20, v3 = 10.03F, v4 = "v4..."),
                    @III(v1 = 30L, v2 = 20, v3 = 10.03F, v4 = "v4..."),
                    @III(v1 = 30L, v2 = 20, v3 = 10.03F, v4 = "v4..."),
            },
            iii = @III(v1 = 30L, v2 = 20, v3 = 10.03F, v4 = "v4..."),
            cafs = {ClassAccessFlags.ACC_ENUM, ClassAccessFlags.ACC_ANNOTATION, ClassAccessFlags.ACC_MODULE},
            cs = {Object.class, String.class, Integer.class}
//            , i2 = @I2, i2s = {@I2, @I2}
    )
    public static void main(String[] args) {

    }

    private static final int a = 42;

    private static final String s = "99";
}
