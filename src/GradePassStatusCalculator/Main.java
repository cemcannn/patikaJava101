package GradePassStatusCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, turkishLiterature, chemistry, music, minScore = 55, summary=0, course=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter math score : ");
        math = input.nextInt();
        System.out.print("Please enter physics score : ");
        physics = input.nextInt();
        System.out.print("Please enter chemistry score : ");
        chemistry = input.nextInt();
        System.out.print("Please enter turkishLiterature score : ");
        turkishLiterature = input.nextInt();
        System.out.print("Please enter music score : ");
        music = input.nextInt();

        if (math > 0 && math < 100) {
            summary += math;
            ++course;
        }
        if (physics > 0 && physics < 100) {
            summary += physics;
            ++course;
        }
        if (chemistry > 0 && chemistry < 100) {
            summary += chemistry;
            ++course;
        }
        if (turkishLiterature > 0 && turkishLiterature < 100) {
            summary += turkishLiterature;
            ++course;
        }
        if (music > 0 && music < 100) {
            summary += music;
            ++course;
        }

        double result = summary / course;
        System.out.println("Grade average :" + result);
        if (result>minScore) {
            System.out.println("Succeed");
        } else {
            System.out.println("Don't succeed");
        }

    }
}
