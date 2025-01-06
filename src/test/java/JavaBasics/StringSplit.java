package JavaBasics;

// Java program to show the use of split() method
public class StringSplit {

    public static void main(String[] args)
    {

        // input string having spaces, comma etc.
        String s = "This is,comma.fullstop  whitespace";

        // The regex [,\\.\\s] splits the string by
        // commas (,), spaces (\\s), and periods (\\.)
        String regex = "[,\\s\\.]";

        // using split() method
        String[] arr = s.split(regex);

        // Print each element of the resulting array
        for (String s1 : arr) {
            System.out.println(s1);
        }
    }
}