package xunit;

import java.util.List;

public class TestMethod {
    private final String name;
    private final Runnable method;

    public TestMethod(String name, Runnable method) {

        this.name = name;
        this.method = method;
    }

    public TestResult run() {
        try {
            method.run();
            return null;
        } catch (AssertionError e) {
            return new TestResult(name, false, e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

}
