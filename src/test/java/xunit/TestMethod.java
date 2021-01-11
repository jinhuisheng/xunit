package xunit;

public class TestMethod {
    private final String name;
    private final Runnable method;

    public TestMethod(String name, Runnable method) {
        this.name = name;
        this.method = method;
    }

    public void run() {
        method.run();
    }

    public String getName() {
        return name;
    }
}
