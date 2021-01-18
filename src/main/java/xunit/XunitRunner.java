package xunit;

import xunit.testcase.TestResult;
import xunit.testsuite.TestClassResult;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class XunitRunner {

    public static void main(String[] args)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String result = run(args);
        System.out.println(result);
    }

    public static String run(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        Class testSuiteClass = Class.forName(args[0]);
        MyTestSuite testSuite = (MyTestSuite) testSuiteClass.newInstance();
        List<TestClassResult> results = testSuite.run();
        results.forEach(testClassResult -> outputTestClassResult(testClassResult, printStream));
        return out.toString();
    }

    private static void outputTestClassResult(TestClassResult testClassResult, PrintStream printStream) {
        printStream.println("\n测试执行结果:\n");
        printStream.println("测试类:" + testClassResult.getClassName() + ":\n");
        for (TestResult testResult : testClassResult.getTestResults()) {
            outputTestMethodResult(testResult, printStream);
        }
    }

    private static void outputTestMethodResult(TestResult testResult, PrintStream printStream) {
        printStream.println(String.format("method:%s,result:%s,msg:%s",
                testResult.getMethodName(),
                testResult.getSuccess(),
                testResult.getFailureMessage()));
    }
}
