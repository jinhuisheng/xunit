package xunit.setupteardown;

import xunit.Constants;
import xunit.testcase.RTWTestCase;

import java.util.List;

public class HasSetupMethodTestCase extends RTWTestCase {

    private List<String> list;

    @Override
    protected void setUp() {
        list = Constants.LIST;
    }

    public void save1() {
        list.add("save1");
    }

    public HasSetupMethodTestCase() {
        this.registerMethod("save1", this::save1);
    }

}
