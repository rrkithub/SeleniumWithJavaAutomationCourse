package JavaBasics;

public class StringReverse {
    public static void main(String[] args) {
        String s = "JavaTraining";
        char[] s1 = s.toCharArray();
        for (int i = s1.length - 1; i >= 0; i--) {
            System.out.print(s1[i]);
        }
    }
}
