package xunit.setupteardown;

import xunit.Constants;
import xunit.testcase.RTWTestCase;

import java.util.List;

public class HasSetupAndTearDownMethodTestCase extends RTWTestCase {

    private List<String> list;

    @Override
    protected void setUp() {
        list = Constants.ANOTHER_LIST;
    }

    @Override
    protected void tearDown() {
        list.clear();
    }

    public void save1() {
        list.add("save1");
    }

    public HasSetupAndTearDownMethodTestCase() {
        this.registerMethod("save1", this::save1);
    }

}
