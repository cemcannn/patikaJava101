import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age,tripType;
        double distance, distancePrice, price;
        distancePrice = 0.10;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Mesafeyi Giriniz : ");
        distance = input.nextDouble();

        System.out.println("Lütfen Yolculuk Tipini Seçiniz : \n1-Tek Yön\n2-Gidiş-Dönüş");
        tripType = input.nextInt();
        input.nextLine();

        switch (tripType) {
            case 1 -> {
                System.out.print("Lüfen Yaşınızı Giriniz : ");
                age = input.nextInt();
                price = distance * distancePrice;
                if (age < 12) {
                    price = price * 0.5;
                    System.out.print("Ödemeniz Gereken Ücret : " + price);
                } else if (age >= 12 && age <= 24) {
                    price = price - (price * 0.10);
                    System.out.print("Ödemeniz Gereken Ücret : " + price);
                } else if (age >= 65) {
                    price = price - (price * 0.3);
                    System.out.print("Ödemeniz Gereken Ücret : " + price);
                } else {
                    System.out.print("Ödemeniz Gereken Ücret : " + price);
                }
            }
            case 2 -> {
                System.out.print("Lüfen Yaşınızı Giriniz : ");
                age = input.nextInt();
                price = (distance + distance) * distancePrice;
                price = price - (price * 0.2);
                if (age < 12) {
                    price = price * 0.5;
                    System.out.print("Ödemeniz Gereken Ücret : " + price);
                } else if (age >= 12 && age <= 24) {
                    price = price - (price * 0.10);
                    System.out.print("Ödemeniz Gereken Ücret : " + price);
                } else if (age >= 65) {
                    price = price - (price * 0.3);
                    System.out.print("Ödemeniz Gereken Ücret : " + price);
                } else {
                    System.out.print("Ödemeniz Gereken Ücret : " + price);
                }
            }
            default -> {
                System.out.print("Hatalı Giriş Yaptınız!");
            }
        }
    }
}