package xunit.testcaseexecute;

import xunit.RTWTestCase;
import xunit.TestMethod;
import xunit.TestResult;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ExecuteSuccessMethodTestCase extends RTWTestCase {

    public void test1() {
        assertThat(1).isEqualTo(1);
    }

    public ExecuteSuccessMethodTestCase() {
        this.registerMethod("test1", this::test1);
    }

    public List<TestResult> executeMethods() {
        List<TestResult> testResults = new ArrayList<>();
        for (TestMethod declaredMethod : this.getDeclaredMethods()) {
            declaredMethod.run();
            testResults.add(new TestResult(declaredMethod.getName(), true, null));
        }
        return testResults;
    }
}
