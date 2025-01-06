package JavaBasics;

public class NonRepatedCharInString {
    public static void main(String[] args) {
        String name = "Selenium";

        for (int i = 0; i < name.length(); i++) {
            boolean repated = false;
            for (int j = 0; j < name.length(); j++) {
                if (i != j && name.charAt(i) == name.charAt(j)) {
                    repated = true;
                    break;
                }
            }
            if (!repated) {
                System.out.println(name.charAt(i));
            }
        }
    }
}
