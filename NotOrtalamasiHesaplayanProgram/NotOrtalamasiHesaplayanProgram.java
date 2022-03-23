import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner inputNot = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz :");
        matematik = inputNot.nextInt();
        System.out.print("Fizik notunuzu giriniz :");
        fizik = inputNot.nextInt();
        System.out.print("Kimya notunuzu giriniz :");
        kimya = inputNot.nextInt();
        System.out.print("Türkçe notunuzu giriniz :");
        turkce = inputNot.nextInt();
        System.out.print("Tarih notunuzu giriniz :");
        tarih = inputNot.nextInt();
        System.out.print("Müzik notunuzu giriniz :");
        muzik = inputNot.nextInt();

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;
        System.out.println("Ortalama :" + sonuc);

        int gecmeNotu = 60;
        boolean kosul = (sonuc>gecmeNotu);
        String str = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
