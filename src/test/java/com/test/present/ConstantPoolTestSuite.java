package com.test.present;

import com.test.present.cp.case1.Case1TestSuite;
import com.test.present.cp.case10.Case10TestSuite;
import com.test.present.cp.case11.Case11TestSuite;
import com.test.present.cp.case12.Case12TestSuite;
import com.test.present.cp.case15.Case15TestSuite;
import com.test.present.cp.case16.Case16TestSuite;
import com.test.present.cp.case18.Case18TestSuite;
import com.test.present.cp.case6.Case6TestSuite;
import com.test.present.cp.case7.Case7TestSuite;
import com.test.present.cp.case8.Case8TestSuite;
import com.test.present.cp.case9.Case9TestSuite;
import com.test.present.cp.case_all.CaseAllTestSuite;
import com.test.present.cp.case3.Case3TestSuite;
import com.test.present.cp.case4.Case4TestSuite;
import com.test.present.cp.case5.Case5TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = {
        Case1TestSuite.class,
        Case3TestSuite.class,
        Case4TestSuite.class,
        Case5TestSuite.class,
        Case6TestSuite.class,
        Case7TestSuite.class,
        Case8TestSuite.class,
        Case9TestSuite.class,
        Case10TestSuite.class,
        Case11TestSuite.class,
        Case12TestSuite.class,
        Case15TestSuite.class,
        Case16TestSuite.class,
        Case18TestSuite.class,
        CaseAllTestSuite.class
})
public class ConstantPoolTestSuite {

}
