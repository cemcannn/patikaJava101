package LeapYearCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input year : ");
        year = input.nextInt();

        if ((year % 4 == 0) && (year % 400 == 0) && (year>=0)) {
            System.out.println(year + "is leap year!");
        }
        else {
            System.out.println(year + "isn't leap year!");
        }
    }
}
