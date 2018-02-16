package LinkedList;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;

public class TestReverseSubList {


        public void processData() {

        }

        public void readFile() {
            File file = new File("//Users//Downloads//test_cases//input.txt");
            ArrayList<String> al=new ArrayList<String>();//creating new generic arraylist
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                al.add(st);
            br.close();
        }
    }



