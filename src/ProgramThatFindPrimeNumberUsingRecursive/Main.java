package ProgramThatFindPrimeNumberUsingRecursive;

import java.util.Scanner;

public class Main {
    static String prime(int i,int num) {
        if(num==i) {
            return num + " is a prime number.";
        }
        else if(num%i==0 || num>=1) {
            return num + " isn't prime number.";
        }
        else {
            return prime(i+1, num);
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input number to check : ");
        number = input.nextInt();

        System.out.println(prime(2,number));
    }
}
