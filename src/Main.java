import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(arr);
        int sum = 0;
        int sum1 = 0;
        System.out.print("Girilen sayı : ");
        int num = input.nextInt();
        for (int i : arr) {
            if (num > i) {
                sum = i;
            }
            if (num < i) {
                sum1 = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + sum);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + sum1);
    }
}