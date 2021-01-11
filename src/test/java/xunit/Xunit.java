package xunit;

import java.util.List;
import java.util.Map;

public class Xunit {
    public List<TestMethod> getMethods(TestCase testCase) {
        return testCase.getMethods();
    }

}
