package ActivityRecommandationBasedOnWeatherCondition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature;

        Scanner input = new Scanner(System.in);
        System.out.print(
                        " 1) temperature < 5" +
                        "\n 2) 5 < temperature && temperature < 15" +
                        "\n 3) 15 < temperature && temperature < 25" +
                        "\n 4) 25 < temperature;" +
                        "\n Please select degree of temperature range : ");
        temperature = input.nextInt();

        switch (temperature) {
            case 1 :
                System.out.println("You should try to ski in this weather");
                break;
            case 2:
                System.out.println("You should go to cinema in this weather");
                break;
            case 3:
                System.out.println("Temperature is a good for picnic");
                break;
            case 4:
                System.out.println("You should try to swim in this weather");
                break;
            default:
                System.out.println("Invalid select");
        }
    }
}
