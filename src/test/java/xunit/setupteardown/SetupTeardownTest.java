package xunit.setupteardown;

import org.junit.jupiter.api.Test;
import xunit.Constants;
import xunit.testcase.TestResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SetupTeardownTest {
    @Test
    void use_set_up() {
        HasSetupMethodTestCase testCase = new HasSetupMethodTestCase();
        List<TestResult> testResults = testCase.executeMethods();
        assertThat(testResults.size()).isEqualTo(2);
        assertThat(Constants.LIST.size()).isEqualTo(2);
    }

    @Test
    void use_set_up_and_tear_down() {
        HasSetupAndTearDownMethodTestCase testCase = new HasSetupAndTearDownMethodTestCase();
        List<TestResult> testResults = testCase.executeMethods();
        assertThat(testResults.size()).isEqualTo(1);
        assertThat(Constants.ANOTHER_LIST.size()).isEqualTo(0);
    }


}
