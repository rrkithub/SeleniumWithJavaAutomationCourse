package JavaBasics;

public class StringExample {
    public static void main(String[] args) {
        String s="Java";
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);
        String s3=new String("example");
        String s4="Example";
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s3.charAt(2));
        System.out.println(s3.concat(" Test"));

    }
}
