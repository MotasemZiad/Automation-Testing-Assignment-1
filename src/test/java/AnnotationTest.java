import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
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
        Assert.assertTrue(false);
    }

    @Test(priority = 3)
    public void test3() {
        Assert.assertTrue(false);
    }

    @Test(priority = 4)
    public void test4() {
        Assert.assertTrue(true);
    }

    @Test(priority = 1)
    public void test5() {
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void test6() {
        Assert.assertTrue(false);
    }

    @Test(priority = 3)
    public void test7() {
        Assert.assertTrue(false);
    }

    @Test(priority = 4)
    public void test8() {
        Assert.assertTrue(false);
    }

    @Test(priority = 1)
    public void test9() {
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void test10() {
        Assert.assertTrue(false);
    }

    @Test(priority = 3)
    public void test11() {
        Assert.assertTrue(false);
    }

    @Test(priority = 4)
    public void test12() {
        Assert.assertTrue(false);
    }
    @Test(priority = 4)
    public void test13() {
        Assert.assertTrue(false);
    }

    @Test(priority = 1)
    public void test14() {
        Assert.assertTrue(true);
    }

    @Test(priority = 1)
    public void test15() {
        Assert.assertTrue(true);
    }

    @Test
    public void testRandom() {
        throw new SkipException("I want to skip this unit test");
    }

    @Test
    public void testRandom1() {
        throw new SkipException("I want to skip this unit test");
    }

    @Test
    public void testRandom2() {
        throw new SkipException("I want to skip this unit test");
    }

    @Test
    public void testRandom3() {
        throw new SkipException("I want to skip this unit test");
    }
}
