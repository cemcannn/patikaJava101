package TaximeterProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter traveled distance : ");
        distance = input.nextInt();
        double price = 10 + (distance * 2.2);
        boolean condition = price < 20;
        double netPrice = condition ? 20 : price;
        System.out.println(netPrice);
    }
}
