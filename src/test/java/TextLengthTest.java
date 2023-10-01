import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TextLengthTest {

    @DataProvider(name = "validData")
    public Object[][] validData() {
        return new Object[][] {
                {"hello world", 11},
                {"hello world ", 11},
                {" hello world ", 11},
                {"hello", 5},
                {"!@#$%HELLOPEOPLE^&*()", 21},
                {"   motasemabunima@gmail.com    ", 24},
                {" ", 0},
                {"", 0}
        };
    }

    @Test(dataProvider = "validData")
    public void textLengthTest(String value, int expected){
        TextLength textLength = new TextLength();
        Assert.assertEquals(textLength.getLength(value), expected);
    }
}
