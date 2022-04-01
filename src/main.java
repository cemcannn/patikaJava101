
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Basamak sayısı giriniz");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int b = 1; b <= (n - i); b++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2 * i) - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int b = n-1; b >= i; b--) {
                System.out.print(" ");
            }
            for (int m =(2 * i) - 1; m >=1; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}