import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class AnnotationTest {

    @BeforeMethod
    public void printBeforeMethod(ITestResult result) {
        System.out.println("BeforeMethod: " + result.getMethod().getMethodName());
    }

    @BeforeClass
    public void printBeforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeGroups
    public void printBeforeGroups() {
        System.out.println("BeforeGroups");
    }

    @BeforeTest
    public void printBeforeTest() {
        System.out.println("BeforeTest");
    }

    @BeforeSuite
    public void printBeforeSuite() {
        System.out.println("BeforeSuite");
    }

    @AfterMethod
    public void printAfterMethod(ITestResult result) {
        System.out.println("AfterMethod: " + result.getMethod().getMethodName());
    }

    @AfterClass
    public void printAfterClass() {
        System.out.println("AfterClass");
    }

    @AfterGroups
    public void printAfterGroups() {
        System.out.println("AfterGroups");
    }

    @AfterTest
    public void printAfterTest() {
        System.out.println("AfterTest");
    }

    @AfterSuite
    public void printAfterSuite() {
        System.out.println("AfterSuite");
    }

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
