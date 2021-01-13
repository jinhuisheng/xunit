package xunit.testcaseexecute;

import org.junit.jupiter.api.Test;
import xunit.testcase.TestResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static xunit.Constants.*;

public class TestCaseExecuteTest {

    @Test
    void execute_one_success_test() {
        ExecuteSuccessMethodTestCase testCase = new ExecuteSuccessMethodTestCase();
        List<TestResult> results = testCase.executeMethods();
        assertThat(results.size()).isEqualTo(1);
        TestResult testResult = results.get(0);
        assertThat(testResult.getMethodName()).isEqualTo(EXECUTE_FAILURE_TEST);
        assertThat(testResult.getSuccess()).isTrue();
    }

    @Test
    void execute_one_failure_test() {
        ExecuteFailMethodTestCase testCase = new ExecuteFailMethodTestCase();
        List<TestResult> results = testCase.executeMethods();
        assertThat(results.size()).isEqualTo(1);
        TestResult testResult = results.get(0);
        assertThat(testResult.getMethodName()).isEqualTo(EXECUTE_FAILURE_TEST);
        assertThat(testResult.getSuccess()).isFalse();
        assertThat(testResult.getFailureMessage()).containsSequence(EXPECTING_FAILURE_MSG_PREFIX);
    }

    @Test
    void execute_test_class_have_success_and_failure_test() {
        ExecuteMultipleMethodTestCase testCase = new ExecuteMultipleMethodTestCase();
        List<TestResult> results = testCase.executeMethods();
        assertThat(results.size()).isEqualTo(2);
        TestResult testResult = results.get(0);
        assertThat(testResult.getMethodName()).isEqualTo(EXECUTE_FAILURE_TEST);
        assertThat(testResult.getSuccess()).isFalse();
        assertThat(testResult.getFailureMessage()).containsSequence(EXPECTING_FAILURE_MSG_PREFIX);
        TestResult testResult2 = results.get(1);
        assertThat(testResult2.getMethodName()).isEqualTo(EXECUTE_SUCCESS_TEST);
        assertThat(testResult2.getSuccess()).isTrue();
        assertThat(testResult2.getFailureMessage()).isEmpty();
    }

}
