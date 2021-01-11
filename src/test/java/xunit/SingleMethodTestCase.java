package xunit;

import java.util.ArrayList;
import java.util.List;

public class SingleMethodTestCase {
    private List<TestMethod> methods;

    public void method1() {

    }

    public SingleMethodTestCase() {
        methods = new ArrayList<>();
        methods.add(new TestMethod("method1", this::method1));
    }

    public List<TestMethod> getMethods() {
        return methods;
    }

}
