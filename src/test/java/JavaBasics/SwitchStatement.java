package JavaBasics;

public class SwitchStatement {
    public static void main(String[] args) {

        int number = 30;
        switch (number) {

            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            case 40:
                System.out.println("40");
                break;
            default:
                System.out.println("Number not in 10,20,30 &40");
                break;
        }
    }
}
