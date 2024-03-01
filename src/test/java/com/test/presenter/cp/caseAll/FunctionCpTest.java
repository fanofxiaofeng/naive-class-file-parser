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
public class FunctionCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.function.Function"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Methodref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_InterfaceMethodref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_NameAndType)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Utf8)
    @ExpectedConstantKind(ConstantKind.CONSTANT_MethodHandle)
    @ExpectedConstantKind(ConstantKind.CONSTANT_MethodType)
    @ExpectedConstantKind(ConstantKind.CONSTANT_InvokeDynamic)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "   #2 = Class              #4             // java/util/Objects",
                "   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "   #4 = Utf8               java/util/Objects",
                "   #5 = Utf8               requireNonNull",
                "   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;",
                "   #7 = InvokeDynamic      #0:#8          // #0:apply:(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;",
                "   #8 = NameAndType        #9:#10         // apply:(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;",
                "   #9 = Utf8               apply",
                "  #10 = Utf8               (Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;",
                "  #11 = InvokeDynamic      #1:#8          // #1:apply:(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;",
                "  #12 = InvokeDynamic      #2:#13         // #2:apply:()Ljava/util/function/Function;",
                "  #13 = NameAndType        #9:#14         // apply:()Ljava/util/function/Function;",
                "  #14 = Utf8               ()Ljava/util/function/Function;",
                "  #15 = InterfaceMethodref #16.#17        // java/util/function/Function.apply:(Ljava/lang/Object;)Ljava/lang/Object;",
                "  #16 = Class              #18            // java/util/function/Function",
                "  #17 = NameAndType        #9:#6          // apply:(Ljava/lang/Object;)Ljava/lang/Object;",
                "  #18 = Utf8               java/util/function/Function",
                "  #19 = Class              #20            // java/lang/Object",
                "  #20 = Utf8               java/lang/Object",
                "  #21 = Utf8               Signature",
                "  #22 = Utf8               (TT;)TR;",
                "  #23 = Utf8               compose",
                "  #24 = Utf8               (Ljava/util/function/Function;)Ljava/util/function/Function;",
                "  #25 = Utf8               Code",
                "  #26 = Utf8               LineNumberTable",
                "  #27 = Utf8               LocalVariableTable",
                "  #28 = Utf8               this",
                "  #29 = Utf8               Ljava/util/function/Function;",
                "  #30 = Utf8               before",
                "  #31 = Utf8               LocalVariableTypeTable",
                "  #32 = Utf8               Ljava/util/function/Function<TT;TR;>;",
                "  #33 = Utf8               Ljava/util/function/Function<-TV;+TT;>;",
                "  #34 = Utf8               <V:Ljava/lang/Object;>(Ljava/util/function/Function<-TV;+TT;>;)Ljava/util/function/Function<TV;TR;>;",
                "  #35 = Utf8               andThen",
                "  #36 = Utf8               after",
                "  #37 = Utf8               Ljava/util/function/Function<-TR;+TV;>;",
                "  #38 = Utf8               <V:Ljava/lang/Object;>(Ljava/util/function/Function<-TR;+TV;>;)Ljava/util/function/Function<TT;TV;>;",
                "  #39 = Utf8               identity",
                "  #40 = Utf8               <T:Ljava/lang/Object;>()Ljava/util/function/Function<TT;TT;>;",
                "  #41 = Utf8               lambda$identity$2",
                "  #42 = Utf8               t",
                "  #43 = Utf8               Ljava/lang/Object;",
                "  #44 = Utf8               lambda$andThen$1",
                "  #45 = Utf8               (Ljava/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;",
                "  #46 = Utf8               lambda$compose$0",
                "  #47 = Utf8               v",
                "  #48 = Utf8               <T:Ljava/lang/Object;R:Ljava/lang/Object;>Ljava/lang/Object;",
                "  #49 = Utf8               SourceFile",
                "  #50 = Utf8               Function.java",
                "  #51 = Utf8               RuntimeVisibleAnnotations",
                "  #52 = Utf8               Ljava/lang/FunctionalInterface;",
                "  #53 = Utf8               BootstrapMethods",
                "  #54 = MethodType         #6             //  (Ljava/lang/Object;)Ljava/lang/Object;",
                "  #55 = MethodHandle       9:#56          // REF_invokeInterface java/util/function/Function.lambda$compose$0:(Ljava/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;",
                "  #56 = InterfaceMethodref #16.#57        // java/util/function/Function.lambda$compose$0:(Ljava/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;",
                "  #57 = NameAndType        #46:#45        // lambda$compose$0:(Ljava/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;",
                "  #58 = MethodHandle       9:#59          // REF_invokeInterface java/util/function/Function.lambda$andThen$1:(Ljava/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;",
                "  #59 = InterfaceMethodref #16.#60        // java/util/function/Function.lambda$andThen$1:(Ljava/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;",
                "  #60 = NameAndType        #44:#45        // lambda$andThen$1:(Ljava/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;",
                "  #61 = MethodHandle       6:#62          // REF_invokeStatic java/util/function/Function.lambda$identity$2:(Ljava/lang/Object;)Ljava/lang/Object;",
                "  #62 = InterfaceMethodref #16.#63        // java/util/function/Function.lambda$identity$2:(Ljava/lang/Object;)Ljava/lang/Object;",
                "  #63 = NameAndType        #41:#6         // lambda$identity$2:(Ljava/lang/Object;)Ljava/lang/Object;",
                "  #64 = MethodHandle       6:#65          // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "  #65 = Methodref          #66.#67        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "  #66 = Class              #68            // java/lang/invoke/LambdaMetafactory",
                "  #67 = NameAndType        #69:#70        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "  #68 = Utf8               java/lang/invoke/LambdaMetafactory",
                "  #69 = Utf8               metafactory",
                "  #70 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
                "  #71 = Utf8               InnerClasses",
                "  #72 = Class              #73            // java/lang/invoke/MethodHandles$Lookup",
                "  #73 = Utf8               java/lang/invoke/MethodHandles$Lookup",
                "  #74 = Class              #75            // java/lang/invoke/MethodHandles",
                "  #75 = Utf8               java/lang/invoke/MethodHandles",
                "  #76 = Utf8               Lookup"
        );
    }
}
