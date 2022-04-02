package ReverseTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input 'n' value : ");
        n = input.nextInt();

        for(int i = n; i>=1; i--) {
            System.out.println();
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k = (2*i)-1; k>=1; k--) {
                System.out.print("*");
            }
        }
    }
}
