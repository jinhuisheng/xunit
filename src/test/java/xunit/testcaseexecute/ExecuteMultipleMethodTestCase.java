package xunit.testcaseexecute;

import xunit.Constants;
import xunit.RTWTestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class ExecuteMultipleMethodTestCase extends RTWTestCase {
    public void test1() {
        assertThat(1).isEqualTo(2);
    }

    public void test2() {
        assertThat(1).isEqualTo(1);
    }

    public ExecuteMultipleMethodTestCase() {
        this.registerMethod(Constants.TEST_1_METHOD_NAME, this::test1);
        this.registerMethod(Constants.TEST_2_METHOD_NAME, this::test2);
    }
}
