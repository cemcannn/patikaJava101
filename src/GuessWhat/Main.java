package GuessWhat;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int guess;
        int rights = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while(rights < 5) {
            System.out.print("Please input a number between 0-100 : ");
            guess = scan.nextInt();

            if(guess<0 || guess>100) {
                System.out.println("Please input a correct number between 0-100");
                if(isWrong) {
                    wrong[rights] = guess;
                    rights++;
                    System.out.println("You input incorrect number again and lost your right! \nYour remaining rights = " + (5-rights));
                } else {
                    isWrong =true;
                    System.out.println("if you input incorrect number again, you will lose a right!");
                }
                continue;
            }

            if(guess == number) {
                System.out.println("Congratulations, you guess right!");
                break;
            } else {
                if(guess<number) {
                    System.out.println("Your input is lower than the number you would guess.");
                }
                else {
                    System.out.println("Your input is upper than the number you would guess.");
                }
            }

            wrong[rights] = guess;
            rights++;
            System.out.println("Your remaining rights = " + (5-rights));
        }
        if(!isWin) {
            System.out.println("You lost the game! \nThe number is = " + number);
            if(!isWrong) {
                System.out.println("Your guesses are = " + Arrays.toString(wrong));
            }
        }
    }
}
