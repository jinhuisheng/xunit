package xunit;

import xunit.testcase.TestResult;
import xunit.testsuite.TestClassResult;

import java.util.List;

public class XunitRunner {

    public static void main(String[] args)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class testSuiteClass = Class.forName(args[0]);
        MyTestSuite testSuite = (MyTestSuite) testSuiteClass.newInstance();
        List<TestClassResult> results = testSuite.run();
        results.forEach(XunitRunner::outputTestClassResult);
        if (hasFailed(results)) {
            System.out.println("xxxx");
            System.exit(2);
        }
    }

    private static boolean hasFailed(List<TestClassResult> results) {
        return results.stream().anyMatch(XunitRunner::isFailed);
    }

    private static boolean isFailed(TestClassResult result) {
        return result.getTestResults().stream().anyMatch(testResult -> !testResult.getSuccess());
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
