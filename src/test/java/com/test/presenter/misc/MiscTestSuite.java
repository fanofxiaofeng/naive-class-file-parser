package com.test.presenter.misc;

import com.test.annotations.GeneratedBy;
import com.test.generator.SuiteGeneratorImpl;
import com.test.presenter.misc.kt.KtTestSuite;
import com.test.presenter.misc.specific.SpecificTestSuite;
import com.test.presenter.misc.standard.StandardTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@GeneratedBy(SuiteGeneratorImpl.class)
@Suite.SuiteClasses({
        SpecificTestSuite.class,
        StandardTestSuite.class,
        KtTestSuite.class,
})
@RunWith(Suite.class)
public class MiscTestSuite {
}
