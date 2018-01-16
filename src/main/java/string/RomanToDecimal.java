package string;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {

    Map <String, Integer> romanNumeral = new HashMap<String,Integer>(){
        {
            put("I",1);
            put("V",5);
            put("X",10);
            put("L",50);
            put("C",100);
            put("D",500);
            put("M",1000);
        }
    };

    public int convert(String numeral) {
        int sum = romanNumeral.get(numeral.charAt(numeral.length()-1));

        for(int i = numeral.length()-1;i>0;i--) {
            if(romanNumeral.get(numeral.charAt(i))>romanNumeral.get(numeral.charAt(i+1))) {
                sum = sum - romanNumeral.get(numeral.charAt(i+1));
            }
            else {
                sum = sum + romanNumeral.get(numeral.charAt(i+1));
            }
        }
        return sum;
    }

}
