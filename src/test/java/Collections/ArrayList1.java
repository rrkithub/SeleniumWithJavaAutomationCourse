package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<String>();

        l1.add("Srikanth");
        l1.add(1, "Automation");
        l1.add(0, "Training");
        l1.add("Abcd");
        l1.remove("Srikanth");
        l1.remove(0);
        System.out.println("Using while loop");
        Iterator itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Using for loop");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
}
