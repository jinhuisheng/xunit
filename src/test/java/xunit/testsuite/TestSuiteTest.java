package xunit.testsuite;

import org.junit.jupiter.api.Test;
import xunit.testcase.SingleMethodTestCase;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSuiteTest {
    @Test
    void should_execute_and_get_right_test_class_result_count() {
        TestSuite testSuite = new TestSuite(Arrays.asList(new SingleMethodTestCase()));
        List<TestClassResult> results = testSuite.execute();
        assertThat(results.size()).isEqualTo(1);
    }
}
