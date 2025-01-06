package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        Set<String> l1 = new LinkedHashSet<String>();
        l1.add("HashSet");
        l1.add("Srikanth");
        l1.add("Abcd");
        l1.add("Srikanth");
        l1.add(null);
        System.out.println("Using while loop");
        Iterator itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
