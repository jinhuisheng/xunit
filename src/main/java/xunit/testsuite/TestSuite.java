package xunit.testsuite;

import xunit.testcase.RTWTestCase;

import java.util.List;
import java.util.stream.Collectors;

public class TestSuite {
    private List<RTWTestCase> testCases;

    public TestSuite(List<RTWTestCase> testCases) {
        this.testCases = testCases;
    }

    public List<TestClassResult> execute() {
        return testCases.stream().map(this::execute).collect(Collectors.toList());
    }

    private TestClassResult execute(RTWTestCase testCase) {
        return new TestClassResult(testCase.getClass(), testCase.executeMethods());
    }

}
