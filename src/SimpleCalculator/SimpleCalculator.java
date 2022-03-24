package SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int n1, n2, command;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        n1 = input.nextInt();
        System.out.print("Please enter second number : ");
        n2 = input.nextInt();

        System.out.print("\n 1-Addition \n 2-Subtraction \n 3-Multiplication \n 4-Division" +
                " \n Please select your operation : " );
        command = input.nextInt();
        System.out.println("Your select : " + command);

        switch (command) {
            case 1 :
                result = n1 + n2;
                System.out.println(result);
                break;
            case 2 :
                result = n1 - n2;
                System.out.println(result);
                break;
            case 3 :
                result = n1 * n2;
                System.out.println(result);
                break;
            case 4 :
                if (n2 == 0) {
                    System.out.println("A number cannot be divided by 0");
                    break;
                }
                else{
                    result = n1 / n2;
                    System.out.println(result);
                    break;
                }
            default:
                System.out.println("Invalid select!");
        }
    }
}
