package xunit.testsuite;

import xunit.testcase.RTWTestCase;
import xunit.testcase.TestResult;

import java.util.List;

public class TestClassResult {
    private Class<? extends RTWTestCase> testClass;
    private List<TestResult> testResults;

    public TestClassResult(Class<? extends RTWTestCase> testClass, List<TestResult> testResults) {
        this.testClass = testClass;
        this.testResults = testResults;
    }

    public String getClassName() {
        return testClass.toString().split(" ")[1];
    }

    public List<TestResult> getTestResults() {
        return testResults;
    }

}
