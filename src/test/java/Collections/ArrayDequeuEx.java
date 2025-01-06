package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeuEx {
    public static void main(String[] args) {

        Deque<String> d1=new ArrayDeque<String>();

        d1.add("Selenium");
        d1.add("Cucumber");
        d1.add("Jenkins");

        for(String str : d1){
            System.out.println(str);
        }
    }
}
