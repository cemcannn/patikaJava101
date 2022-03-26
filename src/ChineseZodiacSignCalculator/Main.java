package ChineseZodiacSignCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthYear, zodiacNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input your year of birth : ");
        birthYear = input.nextInt();
        zodiacNumber = birthYear % 12;

        switch (zodiacNumber) {
            case (0) :
                System.out.println("Chinese Zodiac Sign : Monkey");
                break;
            case (1) :
                System.out.println("Chinese Zodiac Sign : Rooster");
                break;
            case (2) :
                System.out.println("Chinese Zodiac Sign : Dog");
                break;
            case (3) :
                System.out.println("Chinese Zodiac Sign : Pig");
                break;
            case (4) :
                System.out.println("Chinese Zodiac Sign : Rat");
                break;
            case (5) :
                System.out.println("Chinese Zodiac Sign : Ox");
                break;
            case (6) :
                System.out.println("Chinese Zodiac Sign : Tiger");
                break;
            case (7) :
                System.out.println("Chinese Zodiac Sign : Rabbit");
                break;
            case (8) :
                System.out.println("Chinese Zodiac Sign : Dragon");
                break;
            case (9) :
                System.out.println("Chinese Zodiac Sign : Snake");
                break;
            case (10) :
                System.out.println("Chinese Zodiac Sign : Horse");
                break;
            case (11) :
                System.out.println("Chinese Zodiac Sign : Goat");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
