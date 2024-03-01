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
public class ListCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.List"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_InterfaceMethodref)
    @Test
    public void test() {
        expectedLines = List.of(
                "    #7 = InterfaceMethodref #8.#9         // java/util/List.listIterator:()Ljava/util/ListIterator;",
                "   #13 = InterfaceMethodref #14.#15       // java/util/ListIterator.hasNext:()Z",
                "   #19 = InterfaceMethodref #14.#20       // java/util/ListIterator.next:()Ljava/lang/Object;",
                "   #23 = InterfaceMethodref #24.#25       // java/util/function/UnaryOperator.apply:(Ljava/lang/Object;)Ljava/lang/Object;",
                "   #28 = InterfaceMethodref #14.#29       // java/util/ListIterator.set:(Ljava/lang/Object;)V",
                "   #32 = InterfaceMethodref #8.#33        // java/util/List.toArray:()[Ljava/lang/Object;",
                "   #58 = InterfaceMethodref #8.#59        // java/util/List.add:(ILjava/lang/Object;)V",
                "   #62 = InterfaceMethodref #8.#63        // java/util/List.add:(Ljava/lang/Object;)Z",
                "   #65 = InterfaceMethodref #8.#66        // java/util/List.isEmpty:()Z",
                "   #73 = InterfaceMethodref #8.#74        // java/util/List.get:(I)Ljava/lang/Object;",
                "   #77 = InterfaceMethodref #8.#78        // java/util/List.size:()I",
                "   #81 = InterfaceMethodref #8.#82        // java/util/List.remove:(I)Ljava/lang/Object;",
                "  #116 = InterfaceMethodref #8.#117       // java/util/List.reversed:()Ljava/util/List;"
        );
    }
}
