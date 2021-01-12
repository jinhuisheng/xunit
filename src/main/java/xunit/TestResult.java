package xunit;

public class TestResult {
    private final String methodName;
    private final boolean success;

    public TestResult(String methodName, boolean success) {

        this.methodName = methodName;
        this.success = success;
    }

    public String getMethodName() {
        return methodName;
    }

    public boolean getSuccess() {
        return success;
    }
}
