package xunit.setupteardown;

import org.junit.jupiter.api.Test;
import xunit.testcase.TestResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SetupTeardownTest {
    @Test
    void should_set_up_one_String_property_used_in_one_method() {
        HasSetupMethodTestCase hasSetupMethodTestCase = new HasSetupMethodTestCase();
        List<TestResult> testResults = hasSetupMethodTestCase.executeMethods();
        assertThat(testResults.size()).isEqualTo(1);
        TestResult testResult = testResults.get(0);
        assertThat(testResult.getSuccess()).isEqualTo(true);
    }
}
