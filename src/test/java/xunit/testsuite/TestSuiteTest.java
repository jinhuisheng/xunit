package xunit.testsuite;

import org.junit.jupiter.api.Test;
import xunit.TestResult;
import xunit.TestUtil;
import xunit.testcase.SingleMethodTestCase;
import xunit.testcaseexecute.ExecuteMultipleMethodTestCase;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static xunit.Constants.*;

public class TestSuiteTest {
    @Test
    void should_execute_success_with_one_test_class() {
        TestSuite testSuite = new TestSuite(Arrays.asList(new SingleMethodTestCase()));
        List<TestClassResult> results = testSuite.execute();
        assertThat(results.size()).isEqualTo(1);
        TestClassResult testClassResult = results.get(0);
        assertThat(testClassResult.getClassName()).isEqualTo(TestUtil.getClassName(SingleMethodTestCase.class));
        TestResult testMethodResult = testClassResult.getTestResults().get(0);
        assertThat(testMethodResult.getMethodName()).isEqualTo(EXECUTE_SUCCESS_TEST);
        assertThat(testMethodResult.getSuccess()).isEqualTo(true);
    }

    @Test
    void robust_test() {
        TestSuite testSuite = new TestSuite(Arrays.asList(
                new SingleMethodTestCase(),
                new ExecuteMultipleMethodTestCase()
        ));
        List<TestClassResult> results = testSuite.execute();
        assertThat(results.size()).isEqualTo(2);
        assertThat(results.get(0).getTestResults().size()).isEqualTo(1);

        TestClassResult secondTestClassResult = results.get(1);
        assertThat(secondTestClassResult.getTestResults().size()).isEqualTo(2);
        assertThat(secondTestClassResult.getClassName())
                .isEqualTo(TestUtil.getClassName(ExecuteMultipleMethodTestCase.class));

        TestResult firstTestMethodResult = secondTestClassResult.getTestResults().get(0);
        assertThat(firstTestMethodResult.getMethodName()).isEqualTo(EXECUTE_FAILURE_TEST);
        assertThat(firstTestMethodResult.getSuccess()).isEqualTo(false);
        assertThat(firstTestMethodResult.getFailureMessage()).containsSequence(EXPECTING_FAILURE_MSG_PREFIX);
    }

}
