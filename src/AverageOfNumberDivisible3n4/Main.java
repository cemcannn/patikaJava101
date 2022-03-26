package AverageOfNumberDivisible3n4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, total=0, counter=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input number : ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i%12 == 0) {
                total+=i;
                counter++;
            }
        }
        double average = total/counter;
        System.out.println("Average number is : " + average);
    }
}
