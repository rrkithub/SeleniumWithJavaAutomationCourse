package JavaBasics;

public class ifelseEx2 {
    public static void main(String[] args) {
        int number=12;
        if(number%2==0){
            System.out.println("Given number is even number");
        }
        else {
            System.out.println("Given number is odd number");
        }
        //using ternary operation

        String output=(number%2==0)?"even number":"odd number";
        System.out.println(output);
    }
}
