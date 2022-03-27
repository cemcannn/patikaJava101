package FindSumOfDigits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value, sumDigits = 0, remainder;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input value : ");
        value = input.nextInt();

        while (value != 0) {
            remainder = value%10;
            value /= 10;
            sumDigits += remainder;
        }
        System.out.println(sumDigits);
    }
}
