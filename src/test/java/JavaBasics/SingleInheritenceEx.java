package JavaBasics;

class Animal {
    void eat() {
        System.out.println("Animal will eat somting");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking ...");
    }
}

public class SingleInheritenceEx {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
    