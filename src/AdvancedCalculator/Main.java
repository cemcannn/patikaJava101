package AdvancedCalculator;

import java.util.Scanner;

public class Main {
    static void addition(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Addition result is : " + result);
    }
    static void subtraction(int num1, int num2) {
        int result = Math.abs(num1 - num2);
        System.out.println("Subtraction result is : " + result);
    }
    static void multiplication(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Multiplication result is : " + result);
    }
    static void division(int num1, int num2) {
        if(num2==0) {
            System.out.println("Zero division error!");
        }
        else{
            double result = num1 / num2;
            System.out.println("Division result is : " + result);
        }
    }
    static void power(int num1, int num2) {
        double result = Math.pow(num1,num2);
        System.out.println("Power result is : " + result);
    }
    static void factorial(int num1) {
        int result = 1;
        for(int i=1; i<=num1; i++) {
            result *= i;
        }
        System.out.println("Factorial result is : " + result);
    }
    static void mode(int num1, int num2) {
        int result = num1 % num2;
        System.out.println("Modal value is : " + result);
    }
    static void perimeterArea(int num1, int num2) {
        int perimeter = 2*(num1+num2);
        int area = num1*num2;
        System.out.println("Perimeter result is : " + perimeter +
                "\n Area result is : " + area);
    }
    public static void main(String[] args) {
        int num1, num2, select;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        String menu = "1- Addition Process\n" +
                "2- Subtraction Process\n" +
                "3- Multiplication Process\n" +
                "4- Division Process\n" +
                "5- Power of Number Calculator\n" +
                "6- Factorial Calculator\n" +
                "7- Modal Value Calculator\n" +
                "8- Perimeter and Area of Rectangle\n" +
                "0- Quit\n" +
                "Please select your process : ";
        while(flag==true) {
            System.out.print(menu);
            select = input.nextInt();
            System.out.println("---------------------------------------------------------------------");
            switch (select) {
                case(1):
                    System.out.print("Please input first number : ");
                    num1 = input.nextInt();
                    System.out.print("Please input second number : ");
                    num2 = input.nextInt();
                    addition(num1,num2);
                    break;
                case(2):
                    System.out.print("Please input first number : ");
                    num1 = input.nextInt();
                    System.out.print("Please input second number : ");
                    num2 = input.nextInt();
                    subtraction(num1,num2);
                    break;
                case(3):
                    System.out.print("Please input first number : ");
                    num1 = input.nextInt();
                    System.out.print("Please input second number : ");
                    num2 = input.nextInt();
                    multiplication(num1,num2);
                    break;
                case(4):
                    System.out.print("Please input first number : ");
                    num1 = input.nextInt();
                    System.out.print("Please input second number : ");
                    num2 = input.nextInt();
                    division(num1,num2);
                    break;
                case(5):
                    System.out.print("Please input base number : ");
                    num1 = input.nextInt();
                    System.out.print("Please input exponent number : ");
                    num2 = input.nextInt();
                    power(num1,num2);
                    break;
                case(6):
                    System.out.print("Please input factorial number : ");
                    num1 = input.nextInt();
                    factorial(num1);
                    break;
                case(7):
                    System.out.print("Please input first number : ");
                    num1 = input.nextInt();
                    System.out.print("Please input second number : ");
                    num2 = input.nextInt();
                    mode(num1,num2);
                    break;
                case(8):
                    System.out.print("Please input long side : ");
                    num1 = input.nextInt();
                    System.out.print("Please input short side : ");
                    num2 = input.nextInt();
                    perimeterArea(num1,num2);
                    break;
                case(0):
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid input, please try again!");
            }
            System.out.println("---------------------------------------------------------------------");
        }
    }
}
