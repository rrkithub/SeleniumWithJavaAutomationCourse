package JavaBasics;

public class StringWordsCount {
    public static void main(String[] args) {
        String input = "String and String function to create String function";
        String[] s = input.split(" ");


        for (int i = 0; i < s.length; i++) {
            int count = 1;
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].equals(s[j])) {
                    count = count + 1;
                    s[j] = "Repeated";
                }

            }
            if (s[i]!="Repeated") {
                System.out.println(s[i] + "-->" + count);
            }

        }
    }
}

