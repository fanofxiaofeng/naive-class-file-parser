package com.test.presenter;

import com.test.annotations.GeneratedBy;
import com.test.generator.SuiteGeneratorImpl;
import com.test.presenter.cp.CpTestSuite;
import com.test.presenter.misc.MiscTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        MiscTestSuite.class,
        CpTestSuite.class,
})
@RunWith(Suite.class)
public class PresenterTestSuite {
}
