package GradeAverageCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, chemistry, turkishLiterature, history, music, result, minScore=60;
        Scanner inputNot = new Scanner(System.in);
        System.out.print("Please input math score :");
        math = inputNot.nextInt();
        System.out.print("Please input physics score :");
        physics = inputNot.nextInt();
        System.out.print("Please input chemistry score :");
        chemistry = inputNot.nextInt();
        System.out.print("Please input turkishLiterature score :");
        turkishLiterature = inputNot.nextInt();
        System.out.print("Please input history score :");
        history = inputNot.nextInt();
        System.out.print("Please input music score :");
        music = inputNot.nextInt();

        result = math + physics + chemistry + turkishLiterature + history + music;
        double average = result / 6;
        System.out.println("Grade Average :" + average);

        boolean condition = (result>minScore);
        String str = condition ? "Succeed" : "Don't succeed";
        System.out.println(str);
    }
}
