package xunit;


public class SingleMethodTestCase extends TestCase {

    public void method1() {

    }

    public SingleMethodTestCase() {
        this.registerMethod("method1", this::method1);
    }


}
