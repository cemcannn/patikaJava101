import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] A = new int[n];
        int count = 0;

        for(int i = 0; i<n; i++) {
            A[i] = input.nextInt();
        }
        for(int j = 0; j<n; j++) {
            int sum = 0;
            for(int k = j; k<n; k++) {
                sum = sum + A[k];
                if(sum<0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        input.close();
    }
}