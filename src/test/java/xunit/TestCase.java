package xunit;

import java.util.ArrayList;
import java.util.List;

public class TestCase {
    private List<TestMethod> methods = new ArrayList<>();

    protected void registerMethod(String name, Runnable method) {
        methods.add(new TestMethod(name, method));
    }

    public List<TestMethod> getMethods() {
        return methods;
    }

}
