package UserLoginProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, select, passwordSystemNew;

        String usernameSystem = "user@hotmail.com";
        String passwordSystem = "123456789";

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username : ");
        username = input.nextLine();

        System.out.print("Please enter your password : ");
        password = input.nextLine();

        if ((username.equals(usernameSystem)) && (password.equals(passwordSystem))) {
            System.out.println("Login successful");
        } else if (username.equals(usernameSystem)) {
            System.out.println("Login failed." +
                    "\n If you want to reset your password please enter '1' or skip, please enter any key.");
            select = input.nextLine();
            if (select.equals("1")) {
                System.out.print("Please enter your new password that will be different old password :");
                passwordSystemNew = input.nextLine();
                if (passwordSystemNew.equals(passwordSystem)) {
                    System.out.println("Password hasn't been created!");
                } else {
                    System.out.println("Password has been succsefully created.");
                }
            } else {
                System.out.println("Logged out!");
            }
        } else {
            System.out.println("Login failed, your username and password are invalid!");
        }
    }
}
