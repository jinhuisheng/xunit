package xunit.setupteardown;

import xunit.Constants;
import xunit.testcase.RTWTestCase;
import xunit.testcase.TestResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SetupTeardownTestCase extends RTWTestCase {

    void use_set_up() {
        HasSetupMethodTestCase testCase = new HasSetupMethodTestCase();
        List<TestResult> testResults = testCase.executeMethods();
        assertThat(testResults.size()).isEqualTo(2);
        assertThat(Constants.USED_IN_SETUP_LIST.size()).isEqualTo(2);
    }

    void use_set_up_and_tear_down() {
        HasSetupAndTearDownMethodTestCase testCase = new HasSetupAndTearDownMethodTestCase();
        List<TestResult> testResults = testCase.executeMethods();
        assertThat(testResults.size()).isEqualTo(2);
        assertThat(Constants.USED_IN_SETUP_AND_TEARDOWN_LIST.size()).isEqualTo(0);
    }

    public SetupTeardownTestCase() {
        this.registerMethod("use_set_up", this::use_set_up);
        this.registerMethod("use_set_up_and_tear_down", this::use_set_up_and_tear_down);
    }
}
