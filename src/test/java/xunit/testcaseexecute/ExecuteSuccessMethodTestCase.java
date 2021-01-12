package xunit.testcaseexecute;

import xunit.RTWTestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class ExecuteSuccessMethodTestCase extends RTWTestCase {

    public void test1() {
        assertThat(1).isEqualTo(1);
    }

    public ExecuteSuccessMethodTestCase() {
        this.registerMethod("test1", this::test1);
    }

}
