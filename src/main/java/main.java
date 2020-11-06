import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String password = "password";  //set password

        System.out.println("What is the password?");
        String enteredPassword = input.nextLine(); //user enters a password

        if (password.equals(enteredPassword)){
            System.out.println("Unlocked");   //password is correct
        }else{
            System.out.println("Please try again");   // password is incorrect
            System.out.println("2 attempts remain");
            System.out.println();
            System.out.println("What is the password?");
            String enteredPassword1 = input.nextLine(); //user enters a password
            if (password.equals(enteredPassword1)){
                System.out.println("Unlocked");   //password is correct
            }else{
                System.out.println("Please try again");   // password is incorrect
                System.out.println("1 attempt remain");
                System.out.println();
                System.out.println("What is the password?");
                String enteredPassword2 = input.nextLine(); //user enters a password
                if (password.equals(enteredPassword2)){
                    System.out.println("Unlocked");   //password is correct
                }else {
                    System.out.println("System Locked");
                }
            }
        }
    }
}