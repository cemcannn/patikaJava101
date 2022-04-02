package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count, result=1, n1=0, n2=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input count value : ");
        count = input.nextInt();

        System.out.print(n1 + " " + n2 + " ");

        for(int i = 1; i<=count; i++) {
            System.out.print(result + " ");
            n1 = n2;
            n2 = result;
            result = n1 + n2;
        }
    }
}
