package com.test.cfa.standard;

import com.study.type.info.attribute.InnerClassesAttribute;
import com.study.type.info.attribute.SignatureAttribute;
import com.study.type.info.attribute.SourceFileAttribute;
import com.test.annotations.ExpectedPredefinedAttribute;
import com.test.annotations.GeneratedBy;
import com.test.cfa.ClassFileAttributeTestGenerator;
import com.test.presenter.ClassFileAttributePresenterTestBase;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@GeneratedBy(ClassFileAttributeTestGenerator.class)
public class CharacterAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Character"));
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_Signature_Attribute() {
        expectedConsecutiveLines = List.of(
                "Signature: #590                         // Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Comparable<Ljava/lang/Character;>;Ljava/lang/constant/Constable;"
        );
    }

    @ExpectedPredefinedAttribute(SourceFileAttribute.class)
    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"Character.java\""
        );
    }

    @ExpectedPredefinedAttribute(InnerClassesAttribute.class)
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  private static #600= #48 of #1;         // CharacterCache=class java/lang/Character$CharacterCache of class java/lang/Character",
                "  public static final #601= #307 of #1;   // UnicodeBlock=class java/lang/Character$UnicodeBlock of class java/lang/Character",
                "  public static final #602= #595 of #1;   // UnicodeScript=class java/lang/Character$UnicodeScript of class java/lang/Character",
                "  public static #603= #597 of #1;         // Subset=class java/lang/Character$Subset of class java/lang/Character"
        );
    }
}
