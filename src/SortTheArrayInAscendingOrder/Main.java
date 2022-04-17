package SortTheArrayInAscendingOrder;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input length of array : ");
        int lengthList = input.nextInt();
        int[] list = new int[lengthList];
        for(int i = 0; i<lengthList; i++) {
            System.out.print("Please input " + i+1 + " element of array : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
