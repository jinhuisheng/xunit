package xunit.testcase;

import xunit.RTWTestCase;

public class SingleMethodTestCase extends RTWTestCase {

    public SingleMethodTestCase() {
        this.registerMethod("test1", this::test1);
    }

    public void test1() {

    }

}
