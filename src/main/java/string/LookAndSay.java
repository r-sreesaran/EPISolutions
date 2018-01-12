package string;

import java.util.HashMap;
import java.util.Map;

public class LookAndSay {

    public void compute(String text) {
        String[] characters = text.split("");
        Map<String, Integer> data = new HashMap<String, Integer>();
        String output="";

        for (int i = 0; i < characters.length; i++) {
            if (data.containsKey(characters[i])) {
                data.put(characters[i],data.get(characters[i])+1);
            }
            else {
                data.put(characters[i],1);
            }
        }

        for (String key:data.keySet()
             ) {
            output = output+key+data.get(key);
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        LookAndSay test = new LookAndSay();
        test.compute("111224");
    }
}
