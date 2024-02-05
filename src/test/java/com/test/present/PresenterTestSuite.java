package com.test.present;


import com.test.present.misc.MiscTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({
        MiscTestSuite.class,
        ConstantPoolTestSuite.class,
})
@RunWith(Suite.class)
public class PresenterTestSuite {
}
