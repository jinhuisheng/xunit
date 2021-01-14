package xunit.setupteardown;

import org.junit.jupiter.api.Test;
import xunit.Constants;
import xunit.testcase.TestResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SetupTeardownTest {
    @Test
    void set_up_used() {
        HasSetupMethodTestCase hasSetupMethodTestCase = new HasSetupMethodTestCase();
        List<TestResult> testResults = hasSetupMethodTestCase.executeMethods();
        assertThat(testResults.size()).isEqualTo(2);
        assertThat(Constants.LIST.size()).isEqualTo(2);
    }

}
