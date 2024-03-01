package com.test.presenter.cp.case10;

import com.study.constants.ConstantKind;
import com.test.annotations.ExpectedConstantKind;
import com.test.annotations.GeneratedBy;
import com.test.presenter.cp.ConstantPoolPresenterTestBase;
import com.test.presenter.cp.ConstantPoolTestGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(ConstantPoolTestGenerator.class)
public class EnumCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Methodref)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #11 = Methodref          #12.#13       // java/lang/Object.\"<init>\":()V",
                "   #20 = Methodref          #21.#22       // java/lang/System.identityHashCode:(Ljava/lang/Object;)I",
                "   #28 = Methodref          #26.#13       // java/lang/CloneNotSupportedException.\"<init>\":()V",
                "   #29 = Methodref          #12.#30       // java/lang/Object.getClass:()Ljava/lang/Class;",
                "   #33 = Methodref          #2.#34        // java/lang/Enum.getDeclaringClass:()Ljava/lang/Class;",
                "   #38 = Methodref          #36.#13       // java/lang/ClassCastException.\"<init>\":()V",
                "   #39 = Methodref          #40.#41       // java/lang/Class.getSuperclass:()Ljava/lang/Class;",
                "   #44 = Methodref          #40.#45       // java/lang/Class.describeConstable:()Ljava/util/Optional;",
                "   #52 = Methodref          #53.#54       // java/util/Optional.map:(Ljava/util/function/Function;)Ljava/util/Optional;",
                "   #58 = Methodref          #40.#59       // java/lang/Class.enumConstantDirectory:()Ljava/util/Map;",
                "   #72 = Methodref          #68.#73       // java/lang/NullPointerException.\"<init>\":(Ljava/lang/String;)V",
                "   #79 = Methodref          #77.#13       // java/lang/StringBuilder.\"<init>\":()V",
                "   #82 = Methodref          #77.#83       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #86 = Methodref          #40.#87       // java/lang/Class.getCanonicalName:()Ljava/lang/String;",
                "   #92 = Methodref          #77.#93       // java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "   #95 = Methodref          #75.#73       // java/lang/IllegalArgumentException.\"<init>\":(Ljava/lang/String;)V",
                "  #100 = Methodref          #96.#73       // java/io/InvalidObjectException.\"<init>\":(Ljava/lang/String;)V",
                "  #101 = Methodref          #2.#102       // java/lang/Enum.compareTo:(Ljava/lang/Enum;)I",
                "  #105 = Methodref          #106.#107     // java/lang/Enum$EnumDesc.of:(Ljava/lang/constant/ClassDesc;Ljava/lang/String;)Ljava/lang/Enum$EnumDesc;",
                "  #187 = Methodref          #2.#188       // java/lang/Enum.lambda$describeConstable$0:(Ljava/lang/constant/ClassDesc;)Ljava/lang/Enum$EnumDesc;",
                "  #191 = Methodref          #192.#193     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"
        );
    }
}
