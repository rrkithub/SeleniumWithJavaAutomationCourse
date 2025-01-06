package JavaBasics;

public class FactorialEx {
    public static void main(String[] args) {
        int givennumber = 6;
        int fact=1;
        for (int i = givennumber; i > 1; i--) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
