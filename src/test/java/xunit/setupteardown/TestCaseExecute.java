package xunit.setupteardown;

import xunit.testcase.TestResult;
import xunit.testsuite.TestClassResult;
import xunit.testsuite.TestSuite;

import java.util.Arrays;
import java.util.List;

public class TestCaseExecute {
    public static void main(String[] args) {
        TestSuite testSuite = new TestSuite(Arrays.asList(new SetupTeardownTestCase()));
        List<TestClassResult> result = testSuite.execute();
        result.forEach(TestCaseExecute::outputTestClassResult);
    }

    private static void outputTestClassResult(TestClassResult testClassResult) {
        System.out.println("\n测试执行结果:\n");
        System.out.println("测试类:" + testClassResult.getClassName() + ":\n");
        for (TestResult testResult : testClassResult.getTestResults()) {
            outputTestMethodResult(testResult);
        }
    }

    private static void outputTestMethodResult(TestResult testResult) {
        System.out.println(String.format("method:%s,result:%s,msg:%s",
                testResult.getMethodName(),
                testResult.getSuccess(),
                testResult.getFailureMessage()));
    }
}
