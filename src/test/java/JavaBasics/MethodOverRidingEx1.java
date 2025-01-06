package JavaBasics;
class Vichle{
   void run(){
        System.out.println("vichle is running..");
    }
}

public class MethodOverRidingEx1 extends Vichle {
    void run(){
        System.out.println("Bike is running..");
    }

    public static void main(String[] args) {
        MethodOverRidingEx1 ex1=new MethodOverRidingEx1();
        ex1.run();
    }

}
