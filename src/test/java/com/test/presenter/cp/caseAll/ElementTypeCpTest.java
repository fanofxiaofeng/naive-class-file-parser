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
public class ElementTypeCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.annotation.ElementType"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Fieldref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Methodref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_String)
    @ExpectedConstantKind(ConstantKind.CONSTANT_NameAndType)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Utf8)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #1 = Class              #2             // java/lang/annotation/ElementType",
                "   #2 = Utf8               java/lang/annotation/ElementType",
                "   #3 = Fieldref           #1.#4          // java/lang/annotation/ElementType.TYPE:Ljava/lang/annotation/ElementType;",
                "   #4 = NameAndType        #5:#6          // TYPE:Ljava/lang/annotation/ElementType;",
                "   #5 = Utf8               TYPE",
                "   #6 = Utf8               Ljava/lang/annotation/ElementType;",
                "   #7 = Fieldref           #1.#8          // java/lang/annotation/ElementType.FIELD:Ljava/lang/annotation/ElementType;",
                "   #8 = NameAndType        #9:#6          // FIELD:Ljava/lang/annotation/ElementType;",
                "   #9 = Utf8               FIELD",
                "  #10 = Fieldref           #1.#11         // java/lang/annotation/ElementType.METHOD:Ljava/lang/annotation/ElementType;",
                "  #11 = NameAndType        #12:#6         // METHOD:Ljava/lang/annotation/ElementType;",
                "  #12 = Utf8               METHOD",
                "  #13 = Fieldref           #1.#14         // java/lang/annotation/ElementType.PARAMETER:Ljava/lang/annotation/ElementType;",
                "  #14 = NameAndType        #15:#6         // PARAMETER:Ljava/lang/annotation/ElementType;",
                "  #15 = Utf8               PARAMETER",
                "  #16 = Fieldref           #1.#17         // java/lang/annotation/ElementType.CONSTRUCTOR:Ljava/lang/annotation/ElementType;",
                "  #17 = NameAndType        #18:#6         // CONSTRUCTOR:Ljava/lang/annotation/ElementType;",
                "  #18 = Utf8               CONSTRUCTOR",
                "  #19 = Fieldref           #1.#20         // java/lang/annotation/ElementType.LOCAL_VARIABLE:Ljava/lang/annotation/ElementType;",
                "  #20 = NameAndType        #21:#6         // LOCAL_VARIABLE:Ljava/lang/annotation/ElementType;",
                "  #21 = Utf8               LOCAL_VARIABLE",
                "  #22 = Fieldref           #1.#23         // java/lang/annotation/ElementType.ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;",
                "  #23 = NameAndType        #24:#6         // ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;",
                "  #24 = Utf8               ANNOTATION_TYPE",
                "  #25 = Fieldref           #1.#26         // java/lang/annotation/ElementType.PACKAGE:Ljava/lang/annotation/ElementType;",
                "  #26 = NameAndType        #27:#6         // PACKAGE:Ljava/lang/annotation/ElementType;",
                "  #27 = Utf8               PACKAGE",
                "  #28 = Fieldref           #1.#29         // java/lang/annotation/ElementType.TYPE_PARAMETER:Ljava/lang/annotation/ElementType;",
                "  #29 = NameAndType        #30:#6         // TYPE_PARAMETER:Ljava/lang/annotation/ElementType;",
                "  #30 = Utf8               TYPE_PARAMETER",
                "  #31 = Fieldref           #1.#32         // java/lang/annotation/ElementType.TYPE_USE:Ljava/lang/annotation/ElementType;",
                "  #32 = NameAndType        #33:#6         // TYPE_USE:Ljava/lang/annotation/ElementType;",
                "  #33 = Utf8               TYPE_USE",
                "  #34 = Fieldref           #1.#35         // java/lang/annotation/ElementType.MODULE:Ljava/lang/annotation/ElementType;",
                "  #35 = NameAndType        #36:#6         // MODULE:Ljava/lang/annotation/ElementType;",
                "  #36 = Utf8               MODULE",
                "  #37 = Fieldref           #1.#38         // java/lang/annotation/ElementType.RECORD_COMPONENT:Ljava/lang/annotation/ElementType;",
                "  #38 = NameAndType        #39:#6         // RECORD_COMPONENT:Ljava/lang/annotation/ElementType;",
                "  #39 = Utf8               RECORD_COMPONENT",
                "  #40 = Fieldref           #1.#41         // java/lang/annotation/ElementType.$VALUES:[Ljava/lang/annotation/ElementType;",
                "  #41 = NameAndType        #42:#43        // $VALUES:[Ljava/lang/annotation/ElementType;",
                "  #42 = Utf8               $VALUES",
                "  #43 = Utf8               [Ljava/lang/annotation/ElementType;",
                "  #44 = Methodref          #45.#46        // \"[Ljava/lang/annotation/ElementType;\".clone:()Ljava/lang/Object;",
                "  #45 = Class              #43            // \"[Ljava/lang/annotation/ElementType;\"",
                "  #46 = NameAndType        #47:#48        // clone:()Ljava/lang/Object;",
                "  #47 = Utf8               clone",
                "  #48 = Utf8               ()Ljava/lang/Object;",
                "  #49 = Methodref          #50.#51        // java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;",
                "  #50 = Class              #52            // java/lang/Enum",
                "  #51 = NameAndType        #53:#54        // valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;",
                "  #52 = Utf8               java/lang/Enum",
                "  #53 = Utf8               valueOf",
                "  #54 = Utf8               (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;",
                "  #55 = Methodref          #50.#56        // java/lang/Enum.\"<init>\":(Ljava/lang/String;I)V",
                "  #56 = NameAndType        #57:#58        // \"<init>\":(Ljava/lang/String;I)V",
                "  #57 = Utf8               <init>",
                "  #58 = Utf8               (Ljava/lang/String;I)V",
                "  #59 = String             #5             // TYPE",
                "  #60 = Methodref          #1.#56         // java/lang/annotation/ElementType.\"<init>\":(Ljava/lang/String;I)V",
                "  #61 = String             #9             // FIELD",
                "  #62 = String             #12            // METHOD",
                "  #63 = String             #15            // PARAMETER",
                "  #64 = String             #18            // CONSTRUCTOR",
                "  #65 = String             #21            // LOCAL_VARIABLE",
                "  #66 = String             #24            // ANNOTATION_TYPE",
                "  #67 = String             #27            // PACKAGE",
                "  #68 = String             #30            // TYPE_PARAMETER",
                "  #69 = String             #33            // TYPE_USE",
                "  #70 = String             #36            // MODULE",
                "  #71 = String             #39            // RECORD_COMPONENT",
                "  #72 = Methodref          #1.#73         // java/lang/annotation/ElementType.$values:()[Ljava/lang/annotation/ElementType;",
                "  #73 = NameAndType        #74:#75        // $values:()[Ljava/lang/annotation/ElementType;",
                "  #74 = Utf8               $values",
                "  #75 = Utf8               ()[Ljava/lang/annotation/ElementType;",
                "  #76 = Utf8               values",
                "  #77 = Utf8               Code",
                "  #78 = Utf8               LineNumberTable",
                "  #79 = Utf8               (Ljava/lang/String;)Ljava/lang/annotation/ElementType;",
                "  #80 = Utf8               LocalVariableTable",
                "  #81 = Utf8               name",
                "  #82 = Utf8               Ljava/lang/String;",
                "  #83 = Utf8               MethodParameters",
                "  #84 = Utf8               this",
                "  #85 = Utf8               Signature",
                "  #86 = Utf8               ()V",
                "  #87 = Utf8               <clinit>",
                "  #88 = Utf8               Ljava/lang/Enum<Ljava/lang/annotation/ElementType;>;",
                "  #89 = Utf8               SourceFile",
                "  #90 = Utf8               ElementType.java"
        );
    }
}
