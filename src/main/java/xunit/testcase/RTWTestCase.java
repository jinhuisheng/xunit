package xunit.testcase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RTWTestCase {
    private List<TestMethod> declaredMethods = new ArrayList<>();

    protected void registerMethod(String name, Runnable method) {
        declaredMethods.add(new TestMethod(name, method));
    }

    protected void setUp() {

    }

    public List<TestMethod> getDeclaredMethods() {
        return declaredMethods;
    }

    public List<TestResult> executeMethods() {
        setUp();
        return this.declaredMethods.stream().map(TestMethod::run).collect(Collectors.toList());
    }

}
