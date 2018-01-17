import org.testng.Assert;
import org.testng.annotations.Test;
import string.RomanToDecimal;

public class TestRomanToDecimal {

    @Test
    public void testConverion() {
        String numeral ="XX";
        RomanToDecimal dtr = new RomanToDecimal();
        Assert.assertEquals(dtr.convert(numeral),20);

    }

    @Test
    public void testConverion1() {
        String numeral ="IX";
        RomanToDecimal dtr = new RomanToDecimal();
        Assert.assertEquals(dtr.convert(numeral),9);

    }

}
