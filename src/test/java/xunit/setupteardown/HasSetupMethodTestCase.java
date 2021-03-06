package xunit.setupteardown;

import xunit.Constants;
import xunit.testcase.RTWTestCase;

import java.util.List;

public class HasSetupMethodTestCase extends RTWTestCase {

    private List<String> list;

    @Override
    protected void setUp() {
        list = Constants.USED_IN_SETUP_LIST;
    }

    public void save1() {
        list.add("save1");
    }

    public void save2() {
        list.add("save2");
    }

    public HasSetupMethodTestCase() {
        this.registerMethod("save1", this::save1);
        this.registerMethod("save2", this::save2);
    }

}
