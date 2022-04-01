package FindPowerOfGivenNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k, result=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input 'n' value : ");
        n = input.nextInt();
        System.out.print("Please input 'k' value : ");
        k = input.nextInt();

        for (int i = 1; i<=k; ++i){
            result*=n;
        }
        System.out.println("Result : " + result);
    }
}
