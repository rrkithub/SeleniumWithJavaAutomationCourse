package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public void numberofOccurenceofChar(String str) {
        HashMap<Character, Integer> hs1 = new HashMap<>();

        char strArray[] = str.toCharArray();
        for (char c : strArray) { 
            if (hs1.containsKey(c)) {
                hs1.put(c, hs1.get(c) + 1);
            } else {
                hs1.put(c, 1);
            }
        }
        for (Map.Entry entry : hs1.entrySet()) {
            System.out.println(entry.getKey() + " -------------> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        MapExample mp = new MapExample();
        mp.numberofOccurenceofChar("JavaJa");
    }
}
