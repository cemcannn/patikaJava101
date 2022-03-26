package FlightCostCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, typeOfFlight;
        double cost = 0.1, price, discountPrice, roundtripDiscount, netPrice;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input flight distance(km) : ");
        distance = input.nextInt();
        System.out.print("Please input your age : ");
        age = input.nextInt();
        System.out.print("1) One way \n2) Roundtrip" +
                "\n Please input type of flight : ");
        typeOfFlight = input.nextInt();

        if (distance>0) {
            if ((age>=0) && (age<12)) {
                if (typeOfFlight == 1) {
                    price = distance * cost;
                    discountPrice = price - (price * 0.5);
                    netPrice = discountPrice ;
                    System.out.println("Net price = " + netPrice + " TL");
                }
                else if (typeOfFlight == 2) {
                    price = distance * cost;
                    discountPrice = price - (price * 0.5);
                    roundtripDiscount = discountPrice - (discountPrice * 0.2);
                    netPrice = roundtripDiscount * 2;
                    System.out.println("Net price = " + netPrice + " TL");
                }
                else {
                    System.out.println("Invalid input");
                }
            }

            else if ((age>=12) && (age<=24)) {
                if (typeOfFlight == 1) {
                    price = distance * cost;
                    discountPrice = price - (price * 0.1);
                    netPrice = discountPrice ;
                    System.out.println("Net price = " + netPrice + " TL");
                }
                else if (typeOfFlight == 2) {
                    price = distance * cost;
                    discountPrice = price - (price * 0.1);
                    roundtripDiscount = discountPrice - (discountPrice * 0.2);
                    netPrice = roundtripDiscount * 2;
                    System.out.println("Net price = " + netPrice + " TL");
                }
                else {
                    System.out.println("Invalid input");
                }
            }

            else if ((age>24) && (age<=65)) {
                if (typeOfFlight == 1) {
                    price = distance * cost;
                    netPrice = price ;
                    System.out.println("Net price = " + netPrice + " TL");
                }
                else if (typeOfFlight == 2) {
                    price = distance * cost;
                    roundtripDiscount = price - (price * 0.2);
                    netPrice = roundtripDiscount * 2;
                    System.out.println("Net price = " + netPrice + " TL");
                }
                else {
                    System.out.println("Invalid input");
                }
            }

            else if (age>65) {
                if (typeOfFlight == 1) {
                    price = distance * cost;
                    discountPrice = price - (price * 0.3);
                    netPrice = discountPrice ;
                    System.out.println("Net price = " + netPrice + " TL");
                }
                else if (typeOfFlight == 2) {
                    price = distance * cost;
                    discountPrice = price - (price * 0.3);
                    roundtripDiscount = discountPrice - (discountPrice * 0.2);
                    netPrice = roundtripDiscount * 2;
                    System.out.println("Net price = " + netPrice + " TL");
                }
                else {
                    System.out.println("Invalid input");
                }
            }

            else {
                System.out.println("Invalid input");
            }
        }

        else {
            System.out.println("Invalid input");
        }
    }
}
