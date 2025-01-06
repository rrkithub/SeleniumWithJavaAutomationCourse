package JavaBasics;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;

class Adder{

    static int add(int a, int b){
        return  a+b;
    }
    static  int add(int a, int b, int c){
        return  a+b+c;
    }
}

public class MethodOverloadEx1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(2,3));
        System.out.println(Adder.add(22,33,44));
    }

}
