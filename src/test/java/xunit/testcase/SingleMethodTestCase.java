package xunit.testcase;

import xunit.RTWTestCase;

import static xunit.Constants.EXECUTE_SUCCESS_TEST;

public class SingleMethodTestCase extends RTWTestCase {

    public SingleMethodTestCase() {
        this.registerMethod(EXECUTE_SUCCESS_TEST, this::test1);
    }

    public void test1() {

    }

}
