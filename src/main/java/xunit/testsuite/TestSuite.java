package xunit.testsuite;

import xunit.RTWTestCase;

import java.util.List;
import java.util.stream.Collectors;

public class TestSuite {
    private List<RTWTestCase> testCases;

    public TestSuite(List<RTWTestCase> testCases) {
        this.testCases = testCases;
    }

    public List<TestClassResult> execute() {
        return testCases.stream()
                .map(testCase -> new TestClassResult(getClassName(testCase), testCase.executeMethods()))
                .collect(Collectors.toList());
    }

    private String getClassName(RTWTestCase testCase) {
        return testCase.getClass().toString().split(" ")[1];
    }

}
