package GradeAverageCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, chemistry, turkishLiterature, history, music, summary, minScore=60;
        Scanner inputNot = new Scanner(System.in);
        System.out.print("Pease enter math score :");
        math = inputNot.nextInt();
        System.out.print("Pease enter physics score :");
        physics = inputNot.nextInt();
        System.out.print("Pease enter chemistry score :");
        chemistry = inputNot.nextInt();
        System.out.print("Pease enter turkishLiterature score :");
        turkishLiterature = inputNot.nextInt();
        System.out.print("Pease enter history score :");
        history = inputNot.nextInt();
        System.out.print("Pease enter music score :");
        music = inputNot.nextInt();

        summary = math + physics + chemistry + turkishLiterature + history + music;
        double result = summary / 6;
        System.out.println("Grade Average :" + result);

        boolean condition = (result>minScore);
        String str = condition ? "Succeed" : "Don't succeed";
        System.out.println(str);
    }
}
