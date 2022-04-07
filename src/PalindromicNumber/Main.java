package PalindromicNumber;

public class Main {
    static boolean isPalindromic(int number) {
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
            System.out.println("Number is Palindromic");
        }
        else{
            System.out.println("Number isn't Palindromic");
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindromic(222);
    }
}
