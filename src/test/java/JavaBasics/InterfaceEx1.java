package JavaBasics;

interface printable{
    void print();
}
class InterEx implements  printable{
    public  void print(){
        System.out.println("Hello ......");
    }
}
public class InterfaceEx1 {
    public static void main(String[] args) {

        InterEx ie=new InterEx();
        ie.print();
    }
}
