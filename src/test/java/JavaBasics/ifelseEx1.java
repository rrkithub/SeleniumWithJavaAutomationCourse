package JavaBasics;

public class ifelseEx1 {
    public static void main(String[] args) {

            int age = 17;

            if (age >= 18) {
                System.out.println("you are eligble for voting...");
            } else{
              System.out.println("you are not elgible for voting ");
            }

            String state = "AP";

            if (state.equalsIgnoreCase("Telangana")) {
                System.out.println("You are belongs to " + state + " State");
            }
            else{
                System.out.println("You are not belongs to Telangana State");
            }

        }
}
