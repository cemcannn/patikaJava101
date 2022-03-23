package VatPriceCalculateProgram;

import java.util.Scanner;

public class VatPriceCalculateProgram {
    public static void main(String[] args) {
        double vatHigh = 18;
        double vatLow = 8;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter net price : ");
        double price = input.nextInt();
        boolean condition = price < 1000;
        double kdvliFiyat = condition ? price + (price * vatHigh /100) : price + (price * vatLow /100);
        System.out.println("KDV dahil fiyat " + kdvliFiyat + " TL");


    }
}
