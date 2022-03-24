package UserLoginProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;

        String usernameSystem = "user@hotmail.com";
        String passwordSystem = "123456789";

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username : ");
        username = input.nextLine();

        System.out.print("Please enter your password : ");
        password = input.nextLine();

        if ((username.equals(usernameSystem)) && (password.equals(passwordSystem))) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }
    }
}
