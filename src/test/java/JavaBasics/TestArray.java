package JavaBasics;

public class TestArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        //a[5]=60; // we will get Array Index Out Of Bound Exeception.
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
