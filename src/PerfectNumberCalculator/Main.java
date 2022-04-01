package PerfectNumberCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, div=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input 'n' value : ");
        n = input.nextInt();

        for(int i = 1; i<n; i++) {
            if(n%i==0) {
                div += i;
            }
        }
        if(div==n) {
            System.out.println("'n' value is Perfect Number.");
        }
        else {
            System.out.println("'n' value isn't Perfect Number.");
        }
    }
}
