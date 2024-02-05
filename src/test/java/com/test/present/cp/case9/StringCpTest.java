package com.test.present.cp.case9;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StringCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.String"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "     #9 = Fieldref           #10.#11      // java/lang/String.value:[B",
                "    #15 = Fieldref           #10.#16      // java/lang/String.coder:B",
                "    #19 = Fieldref           #10.#20      // java/lang/String.hash:I",
                "    #23 = Fieldref           #10.#24      // java/lang/String.hashIsZero:Z",
                "    #38 = Fieldref           #10.#39      // java/lang/String.COMPACT_STRINGS:Z",
                "    #82 = Fieldref           #83.#84      // sun/nio/cs/UTF_8.INSTANCE:Lsun/nio/cs/UTF_8;",
                "   #116 = Fieldref           #117.#118    // sun/nio/cs/ISO_8859_1.INSTANCE:Lsun/nio/cs/ISO_8859_1;",
                "   #123 = Fieldref           #124.#125    // sun/nio/cs/US_ASCII.INSTANCE:Lsun/nio/cs/US_ASCII;",
                "   #160 = Fieldref           #161.#162    // java/nio/charset/CodingErrorAction.REPLACE:Ljava/nio/charset/CodingErrorAction;",
                "   #592 = Fieldref           #10.#593     // java/lang/String.CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;",
                "  #1043 = Fieldref           #545.#1044   // java/lang/AbstractStringBuilder.maybeLatin1:Z",
                "  #1048 = Fieldref           #1049.#1050  // jdk/internal/util/Preconditions.SIOOBE_FORMATTER:Ljava/util/function/BiFunction;",
                "  #1092 = Fieldref           #10.#1093    // java/lang/String.serialPersistentFields:[Ljava/io/ObjectStreamField;"
        );
    }
}
