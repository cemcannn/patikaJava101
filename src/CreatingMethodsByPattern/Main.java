package CreatingMethodsByPattern;

import java.util.Scanner;

public class Main {
    static int patternDown(int N, int number) {
        if(N<=0) {
            System.out.print(N + " ");
            return patternUp(N+5, number);
        }
        else {
            System.out.print(N + " ");
            return patternDown(N-5, number);
        }
    }
    static int patternUp(int N, int number) {
        if(N==number) {
            System.out.print(N + " ");
            return N;
        }
        else {
            System.out.print(N + " ");
            return patternUp(N+5, number);
        }
    }
    public static void main(String[] args) {
        int N, number;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input 'N' value : ");
        N = input.nextInt();
        number = N;

        patternDown(N,number);
    }
}
