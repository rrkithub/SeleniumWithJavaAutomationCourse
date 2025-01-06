package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue<String> q1=new PriorityQueue<String>();
        q1.add("Selenium");
        q1.add("TesNG");
        q1.add("POM");
        q1.add("Cucumber");
        System.out.println("Head:"+q1.element());
        System.out.println("Head:"+q1.peek());
        System.out.println("Priniting the elemenets....");
        Iterator itr=q1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        q1.remove();
        q1.poll();
        System.out.println("After removing the two elemenets....");
        Iterator itr1=q1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
