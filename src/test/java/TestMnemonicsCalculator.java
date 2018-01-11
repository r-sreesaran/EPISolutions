package test.java;

import main.java.string.MnemoncisCalculator;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;

public class TestMnemonicsCalculator {

    private List<String> expectedResults;
    private String phoneNumber;

    @Test
    public void computeMnemonics1() {
        phoneNumber = "2276696";
        expectedResults = Arrays.asList("ACRONYM", "ABPOMZN");

        test(expectedResults, phoneNumber);
    }



    private void test(List<String> expectedResults, String phoneNumber) {
        List<String> actualResults = MnemoncisCalculator.computeMnemonics(phoneNumber);
        for (String mnemonic : expectedResults) {
            assertTrue(actualResults.contains(mnemonic));
        }
    }
}
