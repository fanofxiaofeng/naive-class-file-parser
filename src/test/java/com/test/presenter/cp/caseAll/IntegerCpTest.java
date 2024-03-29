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
public class IntegerCpTest extends ConstantPoolPresenterTestBase {

    @BeforeClass
    public static void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Integer"));
    }

    @ExpectedConstantKind(ConstantKind.CONSTANT_Class)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Fieldref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Methodref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_InterfaceMethodref)
    @ExpectedConstantKind(ConstantKind.CONSTANT_String)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Integer)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Long)
    @ExpectedConstantKind(ConstantKind.CONSTANT_NameAndType)
    @ExpectedConstantKind(ConstantKind.CONSTANT_Utf8)
    @Test
    public void test() {
        expectedLines = List.of(
                "    #1 = Class              #2            // java/lang/Integer",
                "    #2 = Utf8               java/lang/Integer",
                "    #3 = Class              #4            // java/lang/Byte",
                "    #4 = Utf8               java/lang/Byte",
                "    #5 = Class              #6            // java/lang/String",
                "    #6 = Utf8               java/lang/String",
                "    #7 = Class              #8            // java/lang/Character",
                "    #8 = Utf8               java/lang/Character",
                "    #9 = Methodref          #1.#10        // java/lang/Integer.toString:(I)Ljava/lang/String;",
                "   #10 = NameAndType        #11:#12       // toString:(I)Ljava/lang/String;",
                "   #11 = Utf8               toString",
                "   #12 = Utf8               (I)Ljava/lang/String;",
                "   #13 = Fieldref           #5.#14        // java/lang/String.COMPACT_STRINGS:Z",
                "   #14 = NameAndType        #15:#16       // COMPACT_STRINGS:Z",
                "   #15 = Utf8               COMPACT_STRINGS",
                "   #16 = Utf8               Z",
                "   #17 = Fieldref           #1.#18        // java/lang/Integer.digits:[C",
                "   #18 = NameAndType        #19:#20       // digits:[C",
                "   #19 = Utf8               digits",
                "   #20 = Utf8               [C",
                "   #21 = Methodref          #22.#23       // java/lang/StringLatin1.newString:([BII)Ljava/lang/String;",
                "   #22 = Class              #24           // java/lang/StringLatin1",
                "   #23 = NameAndType        #25:#26       // newString:([BII)Ljava/lang/String;",
                "   #24 = Utf8               java/lang/StringLatin1",
                "   #25 = Utf8               newString",
                "   #26 = Utf8               ([BII)Ljava/lang/String;",
                "   #27 = Methodref          #1.#28        // java/lang/Integer.toStringUTF16:(II)Ljava/lang/String;",
                "   #28 = NameAndType        #29:#30       // toStringUTF16:(II)Ljava/lang/String;",
                "   #29 = Utf8               toStringUTF16",
                "   #30 = Utf8               (II)Ljava/lang/String;",
                "   #31 = Methodref          #32.#33       // java/lang/StringUTF16.putChar:([BII)V",
                "   #32 = Class              #34           // java/lang/StringUTF16",
                "   #33 = NameAndType        #35:#36       // putChar:([BII)V",
                "   #34 = Utf8               java/lang/StringUTF16",
                "   #35 = Utf8               putChar",
                "   #36 = Utf8               ([BII)V",
                "   #37 = Methodref          #32.#23       // java/lang/StringUTF16.newString:([BII)Ljava/lang/String;",
                "   #38 = Methodref          #1.#39        // java/lang/Integer.toUnsignedLong:(I)J",
                "   #39 = NameAndType        #40:#41       // toUnsignedLong:(I)J",
                "   #40 = Utf8               toUnsignedLong",
                "   #41 = Utf8               (I)J",
                "   #42 = Methodref          #43.#44       // java/lang/Long.toUnsignedString:(JI)Ljava/lang/String;",
                "   #43 = Class              #45           // java/lang/Long",
                "   #44 = NameAndType        #46:#47       // toUnsignedString:(JI)Ljava/lang/String;",
                "   #45 = Utf8               java/lang/Long",
                "   #46 = Utf8               toUnsignedString",
                "   #47 = Utf8               (JI)Ljava/lang/String;",
                "   #48 = Methodref          #1.#49        // java/lang/Integer.toUnsignedString0:(II)Ljava/lang/String;",
                "   #49 = NameAndType        #50:#30       // toUnsignedString0:(II)Ljava/lang/String;",
                "   #50 = Utf8               toUnsignedString0",
                "   #51 = Methodref          #1.#52        // java/lang/Integer.numberOfLeadingZeros:(I)I",
                "   #52 = NameAndType        #53:#54       // numberOfLeadingZeros:(I)I",
                "   #53 = Utf8               numberOfLeadingZeros",
                "   #54 = Utf8               (I)I",
                "   #55 = Methodref          #56.#57       // java/lang/Math.max:(II)I",
                "   #56 = Class              #58           // java/lang/Math",
                "   #57 = NameAndType        #59:#60       // max:(II)I",
                "   #58 = Utf8               java/lang/Math",
                "   #59 = Utf8               max",
                "   #60 = Utf8               (II)I",
                "   #61 = Methodref          #1.#62        // java/lang/Integer.formatUnsignedInt:(II[BI)V",
                "   #62 = NameAndType        #63:#64       // formatUnsignedInt:(II[BI)V",
                "   #63 = Utf8               formatUnsignedInt",
                "   #64 = Utf8               (II[BI)V",
                "   #65 = Methodref          #5.#66        // java/lang/String.\"<init>\":([BB)V",
                "   #66 = NameAndType        #67:#68       // \"<init>\":([BB)V",
                "   #67 = Utf8               <init>",
                "   #68 = Utf8               ([BB)V",
                "   #69 = Methodref          #1.#70        // java/lang/Integer.formatUnsignedIntUTF16:(II[BI)V",
                "   #70 = NameAndType        #71:#64       // formatUnsignedIntUTF16:(II[BI)V",
                "   #71 = Utf8               formatUnsignedIntUTF16",
                "   #72 = Methodref          #1.#73        // java/lang/Integer.stringSize:(I)I",
                "   #73 = NameAndType        #74:#54       // stringSize:(I)I",
                "   #74 = Utf8               stringSize",
                "   #75 = Methodref          #1.#76        // java/lang/Integer.getChars:(II[B)I",
                "   #76 = NameAndType        #77:#78       // getChars:(II[B)I",
                "   #77 = Utf8               getChars",
                "   #78 = Utf8               (II[B)I",
                "   #79 = Methodref          #32.#76       // java/lang/StringUTF16.getChars:(II[B)I",
                "   #80 = Methodref          #43.#81       // java/lang/Long.toString:(J)Ljava/lang/String;",
                "   #81 = NameAndType        #11:#82       // toString:(J)Ljava/lang/String;",
                "   #82 = Utf8               (J)Ljava/lang/String;",
                "   #83 = Fieldref           #1.#84        // java/lang/Integer.DigitOnes:[B",
                "   #84 = NameAndType        #85:#86       // DigitOnes:[B",
                "   #85 = Utf8               DigitOnes",
                "   #86 = Utf8               [B",
                "   #87 = Fieldref           #1.#88        // java/lang/Integer.DigitTens:[B",
                "   #88 = NameAndType        #89:#86       // DigitTens:[B",
                "   #89 = Utf8               DigitTens",
                "   #90 = Class              #91           // java/lang/NumberFormatException",
                "   #91 = Utf8               java/lang/NumberFormatException",
                "   #92 = String             #93           // Cannot parse null string",
                "   #93 = Utf8               Cannot parse null string",
                "   #94 = Methodref          #90.#95       // java/lang/NumberFormatException.\"<init>\":(Ljava/lang/String;)V",
                "   #95 = NameAndType        #67:#96       // \"<init>\":(Ljava/lang/String;)V",
                "   #96 = Utf8               (Ljava/lang/String;)V",
                "   #97 = Class              #98           // java/lang/StringBuilder",
                "   #98 = Utf8               java/lang/StringBuilder",
                "   #99 = Methodref          #97.#100      // java/lang/StringBuilder.\"<init>\":()V",
                "  #100 = NameAndType        #67:#101      // \"<init>\":()V",
                "  #101 = Utf8               ()V",
                "  #102 = String             #103          // radix",
                "  #103 = Utf8               radix",
                "  #104 = Methodref          #97.#105      // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "  #105 = NameAndType        #106:#107     // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "  #106 = Utf8               append",
                "  #107 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "  #108 = Methodref          #97.#109      // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;",
                "  #109 = NameAndType        #106:#110     // append:(I)Ljava/lang/StringBuilder;",
                "  #110 = Utf8               (I)Ljava/lang/StringBuilder;",
                "  #111 = String             #112          //  less than Character.MIN_RADIX",
                "  #112 = Utf8                less than Character.MIN_RADIX",
                "  #113 = Methodref          #97.#114      // java/lang/StringBuilder.toString:()Ljava/lang/String;",
                "  #114 = NameAndType        #11:#115      // toString:()Ljava/lang/String;",
                "  #115 = Utf8               ()Ljava/lang/String;",
                "  #116 = String             #117          //  greater than Character.MAX_RADIX",
                "  #117 = Utf8                greater than Character.MAX_RADIX",
                "  #118 = Methodref          #5.#119       // java/lang/String.length:()I",
                "  #119 = NameAndType        #120:#121     // length:()I",
                "  #120 = Utf8               length",
                "  #121 = Utf8               ()I",
                "  #122 = Integer            -2147483647",
                "  #123 = Methodref          #5.#124       // java/lang/String.charAt:(I)C",
                "  #124 = NameAndType        #125:#126     // charAt:(I)C",
                "  #125 = Utf8               charAt",
                "  #126 = Utf8               (I)C",
                "  #127 = Integer            -2147483648",
                "  #128 = Methodref          #90.#129      // java/lang/NumberFormatException.forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "  #129 = NameAndType        #130:#131     // forInputString:(Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "  #130 = Utf8               forInputString",
                "  #131 = Utf8               (Ljava/lang/String;I)Ljava/lang/NumberFormatException;",
                "  #132 = Methodref          #7.#133       // java/lang/Character.digit:(CI)I",
                "  #133 = NameAndType        #134:#135     // digit:(CI)I",
                "  #134 = Utf8               digit",
                "  #135 = Utf8               (CI)I",
                "  #136 = Methodref          #137.#138     // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "  #137 = Class              #139          // java/util/Objects",
                "  #138 = NameAndType        #140:#141     // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "  #139 = Utf8               java/util/Objects",
                "  #140 = Utf8               requireNonNull",
                "  #141 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;",
                "  #142 = InterfaceMethodref #143.#119     // java/lang/CharSequence.length:()I",
                "  #143 = Class              #144          // java/lang/CharSequence",
                "  #144 = Utf8               java/lang/CharSequence",
                "  #145 = Methodref          #137.#146     // java/util/Objects.checkFromToIndex:(III)I",
                "  #146 = NameAndType        #147:#148     // checkFromToIndex:(III)I",
                "  #147 = Utf8               checkFromToIndex",
                "  #148 = Utf8               (III)I",
                "  #149 = InterfaceMethodref #143.#124     // java/lang/CharSequence.charAt:(I)C",
                "  #150 = Methodref          #90.#151      // java/lang/NumberFormatException.forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;",
                "  #151 = NameAndType        #152:#153     // forCharSequence:(Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;",
                "  #152 = Utf8               forCharSequence",
                "  #153 = Utf8               (Ljava/lang/CharSequence;III)Ljava/lang/NumberFormatException;",
                "  #154 = String             #155          //",
                "  #155 = Utf8",
                "  #156 = Methodref          #1.#157       // java/lang/Integer.parseInt:(Ljava/lang/String;I)I",
                "  #157 = NameAndType        #158:#159     // parseInt:(Ljava/lang/String;I)I",
                "  #158 = Utf8               parseInt",
                "  #159 = Utf8               (Ljava/lang/String;I)I",
                "  #160 = String             #161          // Illegal leading minus sign on unsigned string %s.",
                "  #161 = Utf8               Illegal leading minus sign on unsigned string %s.",
                "  #162 = Class              #163          // java/lang/Object",
                "  #163 = Utf8               java/lang/Object",
                "  #164 = Methodref          #5.#165       // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "  #165 = NameAndType        #166:#167     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "  #166 = Utf8               format",
                "  #167 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "  #168 = Methodref          #43.#169      // java/lang/Long.parseLong:(Ljava/lang/String;I)J",
                "  #169 = NameAndType        #170:#171     // parseLong:(Ljava/lang/String;I)J",
                "  #170 = Utf8               parseLong",
                "  #171 = Utf8               (Ljava/lang/String;I)J",
                "  #172 = Long               -4294967296l",
                "  #174 = String             #175          // String value %s exceeds range of unsigned int.",
                "  #175 = Utf8               String value %s exceeds range of unsigned int.",
                "  #176 = Methodref          #1.#177       // java/lang/Integer.parseInt:(Ljava/lang/CharSequence;III)I",
                "  #177 = NameAndType        #158:#178     // parseInt:(Ljava/lang/CharSequence;III)I",
                "  #178 = Utf8               (Ljava/lang/CharSequence;III)I",
                "  #179 = Methodref          #43.#180      // java/lang/Long.parseLong:(Ljava/lang/CharSequence;III)J",
                "  #180 = NameAndType        #170:#181     // parseLong:(Ljava/lang/CharSequence;III)J",
                "  #181 = Utf8               (Ljava/lang/CharSequence;III)J",
                "  #182 = Methodref          #1.#183       // java/lang/Integer.parseUnsignedInt:(Ljava/lang/String;I)I",
                "  #183 = NameAndType        #184:#159     // parseUnsignedInt:(Ljava/lang/String;I)I",
                "  #184 = Utf8               parseUnsignedInt",
                "  #185 = Methodref          #1.#186       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;",
                "  #186 = NameAndType        #187:#188     // valueOf:(I)Ljava/lang/Integer;",
                "  #187 = Utf8               valueOf",
                "  #188 = Utf8               (I)Ljava/lang/Integer;",
                "  #189 = Class              #190          // java/lang/Integer$IntegerCache",
                "  #190 = Utf8               java/lang/Integer$IntegerCache",
                "  #191 = Fieldref           #189.#192     // java/lang/Integer$IntegerCache.high:I",
                "  #192 = NameAndType        #193:#194     // high:I",
                "  #193 = Utf8               high",
                "  #194 = Utf8               I",
                "  #195 = Fieldref           #189.#196     // java/lang/Integer$IntegerCache.cache:[Ljava/lang/Integer;",
                "  #196 = NameAndType        #197:#198     // cache:[Ljava/lang/Integer;",
                "  #197 = Utf8               cache",
                "  #198 = Utf8               [Ljava/lang/Integer;",
                "  #199 = Methodref          #1.#200       // java/lang/Integer.\"<init>\":(I)V",
                "  #200 = NameAndType        #67:#201      // \"<init>\":(I)V",
                "  #201 = Utf8               (I)V",
                "  #202 = Methodref          #203.#100     // java/lang/Number.\"<init>\":()V",
                "  #203 = Class              #204          // java/lang/Number",
                "  #204 = Utf8               java/lang/Number",
                "  #205 = Fieldref           #1.#206       // java/lang/Integer.value:I",
                "  #206 = NameAndType        #207:#194     // value:I",
                "  #207 = Utf8               value",
                "  #208 = Methodref          #1.#209       // java/lang/Integer.hashCode:(I)I",
                "  #209 = NameAndType        #210:#54      // hashCode:(I)I",
                "  #210 = Utf8               hashCode",
                "  #211 = Methodref          #1.#212       // java/lang/Integer.intValue:()I",
                "  #212 = NameAndType        #213:#121     // intValue:()I",
                "  #213 = Utf8               intValue",
                "  #214 = Methodref          #1.#215       // java/lang/Integer.getInteger:(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;",
                "  #215 = NameAndType        #216:#217     // getInteger:(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;",
                "  #216 = Utf8               getInteger",
                "  #217 = Utf8               (Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;",
                "  #218 = Methodref          #219.#220     // java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;",
                "  #219 = Class              #221          // java/lang/System",
                "  #220 = NameAndType        #222:#223     // getProperty:(Ljava/lang/String;)Ljava/lang/String;",
                "  #221 = Utf8               java/lang/System",
                "  #222 = Utf8               getProperty",
                "  #223 = Utf8               (Ljava/lang/String;)Ljava/lang/String;",
                "  #224 = Class              #225          // java/lang/IllegalArgumentException",
                "  #225 = Utf8               java/lang/IllegalArgumentException",
                "  #226 = Class              #227          // java/lang/NullPointerException",
                "  #227 = Utf8               java/lang/NullPointerException",
                "  #228 = Methodref          #1.#229       // java/lang/Integer.decode:(Ljava/lang/String;)Ljava/lang/Integer;",
                "  #229 = NameAndType        #230:#231     // decode:(Ljava/lang/String;)Ljava/lang/Integer;",
                "  #230 = Utf8               decode",
                "  #231 = Utf8               (Ljava/lang/String;)Ljava/lang/Integer;",
                "  #232 = Methodref          #5.#233       // java/lang/String.isEmpty:()Z",
                "  #233 = NameAndType        #234:#235     // isEmpty:()Z",
                "  #234 = Utf8               isEmpty",
                "  #235 = Utf8               ()Z",
                "  #236 = String             #237          // Zero length string",
                "  #237 = Utf8               Zero length string",
                "  #238 = String             #239          // 0x",
                "  #239 = Utf8               0x",
                "  #240 = Methodref          #5.#241       // java/lang/String.startsWith:(Ljava/lang/String;I)Z",
                "  #241 = NameAndType        #242:#243     // startsWith:(Ljava/lang/String;I)Z",
                "  #242 = Utf8               startsWith",
                "  #243 = Utf8               (Ljava/lang/String;I)Z",
                "  #244 = String             #245          // 0X",
                "  #245 = Utf8               0X",
                "  #246 = String             #247          // #",
                "  #247 = Utf8               #",
                "  #248 = String             #249          // 0",
                "  #249 = Utf8               0",
                "  #250 = String             #251          // -",
                "  #251 = Utf8               -",
                "  #252 = String             #253          // +",
                "  #253 = Utf8               +",
                "  #254 = String             #255          // Sign character in wrong position",
                "  #255 = Utf8               Sign character in wrong position",
                "  #256 = Methodref          #5.#257       // java/lang/String.substring:(I)Ljava/lang/String;",
                "  #257 = NameAndType        #258:#12      // substring:(I)Ljava/lang/String;",
                "  #258 = Utf8               substring",
                "  #259 = Methodref          #1.#260       // java/lang/Integer.compare:(II)I",
                "  #260 = NameAndType        #261:#60      // compare:(II)I",
                "  #261 = Utf8               compare",
                "  #262 = Long               4294967295l",
                "  #264 = Integer            65536",
                "  #265 = Integer            1431655765",
                "  #266 = Integer            858993459",
                "  #267 = Integer            252645135",
                "  #268 = Methodref          #1.#269       // java/lang/Integer.reverseBytes:(I)I",
                "  #269 = NameAndType        #270:#54      // reverseBytes:(I)I",
                "  #270 = Utf8               reverseBytes",
                "  #271 = Methodref          #1.#272       // java/lang/Integer.parallelSuffix:(I)I",
                "  #272 = NameAndType        #273:#54      // parallelSuffix:(I)I",
                "  #273 = Utf8               parallelSuffix",
                "  #274 = Integer            65280",
                "  #275 = Methodref          #56.#276      // java/lang/Math.min:(II)I",
                "  #276 = NameAndType        #277:#60      // min:(II)I",
                "  #277 = Utf8               min",
                "  #278 = Methodref          #279.#280     // java/util/Optional.of:(Ljava/lang/Object;)Ljava/util/Optional;",
                "  #279 = Class              #281          // java/util/Optional",
                "  #280 = NameAndType        #282:#283     // of:(Ljava/lang/Object;)Ljava/util/Optional;",
                "  #281 = Utf8               java/util/Optional",
                "  #282 = Utf8               of",
                "  #283 = Utf8               (Ljava/lang/Object;)Ljava/util/Optional;",
                "  #284 = Methodref          #1.#285       // java/lang/Integer.compareTo:(Ljava/lang/Integer;)I",
                "  #285 = NameAndType        #286:#287     // compareTo:(Ljava/lang/Integer;)I",
                "  #286 = Utf8               compareTo",
                "  #287 = Utf8               (Ljava/lang/Integer;)I",
                "  #288 = Methodref          #1.#289       // java/lang/Integer.resolveConstantDesc:(Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Integer;",
                "  #289 = NameAndType        #290:#291     // resolveConstantDesc:(Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Integer;",
                "  #290 = Utf8               resolveConstantDesc",
                "  #291 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Integer;",
                "  #292 = String             #293          // int",
                "  #293 = Utf8               int",
                "  #294 = Methodref          #295.#296     // java/lang/Class.getPrimitiveClass:(Ljava/lang/String;)Ljava/lang/Class;",
                "  #295 = Class              #297          // java/lang/Class",
                "  #296 = NameAndType        #298:#299     // getPrimitiveClass:(Ljava/lang/String;)Ljava/lang/Class;",
                "  #297 = Utf8               java/lang/Class",
                "  #298 = Utf8               getPrimitiveClass",
                "  #299 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;",
                "  #300 = Fieldref           #1.#301       // java/lang/Integer.TYPE:Ljava/lang/Class;",
                "  #301 = NameAndType        #302:#303     // TYPE:Ljava/lang/Class;",
                "  #302 = Utf8               TYPE",
                "  #303 = Utf8               Ljava/lang/Class;",
                "  #304 = Class              #305          // java/lang/Comparable",
                "  #305 = Utf8               java/lang/Comparable",
                "  #306 = Class              #307          // java/lang/constant/Constable",
                "  #307 = Utf8               java/lang/constant/Constable",
                "  #308 = Class              #309          // java/lang/constant/ConstantDesc",
                "  #309 = Utf8               java/lang/constant/ConstantDesc",
                "  #310 = Utf8               MIN_VALUE",
                "  #311 = Utf8               ConstantValue",
                "  #312 = Utf8               MAX_VALUE",
                "  #313 = Integer            2147483647",
                "  #314 = Utf8               Signature",
                "  #315 = Utf8               Ljava/lang/Class<Ljava/lang/Integer;>;",
                "  #316 = Utf8               SIZE",
                "  #317 = Integer            32",
                "  #318 = Utf8               BYTES",
                "  #319 = Integer            4",
                "  #320 = Utf8               serialVersionUID",
                "  #321 = Utf8               J",
                "  #322 = Long               1360826667806852920l",
                "  #324 = Utf8               Code",
                "  #325 = Utf8               LineNumberTable",
                "  #326 = Utf8               LocalVariableTable",
                "  #327 = Utf8               buf",
                "  #328 = Utf8               negative",
                "  #329 = Utf8               charPos",
                "  #330 = Utf8               i",
                "  #331 = Utf8               radix",
                "  #332 = Utf8               StackMapTable",
                "  #333 = Class              #86           // \"[B\"",
                "  #334 = Utf8               toHexString",
                "  #335 = Utf8               toOctalString",
                "  #336 = Utf8               toBinaryString",
                "  #337 = Utf8               val",
                "  #338 = Utf8               shift",
                "  #339 = Utf8               mag",
                "  #340 = Utf8               chars",
                "  #341 = Utf8               len",
                "  #342 = Utf8               mask",
                "  #343 = Utf8               size",
                "  #344 = Utf8               RuntimeVisibleAnnotations",
                "  #345 = Utf8               Ljdk/internal/vm/annotation/IntrinsicCandidate;",
                "  #346 = Utf8               q",
                "  #347 = Utf8               r",
                "  #348 = Utf8               index",
                "  #349 = Utf8               x",
                "  #350 = Utf8               d",
                "  #351 = Utf8               p",
                "  #352 = Utf8               firstChar",
                "  #353 = Utf8               C",
                "  #354 = Utf8               multmin",
                "  #355 = Utf8               result",
                "  #356 = Utf8               s",
                "  #357 = Utf8               Ljava/lang/String;",
                "  #358 = Utf8               limit",
                "  #359 = Utf8               Exceptions",
                "  #360 = Utf8               Ljava/lang/CharSequence;",
                "  #361 = Utf8               beginIndex",
                "  #362 = Utf8               endIndex",
                "  #363 = Utf8               (Ljava/lang/String;)I",
                "  #364 = Utf8               ell",
                "  #365 = Utf8               start",
                "  #366 = Utf8               (Ljava/lang/String;I)Ljava/lang/Integer;",
                "  #367 = Utf8               this",
                "  #368 = Utf8               Ljava/lang/Integer;",
                "  #369 = Utf8               Deprecated",
                "  #370 = Utf8               Ljava/lang/Deprecated;",
                "  #371 = Utf8               since",
                "  #372 = Utf8               9",
                "  #373 = Utf8               forRemoval",
                "  #374 = Integer            1",
                "  #375 = Utf8               byteValue",
                "  #376 = Utf8               ()B",
                "  #377 = Utf8               shortValue",
                "  #378 = Utf8               ()S",
                "  #379 = Utf8               longValue",
                "  #380 = Utf8               ()J",
                "  #381 = Utf8               floatValue",
                "  #382 = Utf8               ()F",
                "  #383 = Utf8               doubleValue",
                "  #384 = Utf8               ()D",
                "  #385 = Utf8               equals",
                "  #386 = Utf8               (Ljava/lang/Object;)Z",
                "  #387 = Utf8               obj",
                "  #388 = Utf8               Ljava/lang/Object;",
                "  #389 = Utf8               nm",
                "  #390 = Utf8               v",
                "  #391 = Class              #392          // java/lang/RuntimeException",
                "  #392 = Utf8               java/lang/RuntimeException",
                "  #393 = Utf8               constant",
                "  #394 = Utf8               e",
                "  #395 = Utf8               Ljava/lang/NumberFormatException;",
                "  #396 = Utf8               anotherInteger",
                "  #397 = Utf8               y",
                "  #398 = Utf8               compareUnsigned",
                "  #399 = Utf8               divideUnsigned",
                "  #400 = Utf8               dividend",
                "  #401 = Utf8               divisor",
                "  #402 = Utf8               remainderUnsigned",
                "  #403 = Utf8               highestOneBit",
                "  #404 = Utf8               lowestOneBit",
                "  #405 = Utf8               n",
                "  #406 = Utf8               numberOfTrailingZeros",
                "  #407 = Utf8               bitCount",
                "  #408 = Utf8               rotateLeft",
                "  #409 = Utf8               distance",
                "  #410 = Utf8               rotateRight",
                "  #411 = Utf8               reverse",
                "  #412 = Utf8               compress",
                "  #413 = Utf8               maskPrefix",
                "  #414 = Utf8               maskMove",
                "  #415 = Utf8               t",
                "  #416 = Utf8               j",
                "  #417 = Utf8               maskCount",
                "  #418 = Utf8               expand",
                "  #419 = Utf8               originalMask",
                "  #420 = Utf8               maskMove1",
                "  #421 = Utf8               maskMove2",
                "  #422 = Utf8               maskMove3",
                "  #423 = Utf8               maskMove4",
                "  #424 = Utf8               maskMove5",
                "  #425 = Utf8               Ljdk/internal/vm/annotation/ForceInline;",
                "  #426 = Utf8               signum",
                "  #427 = Utf8               sum",
                "  #428 = Utf8               a",
                "  #429 = Utf8               b",
                "  #430 = Utf8               describeConstable",
                "  #431 = Utf8               ()Ljava/util/Optional;",
                "  #432 = Utf8               ()Ljava/util/Optional<Ljava/lang/Integer;>;",
                "  #433 = Utf8               lookup",
                "  #434 = Utf8               Ljava/lang/invoke/MethodHandles$Lookup;",
                "  #435 = Utf8               (Ljava/lang/Object;)I",
                "  #436 = Utf8               MethodParameters",
                "  #437 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/Object;",
                "  #438 = Class              #439          // java/lang/ReflectiveOperationException",
                "  #439 = Utf8               java/lang/ReflectiveOperationException",
                "  #440 = Utf8               <clinit>",
                "  #441 = Utf8               Ljava/lang/Number;Ljava/lang/Comparable<Ljava/lang/Integer;>;Ljava/lang/constant/Constable;Ljava/lang/constant/ConstantDesc;",
                "  #442 = Utf8               SourceFile",
                "  #443 = Utf8               Integer.java",
                "  #444 = Utf8               Ljdk/internal/ValueBased;",
                "  #445 = Utf8               NestMembers",
                "  #446 = Utf8               InnerClasses",
                "  #447 = Utf8               IntegerCache",
                "  #448 = Class              #449          // java/lang/invoke/MethodHandles$Lookup",
                "  #449 = Utf8               java/lang/invoke/MethodHandles$Lookup",
                "  #450 = Class              #451          // java/lang/invoke/MethodHandles",
                "  #451 = Utf8               java/lang/invoke/MethodHandles",
                "  #452 = Utf8               Lookup"
        );
    }
}
