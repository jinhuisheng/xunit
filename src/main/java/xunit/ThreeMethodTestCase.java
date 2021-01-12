package xunit;

public class ThreeMethodTestCase extends RTWTestCase {
    public void test1() {

    }

    public void test2() {

    }

    public void test3() {

    }

    public ThreeMethodTestCase() {
        this.registerMethod("test1", this::test1);
        this.registerMethod("test2", this::test2);
        this.registerMethod("test3", this::test3);
    }
}
