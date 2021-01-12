package xunit;


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
            return new TestResult(name, true, "");
        } catch (AssertionError e) {
            return new TestResult(name, false, e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

}
