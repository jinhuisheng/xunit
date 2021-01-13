package xunit.testcase;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCaseTest {
    @Test
    void no_method_test_class_has_empty_method() {
        NoMethodTestCase noMethodTestCase = new NoMethodTestCase();
        List<TestMethod> methods = noMethodTestCase.getDeclaredMethods();
        assertThat(methods.size()).isEqualTo(0);
    }

    @Test
    void single_method_test_class_has_one_method() {
        SingleMethodTestCase singleMethodTestCase = new SingleMethodTestCase();
        List<TestMethod> methods = singleMethodTestCase.getDeclaredMethods();
        assertThat(methods.size()).isEqualTo(1);
        TestMethod testMethod = methods.get(0);
        assertThat(testMethod.getName()).isNotEmpty();
        testMethod.run();
    }

    @Test
    void three_methods_test_class_has_3_methods() {
        ThreeMethodTestCase threeMethodTestCase = new ThreeMethodTestCase();
        List<TestMethod> methods = threeMethodTestCase.getDeclaredMethods();
        assertThat(methods.size()).isEqualTo(3);
        TestMethod testMethod = methods.get(0);
        assertThat(testMethod.getName()).isNotEmpty();
        testMethod.run();
        TestMethod testMethod2 = methods.get(1);
        assertThat(testMethod2.getName()).isNotEmpty();
        testMethod2.run();
        TestMethod testMethod3 = methods.get(2);
        assertThat(testMethod3.getName()).isNotEmpty();
        testMethod3.run();
    }

}
