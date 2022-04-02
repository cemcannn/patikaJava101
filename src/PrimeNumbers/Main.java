package PrimeNumbers;

public class Main {
    public static void main(String[] args) {

        for(int i = 2; i<=100; i++) {
            for(int j = 2; j<=i-1; j++) {
                if(i%j==0) {
                    break;
                }
            }
        }
    }
}

