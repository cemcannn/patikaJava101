package ProgramThatFindPowerUsingRecursive;

import java.util.Scanner;

public class Main {
    static int power(int base, int exp) {
        if (exp!=0) {
            return(base * power(base,exp-1));
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int base, exp;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input base value : ");
        base = input.nextInt();
        System.out.print("Please input exponent value : ");
        exp = input.nextInt();

        System.out.println(exp + " to the power of " + base + " = " + power(base, exp));
    }

}
