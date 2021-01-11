package xunit;

import java.util.ArrayList;
import java.util.List;

public class SingleMethodTestCase {
    private List<TestMethod> methods_temp;

    public void method1() {

    }

    public SingleMethodTestCase() {
        methods_temp = new ArrayList<>();
        methods_temp.add(new TestMethod("method1", this::method1));
    }

    public List<TestMethod> getMethods() {
        return methods_temp;
    }

}
