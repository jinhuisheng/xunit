package xunit;

public class TwoMethodTestCase extends TestCase {
    void method1() {

    }

    void method2() {

    }

    public TwoMethodTestCase() {
        this.registerMethod("method1", this::method1);
        this.registerMethod("method2", this::method2);
    }
}
