package xunit;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ExecuteFailMethodTestCase extends RTWTestCase {
    public void test1() {
        assertThat(1).isEqualTo(2);
    }

    public ExecuteFailMethodTestCase() {
        this.registerMethod("test1", this::test1);
    }

    public List<TestResult> executeMethods() {
        List<TestResult> testResults = new ArrayList<>();
        for (TestMethod declaredMethod : this.getDeclaredMethods()) {
            TestResult result = declaredMethod.run();
            testResults.add(result);
        }
        return testResults;
    }
}
