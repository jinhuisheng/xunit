package xunit;

public class TestUtil {
    public TestUtil() {
    }

    public static String getClassName(Class<? extends RTWTestCase> testCase) {
        return testCase.toString().split(" ")[1];
    }
}