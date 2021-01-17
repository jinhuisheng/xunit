package xunit;

import xunit.testcase.RTWTestCase;

public class MyTestCase extends RTWTestCase {
    public void test1() {
        assert 1 == 1;
    }

    public MyTestCase() {
        this.registerMethod("test1", this::test1);
    }
}

