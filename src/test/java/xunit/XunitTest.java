package xunit;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class XunitTest {
    @Test
    void should_get_testClass_methods_success() {
        Xunit xunit = new Xunit();
        List<TestMethod> functions = xunit.getMethods(new SingleMethodTestCase());
        assertThat(functions.size()).isEqualTo(1);
        functions.get(0).run();
    }
}
