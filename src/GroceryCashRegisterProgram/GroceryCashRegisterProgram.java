package GroceryCashRegisterProgram;

import java.util.Scanner;

public class GroceryCashRegisterProgram {
    public static void main(String[] args) {
        float pearPrice = 2.14f, applePrice = 3.67f, tomatoPrice = 1.11f, bananaPrice = 0.95f, eggplantPrice = 5.99f;

        Scanner input = new Scanner(System.in);
        System.out.print("How much kilos of pears do you want : ");
        int pearAmount = input.nextInt();
        System.out.print("How much kilos of apples do you want : ");
        int appleAmount = input.nextInt();
        System.out.print("How much kilos of tomatoes do you want : ");
        int tomatoAmount = input.nextInt();
        System.out.print("How much kilos of bananas do you want : ");
        int bananaAmount = input.nextInt();
        System.out.print("How much kilos of eggplants do you want : ");
        int eggplantAmount = input.nextInt();
        double totalNetPrice = (pearPrice*pearAmount)+(applePrice*appleAmount)+(tomatoPrice*tomatoAmount)+(bananaPrice*bananaAmount)+(eggplantPrice*eggplantAmount);
        System.out.println(totalNetPrice);
    }
}
