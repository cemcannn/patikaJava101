package BodyMassIndexCalculator;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        float weight;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your weight (in meters) : ");
        weight = input.nextFloat();

        System.out.print("PLease enter your height : ");
        height = input.nextFloat();

        double bmi = weight / (height*height);
        System.out.println(bmi);
    }
}
