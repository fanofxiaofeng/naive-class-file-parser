package com.test.present.cp.case12;

import com.test.present.cp.ConstantPoolPresenterTestBase;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EnumCpTest extends ConstantPoolPresenterTestBase {

    @Before
    public void prepare() throws IOException, ClassNotFoundException {
        buildRealLines(Class.forName("java.lang.Enum"));
    }

    @Test
    public void test() {
        expectedLines = List.of(
                "    #3 = NameAndType        #5:#6         // name:Ljava/lang/String;",
                "    #8 = NameAndType        #9:#10        // ordinal:I",
                "   #13 = NameAndType        #15:#16       // \"<init>\":()V",
                "   #18 = NameAndType        #19:#10       // hash:I",
                "   #22 = NameAndType        #24:#25       // identityHashCode:(Ljava/lang/Object;)I",
                "   #30 = NameAndType        #31:#32       // getClass:()Ljava/lang/Class;",
                "   #34 = NameAndType        #35:#32       // getDeclaringClass:()Ljava/lang/Class;",
                "   #41 = NameAndType        #43:#32       // getSuperclass:()Ljava/lang/Class;",
                "   #45 = NameAndType        #46:#47       // describeConstable:()Ljava/util/Optional;",
                "   #49 = NameAndType        #50:#51       // apply:(Ljava/lang/Enum;)Ljava/util/function/Function;",
                "   #54 = NameAndType        #56:#57       // map:(Ljava/util/function/Function;)Ljava/util/Optional;",
                "   #59 = NameAndType        #60:#61       // enumConstantDirectory:()Ljava/util/Map;",
                "   #64 = NameAndType        #66:#67       // get:(Ljava/lang/Object;)Ljava/lang/Object;",
                "   #73 = NameAndType        #15:#74       // \"<init>\":(Ljava/lang/String;)V",
                "   #83 = NameAndType        #84:#85       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;",
                "   #87 = NameAndType        #88:#89       // getCanonicalName:()Ljava/lang/String;",
                "   #93 = NameAndType        #94:#89       // toString:()Ljava/lang/String;",
                "  #102 = NameAndType        #103:#104     // compareTo:(Ljava/lang/Enum;)I",
                "  #107 = NameAndType        #109:#110     // of:(Ljava/lang/constant/ClassDesc;Ljava/lang/String;)Ljava/lang/Enum$EnumDesc;",
                "  #188 = NameAndType        #176:#177     // lambda$describeConstable$0:(Ljava/lang/constant/ClassDesc;)Ljava/lang/Enum$EnumDesc;",
                "  #193 = NameAndType        #195:#196     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;"
        );
    }
}
