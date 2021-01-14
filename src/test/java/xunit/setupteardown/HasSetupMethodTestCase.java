package xunit.setupteardown;

import xunit.Constants;
import xunit.testcase.RTWTestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class HasSetupMethodTestCase extends RTWTestCase {

    private String name;

    @Override
    protected void setUp() {
        name = "setup";
    }

    public void test1() {
        assertThat(name).isEqualTo("setup");
    }

    public void test2() {
        assertThat(name).isEqualTo("setup");
    }


    public HasSetupMethodTestCase() {
        this.registerMethod("test1", this::test1);
        this.registerMethod("test2", this::test1);
    }

}
