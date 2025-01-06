package JavaBasics;

class Animals {
    String color = "white";
}

class Dogs extends Animals {
    String color = "black";

    void printColor() {
        System.out.println(color); //Prints color of Dogs class
        System.out.println(super.color); //Prints color of Animals class
    }
}

public class SuperEx1 {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.printColor();
    }
}
