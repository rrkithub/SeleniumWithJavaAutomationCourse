package JavaBasics;

public class forLoopEx1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("value of i : " + i);
            if (i == 5) {
                break;
            }
        }
        System.out.println("******************************");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("value of i : " + i);
        }
        System.out.println("******************************");
        for (int i = 1; i <= 10; ++i) {
            if (i == 2) {
                int a = ++i;
                System.out.println(a);
            }
            System.out.println("value of i : " + i);
        }
        System.out.println("******************************");
        for (int i = 10; i >= 1; i--) {
            System.out.println("value of i : " + i);
        }


    }
}
