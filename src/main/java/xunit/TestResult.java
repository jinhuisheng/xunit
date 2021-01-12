package xunit;

public class TestResult {
    private final String methodName;
    private final boolean success;
    private String failureMessage;

    public TestResult(String methodName, boolean success, String failureMessage) {
        this.methodName = methodName;
        this.success = success;
        this.failureMessage = failureMessage;
    }

    public String getMethodName() {
        return methodName;
    }

    public boolean getSuccess() {
        return success;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

}
