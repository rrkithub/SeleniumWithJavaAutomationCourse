package JavaBasics;

public class NestedIfEx1 {
    public static void main(String[] args) {
        int age = 17;
        int weight = 50;
        if (age > 18) {
            if (weight > 50) {
                System.out.println("you are eligble for blood donation");
            } else {
                System.out.println("you are not eligble for blood donation");
            }

        } else {
            System.out.println("age must be be greater than 18");
        }
    }
}
