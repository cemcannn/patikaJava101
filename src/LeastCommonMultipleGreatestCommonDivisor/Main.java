package LeastCommonMultipleGreatestCommonDivisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, k=1, lcd, gcd; //lcd = Least Common Multiple, gcd = Greatest Common Divisor

        Scanner input = new Scanner(System.in);
        System.out.print("Please input 'n1' value : ");
        n1 = input.nextInt();
        System.out.print("Please input 'n2' value : ");
        n2 = input.nextInt();
        int i = n1;

        while(i>=1) {
            if(n1%i==0 && n2%i==0) {
                lcd=i;
                System.out.println("Least common multiple : " + lcd);
                break;
            }
            i--;
        }
        while(k<=n1*n2) {
            if(k%n1==0 && k%n2==0) {
                gcd = k;
                System.out.println("Greatest common divisor : " + gcd);
                break;
            }
            k++;
        }
    }
}
