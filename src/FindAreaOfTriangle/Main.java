package FindAreaOfTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a side of triangle : ");
        a = input.nextInt();
        System.out.print("Please enter b side of triangle : ");
        b = input.nextInt();
        System.out.print("Please enter c side of triangle : ");
        c = input.nextInt();
        double perimeter = (a + b + c)/2;
        double area = Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
        System.out.println(area);
    }
}
