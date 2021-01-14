package xunit.setupteardown;

import org.junit.jupiter.api.Test;
import xunit.Constants;
import xunit.testcase.TestResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SetupTeardownTest {
    @Test
    void should_set_up_one_String_property_used() {
        HasSetupMethodTestCase hasSetupMethodTestCase = new HasSetupMethodTestCase();
        List<TestResult> testResults = hasSetupMethodTestCase.executeMethods();
        assertThat(testResults.size()).isEqualTo(1);
        assertThat(Constants.LIST.size()).isEqualTo(1);
    }

}
