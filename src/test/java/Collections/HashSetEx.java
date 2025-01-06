package Collections;

import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> l1 = new HashSet<String>();

        l1.add("Srikanth");
        l1.add("Abcd");
        l1.add("Srikanth");
        System.out.println("Using while loop");
        Iterator itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
