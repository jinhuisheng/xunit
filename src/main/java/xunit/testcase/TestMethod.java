package xunit.testcase;


public class TestMethod {
    private final String name;
    private final Runnable method;
    private final Runnable setUp;
    private final Runnable tearDown;


    public TestMethod(String name, Runnable method, Runnable setUp, Runnable tearDown) {

        this.name = name;
        this.method = method;
        this.setUp = setUp;
        this.tearDown = tearDown;
    }

    public TestResult run() {
        try {
            setUp.run();
            method.run();
            return new TestResult(name, true, "");
        } catch (AssertionError e) {
            return new TestResult(name, false, e.getMessage());
        } finally {
            tearDown.run();
        }
    }

    public String getName() {
        return name;
    }

}
