package PrimeNumbers;

public class Main {
    public static void main(String[] args) {

        for(int i = 2; i<=100; i++) {
            int count = 0;
            for(int j = 2; j<=i-1; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count==0){
                System.out.print(i + " ");
            }
        }
    }
}

