package CombinationCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, totalN=1, totalR=1, total=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input 'n' : ");
        n = input.nextInt();
        System.out.print("Please input 'r' : ");
        r = input.nextInt();

        for (int i=1; i<=n; ++i) {
            totalN *= i;
        }
        for (int i=1; i<=r; ++i) {
            totalR *= i;
        }
        for (int i=1; i<=(n-r); ++i) {
            total *= i;
        }
        double c = totalN/(totalR*total);
        System.out.print(c);
    }
}
