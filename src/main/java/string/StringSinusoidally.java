package string;


//http://elementsofprogramminginterviews.com/solutions/java/SnakeString.java
public class StringSinusoidally {

    public String printString(String input) {
    String[] values = input.split("");
String output=null;

for(int i=1;i<values.length;i+=4) {
output +=values[i];
}

        for(int i=0;i<values.length;i+=2) {
            output +=values[i];
        }
        for(int i=3;i<values.length;i+=4) {
            output +=values[i];
        }


return output;
    }
}
