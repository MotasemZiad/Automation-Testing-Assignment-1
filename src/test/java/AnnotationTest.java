import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationTest {

    @Test(priority = 1)
    public void test1() {
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void test2() {
        Assert.assertTrue(true);
    }

    @Test(priority = 3)
    public void test3() {
        Assert.assertTrue(true);
    }

    @Test
    public void testRandom() {
        Assert.assertTrue(true);
    }
}
