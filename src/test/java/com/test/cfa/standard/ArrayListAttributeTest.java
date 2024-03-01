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
public class ArrayListAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.ArrayList"));
    }

    @ExpectedPredefinedAttribute(SignatureAttribute.class)
    @Test
    public void test_for_Signature_Attribute() {
        expectedConsecutiveLines = List.of(
                "Signature: #496                         // <E:Ljava/lang/Object;>Ljava/util/AbstractList<TE;>;Ljava/util/List<TE;>;Ljava/util/RandomAccess;Ljava/lang/Cloneable;Ljava/io/Serializable;"
        );
    }

    @ExpectedPredefinedAttribute(SourceFileAttribute.class)
    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"ArrayList.java\""
        );
    }

    @ExpectedPredefinedAttribute(InnerClassesAttribute.class)
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  private #505= #262 of #10;              // ListItr=class java/util/ArrayList$ListItr of class java/util/ArrayList",
                "  private #506= #267 of #10;              // Itr=class java/util/ArrayList$Itr of class java/util/ArrayList",
                "  private static #507= #276 of #10;       // SubList=class java/util/ArrayList$SubList of class java/util/ArrayList",
                "  final #508= #290 of #10;                // ArrayListSpliterator=class java/util/ArrayList$ArrayListSpliterator of class java/util/ArrayList",
                "  #500;                                   // class java/util/ArrayList$SubList$2",
                "  #502;                                   // class java/util/ArrayList$SubList$1"
        );
    }
}
