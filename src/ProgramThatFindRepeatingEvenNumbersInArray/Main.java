package ProgramThatFindRepeatingEvenNumbersInArray;

import java.util.Arrays;

public class Main {
    static boolean isFind(int[] list,int value) {
        for(int num : list) {
            if(value == num) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {3,3,5,6,6,7,8,8,8,9,10,11,10};
        int[] evenArray = new int[list.length];
        int startIndex = 0;

        for(int i = 0; i<list.length; i++) {
            for(int j = 0; j<list.length; j++) {
                if(i!=j && list[i] == list[j] && list[i]%2==0) {
                    if(isFind(evenArray,list[i])){
                        evenArray[startIndex++] = list[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(evenArray));
    }
}
