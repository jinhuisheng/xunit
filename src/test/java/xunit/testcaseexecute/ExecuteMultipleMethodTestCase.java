package xunit.testcaseexecute;

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
        this.registerMethod("test1", this::test1);
        this.registerMethod("test2", this::test2);
    }
}
