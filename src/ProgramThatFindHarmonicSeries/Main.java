package ProgramThatFindHarmonicSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double series=0 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input 'n' value : ");
        n = input.nextInt();

        //double series =
        for(double i=1; i<=n; i++) {
            series += 1/i;
        }
        System.out.print(series);
    }
}
