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
    public void testPalindrome() {
        Assert.assertTrue(instance.isPalindrome("dad"));

    }

    @Test
    public void testPalindromeWord() {
        Assert.assertTrue(instance.isPalindrome("Able was I, ere I saw Elba!"));
    }

    @Test
    public void testisNotPalindrome() {
        Assert.assertFalse(instance.isPalindrome("daw"));
    }

    @Test
    public void testIsNotPalindromeWord() {
        Assert.assertFalse(instance.isPalindrome("Able was a, ere I saw Elba!"));
    }

}
