package xunit;

import xunit.testsuite.TestClassResult;
import xunit.testsuite.TestSuite;

import java.util.Arrays;
import java.util.List;

public class MyTestSuite {
    private final TestSuite testSuite;

    public MyTestSuite() {
        testSuite = new TestSuite(Arrays.asList(new MyTestCase()));
    }

    public List<TestClassResult> run() {
        return testSuite.execute();
    }

}
