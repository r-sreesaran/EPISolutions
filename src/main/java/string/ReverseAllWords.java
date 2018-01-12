package string;

import java.util.Random;

public class ReverseAllWords {
    String[] values;

    public void operation(String word) {

        values = word.split(" ");
        for(int i=values.length-1;i>=0;i--) {
            System.out.println(values[i]);
        }
    }

    public static void main(String[] args) {
        ReverseAllWords test = new ReverseAllWords();
        test.operation("a cat and dog");
    }


}
