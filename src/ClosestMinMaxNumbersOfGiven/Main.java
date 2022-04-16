package ClosestMinMaxNumbersOfGiven;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {20,30,17,56,27,38};
        Arrays.sort(list);
        int num, minValue=0, maxValue=list[list.length-1];
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number : ");
        num = input.nextInt();

        for(int i = 0; i<list.length; i++) {
            if(num>list[i] && list[i]>minValue) {
                minValue = list[i];
            }
            if(num<list[i] && list[i]<maxValue) {
                maxValue = list[i];
            }
        }
        System.out.println("Array : " + Arrays.toString(list) +
                "\nGiven number : " + num +
                "\nMinimum value : " + minValue +
                "\nMaximum value : " + maxValue);
    }
}
