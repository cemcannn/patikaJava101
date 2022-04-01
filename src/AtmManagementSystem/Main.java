package AtmManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rights = 3, choice, balance = 0, withdraw, deposit;
        String userOrg = "admin", username, passOrg = "12345", password;

        Scanner input = new Scanner(System.in);

        while (rights>0){
            System.out.print("Please input your username : ");
            username = input.nextLine();
            System.out.print("Please input your password : ");
            password = input.nextLine();

            if(username.equals(userOrg) && password.equals(passOrg)) {
                System.out.println("Login is succesful");
                do {
                    System.out.println(
                            "\n 1) Withdraw money"
                            + "\n 2) Deposit money"
                            + "\n 3) Balance enquiry"
                            + "\n 4) Cancel"
                            + "\n Please input your choice : ");
                    choice = input.nextInt();
                    switch (choice) {
                        case(1):
                            System.out.print("Please input the amount of withdraw : ");
                            withdraw = input.nextInt();
                            if(withdraw<=balance) {
                                balance -= withdraw;
                                System.out.println("Money successfully withdrawn");
                            }
                            else {
                                System.out.println("Insufficient balance");
                            }
                            break;
                        case(2):
                            System.out.print("Please input the amount of deposit : ");
                            deposit = input.nextInt();
                            balance+=deposit;
                            break;
                        case(3):
                            System.out.println("Available balance is " + balance);
                            break;
                        case(4):
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                } while (choice!=4);
                System.out.println("Quit...");
                break;
            }
            else {
                System.out.println("Username or password is invalid!");
                rights--;
                if(rights==0){
                    System.out.println("You don't have any right, your account has been blocked!");
                }
                else {
                    System.out.println("You have " + rights + " rights left.");
                }
            }
        }
    }
}
