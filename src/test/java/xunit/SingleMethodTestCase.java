package xunit;

import java.util.ArrayList;
import java.util.List;

public class SingleMethodTestCase {
    private List<String> methods;

    public SingleMethodTestCase() {
        methods = new ArrayList<>();
        methods.add("method1");
    }

    public List<String> getMethods() {
        return methods;
    }
}
