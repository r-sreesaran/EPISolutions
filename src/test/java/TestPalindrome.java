package test.java;

import main.java.string.Palindrome;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPalindrome {

    Palindrome instance;
    @BeforeClass
    public void intialize() {
instance = new Palindrome();
    }

    @Test
    public void TestPalindrome() {
        Assert.assertTrue(instance.isPalindrome("dad"));

    }

}
