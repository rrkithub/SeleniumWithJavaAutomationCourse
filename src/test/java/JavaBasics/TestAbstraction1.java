package JavaBasics;

abstract  class Shape{
    abstract void draw();
    void test(){
        System.out.println("This is non abstract method");
    }
}

class Rectangle extends  Shape{
    void draw(){
        System.out.println("drawinng rectangle ....");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing Circle");
    }
}
public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s=new Circle();
        Shape r=new Rectangle();
        s.draw();
        s.test();
        r.draw();
    }

}
