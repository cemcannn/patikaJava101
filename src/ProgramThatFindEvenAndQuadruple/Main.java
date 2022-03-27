package ProgramThatFindEvenAndQuadruple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value=0, even = 0, divisibleFour = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please input a value : ");
            value = input.nextInt();

            if (value%2 == 0) {
                even += value;
            }
            if (value%4 == 0) {
                divisibleFour += value;
            }
        } while (value%2==0);
        System.out.println(even!=0 ? "Even numbers : " + even : "There is no even number.");
        System.out.println(divisibleFour!=0 ? "Divisible by four : " + divisibleFour : "There is no divisible by four.");
    }
}
