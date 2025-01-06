package JavaBasics;

public class FirstClass {
    public void test1(){
        System.out.println("Test1 Method");
    }
    public static void test2(){
        System.out.println("Test2 method");
    }
    public int add(){
       int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
    public String addString(){
        String a="Java";
        String b=" Training";
        String c=a+b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println("First java Program .....");
        FirstClass f=new FirstClass();
        f.test1();
        test2();

        int x=f.add();
        String str=f.addString();

        System.out.println(x);
        System.out.println(str);
    }
}
