package TriangleStarPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input 'n' value : ");
        int n = input.nextInt();

        for(int i = 1; i <= (n/2)-1; i++) {
            for(int k = 1; k <= (n/2-i); k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 6; i >= 0; i--) {
            for(int k = 1; k<=(n/2)-i; k++) {
                System.out.print(" ");
            }
            for(int m = 1; m<=(2*i)-1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
