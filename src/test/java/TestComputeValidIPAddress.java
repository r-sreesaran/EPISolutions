import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import string.ComputeValidIPAddress;

public class TestComputeValidIPAddress {

    ComputeValidIPAddress ipAddress;

    @BeforeClass
    public void setup() {
        ipAddress = new ComputeValidIPAddress();
    }

    @Test
    public void TestValidIp() {

        Assert.assertEquals(ipAddress.validateIPAddress("192.168.1.1"),4);
    }
}
