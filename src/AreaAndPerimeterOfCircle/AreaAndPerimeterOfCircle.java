package AreaAndPerimeterOfCircle;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        float pi = 3.14f;
        int radius;
        int angle;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter radius of circle : ");
        radius = input.nextInt();
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of circle : " + perimeter);

        System.out.print("Please enter center angle : ");
        angle = input.nextInt();
        double area = (pi * (radius*radius) * angle) / 360;
        System.out.println("Area of circle : " + area);

    }
}
