package com.test.present.cp.case12;

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
                "     #3 = NameAndType        #5:#6        // \"<init>\":()V",
                "    #11 = NameAndType        #13:#14      // value:[B",
                "    #16 = NameAndType        #17:#18      // coder:B",
                "    #20 = NameAndType        #21:#22      // hash:I",
                "    #24 = NameAndType        #25:#26      // hashIsZero:Z",
                "    #28 = NameAndType        #5:#29       // \"<init>\":([CIILjava/lang/Void;)V",
                "    #31 = NameAndType        #32:#33      // rangeCheck:([CII)Ljava/lang/Void;",
                "    #35 = NameAndType        #36:#37      // checkBoundsOffCount:(III)I",
                "    #39 = NameAndType        #40:#26      // COMPACT_STRINGS:Z",
                "    #43 = NameAndType        #45:#46      // toBytes:([III)[B",
                "    #52 = NameAndType        #54:#55      // copyOfRange:([BII)[B",
                "    #57 = NameAndType        #58:#59      // newBytesFor:(I)[B",
                "    #61 = NameAndType        #62:#63      // putChar:([BII)V",
                "    #65 = NameAndType        #5:#66       // \"<init>\":([BIII)V",
                "    #68 = NameAndType        #69:#70      // lookupCharset:(Ljava/lang/String;)Ljava/nio/charset/Charset;",
                "    #72 = NameAndType        #5:#73       // \"<init>\":(Ljava/nio/charset/Charset;[BII)V",
                "    #76 = NameAndType        #78:#79      // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;",
                "    #84 = NameAndType        #86:#87      // INSTANCE:Lsun/nio/cs/UTF_8;",
                "    #90 = NameAndType        #92:#93      // countPositives:([BII)I",
                "    #96 = NameAndType        #98:#99      // arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V",
                "   #101 = NameAndType        #102:#103    // decode2:(II)C",
                "   #105 = NameAndType        #106:#107    // copyOf:([BI)[B",
                "   #109 = NameAndType        #110:#111    // inflate:([BI[BII)V",
                "   #113 = NameAndType        #114:#115    // decodeUTF8_UTF16:([BII[BIZ)I",
                "   #118 = NameAndType        #86:#120     // INSTANCE:Lsun/nio/cs/ISO_8859_1;",
                "   #122 = NameAndType        #110:#55     // inflate:([BII)[B",
                "   #125 = NameAndType        #86:#127     // INSTANCE:Lsun/nio/cs/US_ASCII;",
                "   #129 = NameAndType        #130:#131    // hasNegatives:([BII)Z",
                "   #134 = NameAndType        #135:#136    // newDecoder:()Ljava/nio/charset/CharsetDecoder;",
                "   #140 = NameAndType        #141:#142    // isASCIICompatible:()Z",
                "   #144 = NameAndType        #145:#142    // isLatin1Decodable:()Z",
                "   #147 = NameAndType        #148:#149    // decodeToLatin1:([BII[B)I",
                "   #152 = NameAndType        #154:#155    // maxCharsPerByte:()F",
                "   #157 = NameAndType        #158:#159    // scale:(IF)I",
                "   #162 = NameAndType        #164:#165    // REPLACE:Ljava/nio/charset/CodingErrorAction;",
                "   #167 = NameAndType        #168:#169    // onMalformedInput:(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;",
                "   #171 = NameAndType        #172:#169    // onUnmappableCharacter:(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;",
                "   #174 = NameAndType        #175:#176    // decode:([BII[C)I",
                "   #178 = NameAndType        #179:#180    // compress:([CII)[B",
                "   #182 = NameAndType        #45:#180     // toBytes:([CII)[B",
                "   #184 = NameAndType        #185:#186    // getClass:()Ljava/lang/Class;",
                "   #189 = NameAndType        #191:#192    // getClassLoader0:()Ljava/lang/ClassLoader;",
                "   #194 = NameAndType        #195:#196    // getSecurityManager:()Ljava/lang/SecurityManager;",
                "   #198 = NameAndType        #199:#200    // decodeWithDecoder:(Ljava/nio/charset/CharsetDecoder;[C[BII)I",
                "   #206 = NameAndType        #5:#207      // \"<init>\":(Ljava/lang/Throwable;)V",
                "   #209 = NameAndType        #5:#210      // \"<init>\":([BB)V",
                "   #212 = NameAndType        #213:#214    // newStringNoRepl1:([BLjava/nio/charset/Charset;)Ljava/lang/String;",
                "   #218 = NameAndType        #219:#220    // getCause:()Ljava/lang/Throwable;",
                "   #224 = NameAndType        #225:#226    // newStringUTF8NoRepl:([BIIZ)Ljava/lang/String;",
                "   #228 = NameAndType        #229:#230    // throwMalformed:([B)V",
                "   #232 = NameAndType        #5:#233      // \"<init>\":([BIILjava/nio/charset/Charset;)V",
                "   #236 = NameAndType        #237:#70     // forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;",
                "   #245 = NameAndType        #5:#246      // \"<init>\":(Ljava/lang/String;)V",
                "   #248 = NameAndType        #249:#250    // encodeUTF8:(B[BZ)[B",
                "   #252 = NameAndType        #253:#254    // encode8859_1:(B[B)[B",
                "   #256 = NameAndType        #257:#254    // encodeASCII:(B[B)[B",
                "   #259 = NameAndType        #260:#261    // encodeWithEncoder:(Ljava/nio/charset/Charset;B[BZ)[B",
                "   #263 = NameAndType        #264:#265    // newEncoder:()Ljava/nio/charset/CharsetEncoder;",
                "   #268 = NameAndType        #270:#155    // maxBytesPerChar:()F",
                "   #276 = NameAndType        #277:#278    // clone:()Ljava/lang/Object;",
                "   #280 = NameAndType        #281:#149    // encodeFromLatin1:([BII[B)I",
                "   #283 = NameAndType        #284:#149    // encodeFromUTF16:([BII[B)I",
                "   #286 = NameAndType        #287:#288    // safeTrim:([BIZ)[B",
                "   #290 = NameAndType        #168:#291    // onMalformedInput:(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetEncoder;",
                "   #293 = NameAndType        #172:#291    // onUnmappableCharacter:(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetEncoder;",
                "   #295 = NameAndType        #296:#297    // toChars:([B)[C",
                "   #301 = NameAndType        #303:#304    // wrap:([B)Ljava/nio/ByteBuffer;",
                "   #307 = NameAndType        #303:#309    // wrap:([CII)Ljava/nio/CharBuffer;",
                "   #311 = NameAndType        #312:#313    // encode:(Ljava/nio/CharBuffer;Ljava/nio/ByteBuffer;Z)Ljava/nio/charset/CoderResult;",
                "   #316 = NameAndType        #318:#142    // isUnderflow:()Z",
                "   #320 = NameAndType        #321:#6      // throwException:()V",
                "   #323 = NameAndType        #324:#325    // flush:(Ljava/nio/ByteBuffer;)Ljava/nio/charset/CoderResult;",
                "   #327 = NameAndType        #328:#329    // position:()I",
                "   #331 = NameAndType        #17:#332     // coder:()B",
                "   #334 = NameAndType        #13:#335     // value:()[B",
                "   #337 = NameAndType        #338:#339    // getBytesNoRepl1:(Ljava/lang/String;Ljava/nio/charset/Charset;)[B",
                "   #343 = NameAndType        #344:#345    // isASCII:([B)Z",
                "   #347 = NameAndType        #253:#250    // encode8859_1:(B[BZ)[B",
                "   #349 = NameAndType        #350:#230    // throwUnmappable:([B)V",
                "   #352 = NameAndType        #353:#354    // replaceNegatives:([BI)V",
                "   #356 = NameAndType        #357:#358    // getChar:([BI)C",
                "   #361 = NameAndType        #363:#364    // isHighSurrogate:(C)Z",
                "   #366 = NameAndType        #367:#364    // isLowSurrogate:(C)Z",
                "   #369 = NameAndType        #370:#371    // implEncodeISOArray:([BI[BII)I",
                "   #373 = NameAndType        #350:#374    // throwUnmappable:(I)V",
                "   #376 = NameAndType        #110:#377    // inflate:([BI[CII)V",
                "   #381 = NameAndType        #382:#383    // isNotContinuation:(I)Z",
                "   #385 = NameAndType        #229:#386    // throwMalformed:(II)V",
                "   #388 = NameAndType        #389:#390    // isMalformed3:(III)Z",
                "   #392 = NameAndType        #393:#394    // malformed3:([BI)I",
                "   #396 = NameAndType        #397:#398    // decode3:(III)C",
                "   #400 = NameAndType        #401:#364    // isSurrogate:(C)Z",
                "   #403 = NameAndType        #404:#405    // isMalformed3_2:(II)Z",
                "   #407 = NameAndType        #408:#409    // decode4:(IIII)I",
                "   #411 = NameAndType        #412:#390    // isMalformed4:(III)Z",
                "   #414 = NameAndType        #415:#383    // isSupplementaryCodePoint:(I)Z",
                "   #417 = NameAndType        #418:#394    // malformed4:([BI)I",
                "   #420 = NameAndType        #421:#422    // highSurrogate:(I)C",
                "   #424 = NameAndType        #425:#422    // lowSurrogate:(I)C",
                "   #427 = NameAndType        #428:#405    // isMalformed4_2:(II)Z",
                "   #430 = NameAndType        #431:#383    // isMalformed4_3:(I)Z",
                "   #433 = NameAndType        #303:#434    // wrap:([BII)Ljava/nio/ByteBuffer;",
                "   #436 = NameAndType        #175:#437    // decode:(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;",
                "   #439 = NameAndType        #324:#440    // flush:(Ljava/nio/CharBuffer;)Ljava/nio/charset/CoderResult;",
                "   #448 = NameAndType        #449:#450    // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #452 = NameAndType        #449:#453    // append:(I)Ljava/lang/StringBuilder;",
                "   #457 = NameAndType        #458:#459    // toString:()Ljava/lang/String;",
                "   #461 = NameAndType        #5:#374      // \"<init>\":(I)V",
                "   #463 = NameAndType        #5:#464      // \"<init>\":(Ljava/lang/String;Ljava/lang/Throwable;)V",
                "   #469 = NameAndType        #470:#471    // encodeUTF8_UTF16:([BZ)[B",
                "   #473 = NameAndType        #474:#475    // toCodePoint:(CC)I",
                "   #477 = NameAndType        #478:#479    // defaultCharset:()Ljava/nio/charset/Charset;",
                "   #485 = NameAndType        #5:#486      // \"<init>\":(Ljava/lang/AbstractStringBuilder;Ljava/lang/Void;)V",
                "   #488 = NameAndType        #489:#142    // isLatin1:()Z",
                "   #491 = NameAndType        #492:#358    // charAt:([BI)C",
                "   #495 = NameAndType        #496:#386    // checkIndex:(II)V",
                "   #498 = NameAndType        #499:#93     // codePointAt:([BII)I",
                "   #501 = NameAndType        #502:#329    // length:()I",
                "   #504 = NameAndType        #505:#394    // codePointBefore:([BI)I",
                "   #507 = NameAndType        #508:#37     // checkFromToIndex:(III)I",
                "   #510 = NameAndType        #511:#93     // codePointCount:([BII)I",
                "   #513 = NameAndType        #514:#515    // offsetByCodePoints:(Ljava/lang/CharSequence;II)I",
                "   #517 = NameAndType        #518:#519    // checkBoundsBeginEnd:(III)V",
                "   #521 = NameAndType        #522:#523    // getChars:([BII[CI)V",
                "   #526 = NameAndType        #527:#528    // getBytes:([BII[BI)V",
                "   #531 = NameAndType        #312:#532    // encode:(Ljava/nio/charset/Charset;B[B)[B",
                "   #537 = NameAndType        #538:#539    // equals:([B[B)Z",
                "   #541 = NameAndType        #542:#543    // contentEquals:(Ljava/lang/CharSequence;)Z",
                "   #548 = NameAndType        #549:#335    // getValue:()[B",
                "   #551 = NameAndType        #552:#332    // getCoder:()B",
                "   #555 = NameAndType        #557:#558    // mismatch:([B[BI)I",
                "   #560 = NameAndType        #542:#561    // contentEquals:([B[BI)Z",
                "   #563 = NameAndType        #564:#565    // nonSyncContentEquals:(Ljava/lang/AbstractStringBuilder;)Z",
                "   #567 = NameAndType        #538:#568    // equals:(Ljava/lang/Object;)Z",
                "   #573 = NameAndType        #492:#422    // charAt:(I)C",
                "   #575 = NameAndType        #542:#576    // contentEquals:([BLjava/lang/CharSequence;I)Z",
                "   #578 = NameAndType        #579:#580    // regionMatches:(ZILjava/lang/String;II)Z",
                "   #582 = NameAndType        #583:#584    // compareTo:([B[B)I",
                "   #587 = NameAndType        #588:#584    // compareToUTF16:([B[B)I",
                "   #590 = NameAndType        #591:#584    // compareToLatin1:([B[B)I",
                "   #593 = NameAndType        #594:#595    // CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;",
                "   #598 = NameAndType        #600:#601    // compare:(Ljava/lang/Object;Ljava/lang/Object;)I",
                "   #603 = NameAndType        #557:#371    // mismatch:([BI[BII)I",
                "   #606 = NameAndType        #579:#607    // regionMatches:(ILjava/lang/String;II)Z",
                "   #609 = NameAndType        #610:#611    // regionMatchesCI:([BI[BII)Z",
                "   #614 = NameAndType        #615:#611    // regionMatchesCI_UTF16:([BI[BII)Z",
                "   #617 = NameAndType        #618:#611    // regionMatchesCI_Latin1:([BI[BII)Z",
                "   #620 = NameAndType        #621:#622    // startsWith:(Ljava/lang/String;I)Z",
                "   #624 = NameAndType        #625:#626    // hashCode:([B)I",
                "   #629 = NameAndType        #630:#631    // indexOf:(II)I",
                "   #633 = NameAndType        #630:#634    // indexOf:([BIII)I",
                "   #637 = NameAndType        #638:#631    // lastIndexOf:(II)I",
                "   #640 = NameAndType        #638:#93     // lastIndexOf:([BII)I",
                "   #643 = NameAndType        #630:#584    // indexOf:([B[B)I",
                "   #646 = NameAndType        #647:#584    // indexOfLatin1:([B[B)I",
                "   #649 = NameAndType        #630:#650    // indexOf:([BBILjava/lang/String;I)I",
                "   #653 = NameAndType        #630:#37     // indexOf:(III)I",
                "   #656 = NameAndType        #658:#659    // clamp:(JII)I",
                "   #661 = NameAndType        #630:#371    // indexOf:([BI[BII)I",
                "   #664 = NameAndType        #647:#371    // indexOfLatin1:([BI[BII)I",
                "   #666 = NameAndType        #638:#667    // lastIndexOf:(Ljava/lang/String;I)I",
                "   #669 = NameAndType        #638:#650    // lastIndexOf:([BBILjava/lang/String;I)I",
                "   #671 = NameAndType        #638:#371    // lastIndexOf:([BI[BII)I",
                "   #674 = NameAndType        #675:#371    // lastIndexOfLatin1:([BI[BII)I",
                "   #677 = NameAndType        #678:#679    // substring:(II)Ljava/lang/String;",
                "   #681 = NameAndType        #682:#683    // newString:([BII)Ljava/lang/String;",
                "   #686 = NameAndType        #687:#142    // isEmpty:()Z",
                "   #690 = NameAndType        #692:#693    // simpleConcat:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;",
                "   #695 = NameAndType        #696:#697    // replace:([BCC)Ljava/lang/String;",
                "   #701 = NameAndType        #703:#704    // matches:(Ljava/lang/String;Ljava/lang/CharSequence;)Z",
                "   #707 = NameAndType        #630:#708    // indexOf:(Ljava/lang/String;)I",
                "   #710 = NameAndType        #711:#712    // compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;",
                "   #714 = NameAndType        #715:#716    // matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;",
                "   #719 = NameAndType        #721:#722    // replaceFirst:(Ljava/lang/String;)Ljava/lang/String;",
                "   #724 = NameAndType        #725:#722    // replaceAll:(Ljava/lang/String;)Ljava/lang/String;",
                "   #727 = NameAndType        #696:#728    // replace:(CC)Ljava/lang/String;",
                "   #730 = NameAndType        #696:#731    // replace:([BI[BI[BI)Ljava/lang/String;",
                "   #733 = NameAndType        #696:#734    // replace:([BIZ[BIZ[BIZ)Ljava/lang/String;",
                "   #736 = NameAndType        #737:#631    // addExact:(II)I",
                "   #739 = NameAndType        #740:#631    // multiplyExact:(II)I",
                "   #750 = NameAndType        #449:#751    // append:(C)Ljava/lang/StringBuilder;",
                "   #753 = NameAndType        #754:#755    // split:(Ljava/lang/String;IZ)[Ljava/lang/String;",
                "   #759 = NameAndType        #630:#760    // indexOf:(I)I",
                "   #764 = NameAndType        #754:#765    // split:(CIZ)[Ljava/lang/String;",
                "   #767 = NameAndType        #768:#769    // splitWithDelimiters:(Ljava/lang/CharSequence;I)[Ljava/lang/String;",
                "   #771 = NameAndType        #754:#769    // split:(Ljava/lang/CharSequence;I)[Ljava/lang/String;",
                "   #776 = NameAndType        #777:#778    // valueOf:(C)Ljava/lang/String;",
                "   #780 = NameAndType        #781:#568    // add:(Ljava/lang/Object;)Z",
                "   #783 = NameAndType        #784:#329    // size:()I",
                "   #786 = NameAndType        #787:#788    // get:(I)Ljava/lang/Object;",
                "   #790 = NameAndType        #791:#792    // subList:(II)Ljava/util/List;",
                "   #795 = NameAndType        #797:#798    // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;",
                "   #802 = NameAndType        #777:#803    // valueOf:(Ljava/lang/Object;)Ljava/lang/String;",
                "   #805 = NameAndType        #806:#807    // join:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ljava/lang/String;",
                "   #811 = NameAndType        #812:#813    // newArray:(J)[B",
                "   #815 = NameAndType        #527:#816    // getBytes:([BIB)V",
                "   #819 = NameAndType        #821:#822    // iterator:()Ljava/util/Iterator;",
                "   #825 = NameAndType        #827:#142    // hasNext:()Z",
                "   #829 = NameAndType        #830:#278    // next:()Ljava/lang/Object;",
                "   #832 = NameAndType        #106:#833    // copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;",
                "   #835 = NameAndType        #836:#837    // toLowerCase:(Ljava/lang/String;[BLjava/util/Locale;)Ljava/lang/String;",
                "   #841 = NameAndType        #843:#844    // getDefault:()Ljava/util/Locale;",
                "   #846 = NameAndType        #836:#847    // toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;",
                "   #849 = NameAndType        #850:#837    // toUpperCase:(Ljava/lang/String;[BLjava/util/Locale;)Ljava/lang/String;",
                "   #853 = NameAndType        #850:#847    // toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;",
                "   #855 = NameAndType        #856:#857    // trim:([B)Ljava/lang/String;",
                "   #860 = NameAndType        #861:#857    // strip:([B)Ljava/lang/String;",
                "   #864 = NameAndType        #865:#857    // stripLeading:([B)Ljava/lang/String;",
                "   #868 = NameAndType        #869:#857    // stripTrailing:([B)Ljava/lang/String;",
                "   #872 = NameAndType        #873:#329    // indexOfNonWhitespace:()I",
                "   #875 = NameAndType        #876:#877    // lines:([B)Ljava/util/stream/Stream;",
                "   #880 = NameAndType        #876:#881    // lines:()Ljava/util/stream/Stream;",
                "   #885 = NameAndType        #886:#887    // repeat:(I)Ljava/lang/String;",
                "   #889 = NameAndType        #890:#891    // apply:(Ljava/lang/String;)Ljava/util/function/Function;",
                "   #894 = NameAndType        #896:#897    // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;",
                "   #902 = NameAndType        #890:#903    // apply:()Ljava/util/function/Function;",
                "   #905 = NameAndType        #890:#906    // apply:(I)Ljava/util/function/Function;",
                "   #911 = NameAndType        #913:#914    // joining:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/util/stream/Collector;",
                "   #916 = NameAndType        #917:#918    // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;",
                "   #920 = NameAndType        #873:#626    // indexOfNonWhitespace:([B)I",
                "   #923 = NameAndType        #924:#626    // lastIndexOfNonWhitespace:([B)I",
                "   #927 = NameAndType        #928:#929    // toList:()Ljava/util/List;",
                "   #931 = NameAndType        #932:#933    // outdent:(Ljava/util/List;)I",
                "   #935 = NameAndType        #936:#881    // stream:()Ljava/util/stream/Stream;",
                "   #941 = NameAndType        #942:#631    // min:(II)I",
                "   #946 = NameAndType        #947:#142    // isBlank:()Z",
                "   #949 = NameAndType        #950:#951    // toCharArray:()[C",
                "   #955 = NameAndType        #777:#956    // valueOf:(C)Ljava/lang/Character;",
                "   #958 = NameAndType        #777:#959    // valueOf:(I)Ljava/lang/Integer;",
                "   #961 = NameAndType        #962:#963    // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
                "   #966 = NameAndType        #5:#967      // \"<init>\":([CII)V",
                "   #970 = NameAndType        #890:#79     // apply:(Ljava/lang/Object;)Ljava/lang/Object;",
                "   #977 = NameAndType        #5:#354      // \"<init>\":([BI)V",
                "   #983 = NameAndType        #985:#986    // intStream:(Ljava/util/Spliterator$OfInt;Z)Ljava/util/stream/IntStream;",
                "   #994 = NameAndType        #962:#995    // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;",
                "   #998 = NameAndType        #5:#999      // \"<init>\":(Ljava/util/Locale;)V",
                "  #1004 = NameAndType        #5:#1005     // \"<init>\":([C)V",
                "  #1011 = NameAndType        #1012:#383   // canEncode:(I)Z",
                "  #1014 = NameAndType        #45:#1015    // toBytes:(C)[B",
                "  #1018 = NameAndType        #458:#887    // toString:(I)Ljava/lang/String;",
                "  #1021 = NameAndType        #458:#1023   // toString:(J)Ljava/lang/String;",
                "  #1026 = NameAndType        #458:#1028   // toString:(F)Ljava/lang/String;",
                "  #1031 = NameAndType        #458:#1033   // toString:(D)Ljava/lang/String;",
                "  #1037 = NameAndType        #1038:#210   // fill:([BB)V",
                "  #1040 = NameAndType        #1041:#66    // repeatCopyRest:([BIII)V",
                "  #1044 = NameAndType        #1045:#26    // maybeLatin1:Z",
                "  #1047 = NameAndType        #179:#55     // compress:([BII)[B",
                "  #1050 = NameAndType        #1052:#1053  // SIOOBE_FORMATTER:Ljava/util/function/BiFunction;",
                "  #1055 = NameAndType        #496:#1056   // checkIndex:(IILjava/util/function/BiFunction;)I",
                "  #1058 = NameAndType        #508:#1059   // checkFromToIndex:(IIILjava/util/function/BiFunction;)I",
                "  #1061 = NameAndType        #1062:#1059  // checkFromIndexSize:(IIILjava/util/function/BiFunction;)I",
                "  #1064 = NameAndType        #1065:#383   // isBmpCodePoint:(I)Z",
                "  #1067 = NameAndType        #1068:#59    // toBytesSupplementary:(I)[B",
                "  #1073 = NameAndType        #1075:#1076  // of:(Ljava/lang/Object;)Ljava/util/Optional;",
                "  #1078 = NameAndType        #583:#708    // compareTo:(Ljava/lang/String;)I",
                "  #1080 = NameAndType        #1081:#1082  // resolveConstantDesc:(Ljava/lang/invoke/MethodHandles$Lookup;)Ljava/lang/String;",
                "  #1084 = NameAndType        #924:#329    // lastIndexOfNonWhitespace:()I",
                "  #1087 = NameAndType        #678:#887    // substring:(I)Ljava/lang/String;",
                "  #1089 = NameAndType        #865:#459    // stripLeading:()Ljava/lang/String;",
                "  #1093 = NameAndType        #1094:#1095  // serialPersistentFields:[Ljava/io/ObjectStreamField;",
                "  #1415 = NameAndType        #1405:#1284  // lambda$indent$0:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
                "  #1419 = NameAndType        #1404:#722   // lambda$indent$1:(Ljava/lang/String;)Ljava/lang/String;",
                "  #1422 = NameAndType        #1403:#1399  // lambda$indent$2:(ILjava/lang/String;)Ljava/lang/String;",
                "  #1425 = NameAndType        #1398:#1399  // lambda$stripIndent$3:(ILjava/lang/String;)Ljava/lang/String;",
                "  #1429 = NameAndType        #1431:#1432  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"
        );
    }
}