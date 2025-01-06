package JavaBasics;

public class ifEx1 {
    public static void main(String[] args) {

        int age = 18;

        if (age >= 18) {
            System.out.println("you are eligble for voting...");
        }

        String state = "Telangana";

        if (state.equalsIgnoreCase("Telangana")) {
            System.out.println("You are belongs to " + state + " State");
        }

    }
}
