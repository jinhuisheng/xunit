package xunit.testsuite;

import org.junit.jupiter.api.Test;
import xunit.TestResult;
import xunit.TestUtil;
import xunit.testcase.SingleMethodTestCase;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static xunit.Constants.*;

public class TestSuiteTest {
    @Test
    void should_execute_and_get_right_test_class_result_count() {
        TestSuite testSuite = new TestSuite(Arrays.asList(new SingleMethodTestCase()));
        List<TestClassResult> results = testSuite.execute();
        assertThat(results.size()).isEqualTo(1);
        TestClassResult testClassResult = results.get(0);
        assertThat(testClassResult.getClassName()).isEqualTo(TestUtil.getClassName(SingleMethodTestCase.class));
        TestResult testMethodResult = testClassResult.getTestResults().get(0);
        assertThat(testMethodResult.getMethodName()).isEqualTo(EXECUTE_SUCCESS_TEST);
        assertThat(testMethodResult.getSuccess()).isEqualTo(true);
    }
}
