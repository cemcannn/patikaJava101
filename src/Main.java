import java.util.*;

public class Main {

    public static boolean canWin(int leap, int[] game, int j) {
        // Return true if you can win the game; otherwise, return false.
        if(j<0 || game[j]==1) {
            return false;
        }
        if(j==game.length-1 || j+leap>=game.length) {
            return true;
        }
        game[j]=1;
        return canWin(leap, game, j+1) || canWin(leap, game, j-1) || canWin(leap, game, j+leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j = 0;
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game,j)) ? "YES" : "NO" );
        }
        scan.close();
    }
}