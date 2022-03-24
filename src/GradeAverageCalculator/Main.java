package GradeAverageCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, chemistry, turkishLiterature, history, music;
        Scanner inputNot = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz :");
        math = inputNot.nextInt();
        System.out.print("Fizik notunuzu giriniz :");
        physics = inputNot.nextInt();
        System.out.print("Kimya notunuzu giriniz :");
        chemistry = inputNot.nextInt();
        System.out.print("Türkçe notunuzu giriniz :");
        turkishLiterature = inputNot.nextInt();
        System.out.print("Tarih notunuzu giriniz :");
        history = inputNot.nextInt();
        System.out.print("Müzik notunuzu giriniz :");
        music = inputNot.nextInt();

        int summary = math + physics + chemistry + turkishLiterature + history + music;
        double result = summary / 6;
        System.out.println("Grade Average :" + result);

        int minScore = 60;
        boolean condition = (result>minScore);
        String str = condition ? "Succeed" : "Don't succeed";
        System.out.println(str);
    }
}
