package xunit;

import java.util.List;
import java.util.Map;

public class Xunit {
    public List<TestMethod> getMethods(SingleMethodTestCase singleMethodTestCase) {
        return singleMethodTestCase.getMethods();
    }

}
