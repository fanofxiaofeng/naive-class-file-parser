package com.test.presenter.cp.caseAll;

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
public class OptionalIntCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.OptionalInt"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Fieldref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Methodref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_InterfaceMethodref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_String)
    @ExpectedConstantKind(ConstantKind.CONSTANT_NameAndType)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Utf8)
    @Test
    public void test() {
        expectedLines = List.of(
                "    #1 = Methodref          #2.#3         // java/lang/Object.\"<init>\":()V",
                "    #2 = Class              #4            // java/lang/Object",
                "    #3 = NameAndType        #5:#6         // \"<init>\":()V",
                "    #4 = Utf8               java/lang/Object",
                "    #5 = Utf8               <init>",
                "    #6 = Utf8               ()V",
                "    #7 = Fieldref           #8.#9         // java/util/OptionalInt.isPresent:Z",
                "    #8 = Class              #10           // java/util/OptionalInt",
                "    #9 = NameAndType        #11:#12       // isPresent:Z",
                "   #10 = Utf8               java/util/OptionalInt",
                "   #11 = Utf8               isPresent",
                "   #12 = Utf8               Z",
                "   #13 = Fieldref           #8.#14        // java/util/OptionalInt.value:I",
                "   #14 = NameAndType        #15:#16       // value:I",
                "   #15 = Utf8               value",
                "   #16 = Utf8               I",
                "   #17 = Fieldref           #8.#18        // java/util/OptionalInt.EMPTY:Ljava/util/OptionalInt;",
                "   #18 = NameAndType        #19:#20       // EMPTY:Ljava/util/OptionalInt;",
                "   #19 = Utf8               EMPTY",
                "   #20 = Utf8               Ljava/util/OptionalInt;",
                "   #21 = Methodref          #8.#22        // java/util/OptionalInt.\"<init>\":(I)V",
                "   #22 = NameAndType        #5:#23        // \"<init>\":(I)V",
                "   #23 = Utf8               (I)V",
                "   #24 = Class              #25           // java/util/NoSuchElementException",
                "   #25 = Utf8               java/util/NoSuchElementException",
                "   #26 = String             #27           // No value present",
                "   #27 = Utf8               No value present",
                "   #28 = Methodref          #24.#29       // java/util/NoSuchElementException.\"<init>\":(Ljava/lang/String;)V",
                "   #29 = NameAndType        #5:#30        // \"<init>\":(Ljava/lang/String;)V",
                "   #30 = Utf8               (Ljava/lang/String;)V",
                "   #31 = InterfaceMethodref #32.#33       // java/util/function/IntConsumer.accept:(I)V",
                "   #32 = Class              #34           // java/util/function/IntConsumer",
                "   #33 = NameAndType        #35:#23       // accept:(I)V",
                "   #34 = Utf8               java/util/function/IntConsumer",
                "   #35 = Utf8               accept",
                "   #36 = InterfaceMethodref #37.#38       // java/lang/Runnable.run:()V",
                "   #37 = Class              #39           // java/lang/Runnable",
                "   #38 = NameAndType        #40:#6        // run:()V",
                "   #39 = Utf8               java/lang/Runnable",
                "   #40 = Utf8               run",
                "   #41 = InterfaceMethodref #42.#43       // java/util/stream/IntStream.of:(I)Ljava/util/stream/IntStream;",
                "   #42 = Class              #44           // java/util/stream/IntStream",
                "   #43 = NameAndType        #45:#46       // of:(I)Ljava/util/stream/IntStream;",
                "   #44 = Utf8               java/util/stream/IntStream",
                "   #45 = Utf8               of",
                "   #46 = Utf8               (I)Ljava/util/stream/IntStream;",
                "   #47 = InterfaceMethodref #42.#48       // java/util/stream/IntStream.empty:()Ljava/util/stream/IntStream;",
                "   #48 = NameAndType        #49:#50       // empty:()Ljava/util/stream/IntStream;",
                "   #49 = Utf8               empty",
                "   #50 = Utf8               ()Ljava/util/stream/IntStream;",
                "   #51 = InterfaceMethodref #52.#53       // java/util/function/IntSupplier.getAsInt:()I",
                "   #52 = Class              #54           // java/util/function/IntSupplier",
                "   #53 = NameAndType        #55:#56       // getAsInt:()I",
                "   #54 = Utf8               java/util/function/IntSupplier",
                "   #55 = Utf8               getAsInt",
                "   #56 = Utf8               ()I",
                "   #57 = InterfaceMethodref #58.#59       // java/util/function/Supplier.get:()Ljava/lang/Object;",
                "   #58 = Class              #60           // java/util/function/Supplier",
                "   #59 = NameAndType        #61:#62       // get:()Ljava/lang/Object;",
                "   #60 = Utf8               java/util/function/Supplier",
                "   #61 = Utf8               get",
                "   #62 = Utf8               ()Ljava/lang/Object;",
                "   #63 = Class              #64           // java/lang/Throwable",
                "   #64 = Utf8               java/lang/Throwable",
                "   #65 = Methodref          #66.#67       // java/lang/Integer.hashCode:(I)I",
                "   #66 = Class              #68           // java/lang/Integer",
                "   #67 = NameAndType        #69:#70       // hashCode:(I)I",
                "   #68 = Utf8               java/lang/Integer",
                "   #69 = Utf8               hashCode",
                "   #70 = Utf8               (I)I",
                "   #71 = Class              #72           // java/lang/StringBuilder",
                "   #72 = Utf8               java/lang/StringBuilder",
                "   #73 = Methodref          #71.#3        // java/lang/StringBuilder.\"<init>\":()V",
                "   #74 = String             #75           // OptionalInt[",
                "   #75 = Utf8               OptionalInt[",
                "   #76 = Methodref          #71.#77       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #77 = NameAndType        #78:#79       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #78 = Utf8               append",
                "   #79 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #80 = Methodref          #71.#81       // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "   #81 = NameAndType        #78:#82       // append:(I)Ljava/lang/StringBuilder;",
                "   #82 = Utf8               (I)Ljava/lang/StringBuilder;",
                "   #83 = String             #84           // ]",
                "   #84 = Utf8               ]",
                "   #85 = Methodref          #71.#86       // java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "   #86 = NameAndType        #87:#88       // toString:()Ljava/lang/String;",
                "   #87 = Utf8               toString",
                "   #88 = Utf8               ()Ljava/lang/String;",
                "   #89 = String             #90           // OptionalInt.empty",
                "   #90 = Utf8               OptionalInt.empty",
                "   #91 = Methodref          #8.#3         // java/util/OptionalInt.\"<init>\":()V",
                "   #92 = Utf8               Code",
                "   #93 = Utf8               LineNumberTable",
                "   #94 = Utf8               LocalVariableTable",
                "   #95 = Utf8               this",
                "   #96 = Utf8               ()Ljava/util/OptionalInt;",
                "   #97 = Utf8               (I)Ljava/util/OptionalInt;",
                "   #98 = Utf8               StackMapTable",
                "   #99 = Utf8               ()Z",
                "  #100 = Utf8               isEmpty",
                "  #101 = Utf8               ifPresent",
                "  #102 = Utf8               (Ljava/util/function/IntConsumer;)V",
                "  #103 = Utf8               action",
                "  #104 = Utf8               Ljava/util/function/IntConsumer;",
                "  #105 = Utf8               ifPresentOrElse",
                "  #106 = Utf8               (Ljava/util/function/IntConsumer;Ljava/lang/Runnable;)V",
                "  #107 = Utf8               emptyAction",
                "  #108 = Utf8               Ljava/lang/Runnable;",
                "  #109 = Utf8               stream",
                "  #110 = Utf8               orElse",
                "  #111 = Utf8               other",
                "  #112 = Utf8               orElseGet",
                "  #113 = Utf8               (Ljava/util/function/IntSupplier;)I",
                "  #114 = Utf8               supplier",
                "  #115 = Utf8               Ljava/util/function/IntSupplier;",
                "  #116 = Utf8               orElseThrow",
                "  #117 = Utf8               (Ljava/util/function/Supplier;)I",
                "  #118 = Utf8               exceptionSupplier",
                "  #119 = Utf8               Ljava/util/function/Supplier;",
                "  #120 = Utf8               LocalVariableTypeTable",
                "  #121 = Utf8               Ljava/util/function/Supplier<+TX;>;",
                "  #122 = Utf8               Exceptions",
                "  #123 = Utf8               Signature",
                "  #124 = Utf8               <X:Ljava/lang/Throwable;>(Ljava/util/function/Supplier<+TX;>;)I^TX;",
                "  #125 = Utf8               equals",
                "  #126 = Utf8               (Ljava/lang/Object;)Z",
                "  #127 = Utf8               obj",
                "  #128 = Utf8               Ljava/lang/Object;",
                "  #129 = Class              #130          // java/lang/String",
                "  #130 = Utf8               java/lang/String",
                "  #131 = Utf8               <clinit>",
                "  #132 = Utf8               SourceFile",
                "  #133 = Utf8               OptionalInt.java",
                "  #134 = Utf8               RuntimeVisibleAnnotations",
                "  #135 = Utf8               Ljdk/internal/ValueBased;"
        );
    }
}
