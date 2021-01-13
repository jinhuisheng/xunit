package xunit.testcaseexecute;

import xunit.Constants;
import xunit.testcase.RTWTestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class ExecuteFailMethodTestCase extends RTWTestCase {
    public void test1() {
        assertThat(1).isEqualTo(2);
    }

    public ExecuteFailMethodTestCase() {
        this.registerMethod(Constants.EXECUTE_FAILURE_TEST, this::test1);
    }

}
