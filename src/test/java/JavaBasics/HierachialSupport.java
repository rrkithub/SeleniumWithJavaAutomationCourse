package JavaBasics;

class AnimalTwo {
    void eat() {
        System.out.println("eating..");
    }
}

class DogTwo extends AnimalTwo{
    void bark() {
        System.out.println("barking..");
    }
}

class Cat extends AnimalTwo{
    void Meow() {
        System.out.println("meowing..");
    }
}

public class HierachialSupport {

    public static void main(String[] args) {
        DogTwo d2=new DogTwo();
        Cat c=new Cat();
        d2.bark();
        d2.eat();

        c.Meow();
        c.eat();
    }

}
