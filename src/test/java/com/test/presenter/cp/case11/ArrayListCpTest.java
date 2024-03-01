package com.test.presenter.cp.case11;

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
public class ArrayListCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.ArrayList"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_InterfaceMethodref)
    @Test
    public void test() {
        expectedLines = List.of(
                "   #42 = InterfaceMethodref #43.#44       // java/util/Collection.toArray:()[Ljava/lang/Object;",
                "   #52 = InterfaceMethodref #43.#53       // java/util/Collection.getClass:()Ljava/lang/Class;",
                "  #164 = InterfaceMethodref #148.#165     // java/util/List.iterator:()Ljava/util/Iterator;",
                "  #168 = InterfaceMethodref #169.#170     // java/util/Iterator.hasNext:()Z",
                "  #174 = InterfaceMethodref #169.#175     // java/util/Iterator.next:()Ljava/lang/Object;",
                "  #217 = InterfaceMethodref #43.#218      // java/util/Collection.contains:(Ljava/lang/Object;)Z",
                "  #248 = InterfaceMethodref #249.#250     // jdk/internal/access/JavaObjectInputStreamAccess.checkArray:(Ljava/io/ObjectInputStream;Ljava/lang/Class;I)V",
                "  #285 = InterfaceMethodref #286.#287     // java/util/function/Consumer.accept:(Ljava/lang/Object;)V",
                "  #299 = InterfaceMethodref #300.#301     // java/util/function/Predicate.test:(Ljava/lang/Object;)Z",
                "  #320 = InterfaceMethodref #321.#322     // java/util/function/UnaryOperator.apply:(Ljava/lang/Object;)Ljava/lang/Object;"
        );
    }
}
