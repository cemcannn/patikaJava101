import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        int n,r,toplam=1,toplamr=1;
        System.out.println("C(n,r) değerleri gir. ");

        n = input.nextInt();
        r = input.nextInt();

        for (int i =n-r+1; i <= n ; i++){
            toplam*=i;
        }
        for (int i = 1; i <=r ; i++){
            toplamr*=i;
        }
        System.out.println(toplam/toplamr);
    }
}