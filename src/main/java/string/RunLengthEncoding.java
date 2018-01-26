package string;

import java.util.Arrays;
import java.util.List;

public class RunLengthEncoding {
  //http://elementsofprogramminginterviews.com/solutions/java/RunLengthCompression.java

    public String performEncoding(String values) {
        /*
        Take the first value
        print the no of times the character is specified
        * */
        int cache=0;
        String[] data = values.split("");
        String result="";
        for(int i=0;i<=data.length/2;i=i+2) {
            for(int j=Integer.valueOf(data[i]);j>0;j--) {
                result = result+data[i+1];
            }
        }
        System.out.println(result);
        return result;
    }


}

