package com.test.present.cp.case11;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ListCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.util.List"));
    }

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
