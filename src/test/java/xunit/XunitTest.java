package xunit;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class XunitTest {
    @Test
    void should_get_testClas_methods_success() {
        Xunit xunit = new Xunit();
        List<String> functions = xunit.getMethods(new SingleMethodTestCase());
        assertThat(functions.size()).isEqualTo(1);
    }
}
