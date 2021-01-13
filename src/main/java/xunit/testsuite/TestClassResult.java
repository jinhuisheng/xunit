package xunit.testsuite;

import xunit.testcase.TestResult;

import java.util.List;

public class TestClassResult {
    private String className;
    private List<TestResult> testResults;

    public TestClassResult(String className, List<TestResult> testResults) {

        this.className = className;
        this.testResults = testResults;
    }

    public String getClassName() {
        return className;
    }

    public List<TestResult> getTestResults() {
        return testResults;
    }
}
