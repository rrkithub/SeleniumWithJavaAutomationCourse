package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExample2 {
    public static void main(String[] args) {
        // Create a HashMap where the key is a String and the value is an ArrayList of Strings
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        // Create ArrayLists for different categories
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Potato");
        vegetables.add("Spinach");

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");

        // Put the ArrayLists into the HashMap
        map.put("Fruits", fruits);
        map.put("Vegetables", vegetables);
        map.put("Animals", animals);

        // Access and print the values from the HashMap
        System.out.println("Fruits: " + map.get("Fruits"));
        System.out.println("Vegetables: " + map.get("Vegetables"));
        System.out.println("Animals: " + map.get("Animals"));

        // Iterate through the HashMap and print each key-value pair
        for (String category : map.keySet()) {
            System.out.println(category + ": " + map.get(category));
        }
    }
}
