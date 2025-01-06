package Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<String> t1=new TreeSet<String>();
        t1.add("Srikanth");
        t1.add("Ajay");
        t1.add("Srikanth");
        t1.add("Ram");
        Iterator itr=t1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
