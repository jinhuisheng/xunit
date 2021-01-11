package xunit;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class XunitTest {
    @Test
    void should_get_testClass_methods_success() {
        Xunit xunit = new Xunit();
        List<TestMethod> methods = xunit.getMethods(new SingleMethodTestCase());
        assertThat(methods.size()).isEqualTo(1);
        TestMethod firstMethod = methods.get(0);
        assertThat(firstMethod.getName()).isNotBlank();
        firstMethod.run();
    }
}
