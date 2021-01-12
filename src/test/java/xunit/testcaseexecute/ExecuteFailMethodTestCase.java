package xunit.testcaseexecute;

import xunit.RTWTestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class ExecuteFailMethodTestCase extends RTWTestCase {
    public void test1() {
        assertThat(1).isEqualTo(2);
    }

    public ExecuteFailMethodTestCase() {
        this.registerMethod("test1", this::test1);
    }

}
