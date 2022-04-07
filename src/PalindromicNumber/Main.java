package PalindromicNumber;

public class Main {
    static String isPalindromic(int number) {
        int temp = number, reverseNumber = 0, lastDigit;
        while(temp!=0) {
            System.out.println("===========================");
            System.out.println("Number => " + number);
            lastDigit = temp%10;
            System.out.println("Last digit => " + lastDigit);
            reverseNumber = (reverseNumber * 10) + lastDigit;
            System.out.println("New number => " + reverseNumber);
            temp = temp/10;
        }
        if(reverseNumber==number) {
            return "Number is Palindromic";
        }
        else{
            return "Number isn't Palindromic";
        }

    }
    public static void main(String[] args) {
        System.out.println(isPalindromic(222));
    }
}
