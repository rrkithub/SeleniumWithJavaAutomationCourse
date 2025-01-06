package JavaBasics;

class AnimalOne {
    void eat() {
        System.out.println("eating...");
    }
}

class DogOne extends AnimalOne {
    void barking() {
        System.out.println("barking");
    }
}

class BabyDog extends DogOne{

    void sleeping() {
        System.out.println("sleeping");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        BabyDog d=new BabyDog();
        d.sleeping();
        d.eat();
        d.barking();

    }

}
