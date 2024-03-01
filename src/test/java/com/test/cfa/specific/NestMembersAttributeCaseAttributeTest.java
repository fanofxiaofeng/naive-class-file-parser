package com.test.cfa.specific;

import com.study.type.info.attribute.InnerClassesAttribute;
import com.study.type.info.attribute.NestMembersAttribute;
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
public class NestMembersAttributeCaseAttributeTest extends ClassFileAttributePresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("com.test.attribute.cases.NestMembersAttributeCase"));
    }

    @ExpectedPredefinedAttribute(SourceFileAttribute.class)
    @Test
    public void test_for_SourceFile_Attribute() {
        expectedConsecutiveLines = List.of(
                "SourceFile: \"NestMembersAttributeCase.java\""
        );
    }

    @ExpectedPredefinedAttribute(NestMembersAttribute.class)
    @Test
    public void test_for_NestMembers_Attribute() {
        expectedConsecutiveLines = List.of(
                "NestMembers:",
                "  com/test/attribute/cases/NestMembersAttributeCase$C2",
                "  com/test/attribute/cases/NestMembersAttributeCase$C1",
                "  com/test/attribute/cases/NestMembersAttributeCase$1",
                "  com/test/attribute/cases/NestMembersAttributeCase$1C3"
        );
    }

    @ExpectedPredefinedAttribute(InnerClassesAttribute.class)
    @Test
    public void test_for_InnerClasses_Attribute() {
        expectedConsecutiveLines = List.of(
                "InnerClasses:",
                "  #7;                                     // class com/test/attribute/cases/NestMembersAttributeCase$1",
                "  private #32= #25 of #12;                // C2=class com/test/attribute/cases/NestMembersAttributeCase$C2 of class com/test/attribute/cases/NestMembersAttributeCase",
                "  private #33= #27 of #12;                // C1=class com/test/attribute/cases/NestMembersAttributeCase$C1 of class com/test/attribute/cases/NestMembersAttributeCase",
                "  #34= #29;                               // C3=class com/test/attribute/cases/NestMembersAttributeCase$1C3"
        );
    }
}
