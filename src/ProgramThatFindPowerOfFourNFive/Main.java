package ProgramThatFindPowerOfFourNFive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value, sumFour = 0, sumFive = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input value : ");
        value = input.nextInt();

        for (int i = 1; i<=value; i*=4) {
            sumFour += i;
        }
        for (int j = 1; j<=value; j*=5) {
            sumFive += j;
        }
        System.out.println("Sum of the power of four : " + sumFour
        + "\n Sum of the power of five : " + sumFive) ;
    }
}
