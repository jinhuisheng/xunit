package xunit.testcaseexecute;

import org.junit.jupiter.api.Test;
import xunit.TestResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCaseExecuteTest {
    @Test
    void execute_one_success_test() {
        ExecuteSuccessMethodTestCase testCase = new ExecuteSuccessMethodTestCase();
        List<TestResult> results = testCase.executeMethods();
        assertThat(results.size()).isEqualTo(1);
        TestResult testResult = results.get(0);
        assertThat(testResult.getMethodName()).isNotBlank();
        assertThat(testResult.getSuccess()).isTrue();
    }

    @Test
    void execute_one_failure_test() {
        ExecuteFailMethodTestCase testCase = new ExecuteFailMethodTestCase();
        List<TestResult> results = testCase.executeMethods();
        assertThat(results.size()).isEqualTo(1);
        TestResult testResult = results.get(0);
        assertThat(testResult.getMethodName()).isNotBlank();
        assertThat(testResult.getSuccess()).isFalse();
        assertThat(testResult.getFailureMessage()).containsSequence("Expecting:\n");
    }

}
