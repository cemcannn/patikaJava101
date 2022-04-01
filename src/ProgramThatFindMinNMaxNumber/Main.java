package ProgramThatFindMinNMaxNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, number;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input 'n' value : ");
        n = input.nextInt();
        System.out.print("Please input a number : ");
        number = input.nextInt();
        int min=number, max=number;

        while(n-1>0) {
            System.out.print("Please input a number : ");
            number = input.nextInt();
            if(number>=max) {
                max=number;
            }
            if(number<=min) {
                min=number;
            }
            n--;
        }
        System.out.println("Maximum number is : " + max);
        System.out.println("Maximum number is : " + min);
    }
}
