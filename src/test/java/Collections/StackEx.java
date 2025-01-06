package Collections;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackEx {
    public static void main(String[] args) {


        Stack<String> l1 = new Stack<>();

        l1.add("Srikanth");
        l1.add(1, "Automation");
        l1.add(0, "Training");
        l1.add("Abcd");
        l1.remove("Srikanth");
        l1.remove(0);
        l1.push("Selenium");
        l1.push("Cucumber");
        l1.push("Selenium");
        l1.push("DeletedOne");
        l1.pop();
        System.out.println("Using while loop");
        Iterator itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
