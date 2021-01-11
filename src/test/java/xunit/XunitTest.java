package xunit;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class XunitTest {
    @Test
    void should_get_single_method_testClass_methods_success() {
        Xunit xunit = new Xunit();
        List<TestMethod> methods = xunit.getMethods(new SingleMethodTestCase());
        assertThat(methods.size()).isEqualTo(1);
        TestMethod method = methods.get(0);
        assertThat(method.getName()).isNotBlank();
        method.run();
    }

    @Test
    void should_get_two_methods_testClass_methods_success() {
        Xunit xunit = new Xunit();
        List<TestMethod> methods = xunit.getMethods(new TwoMethodTestCase());
        assertThat(methods.size()).isEqualTo(2);
        for (TestMethod method : methods) {
            assertThat(method.getName()).isNotBlank();
            method.run();
        }
    }

}
