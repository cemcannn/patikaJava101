package TransposeMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{2,3,4},{5,6,4}};
        int[][] transpose = new int[3][2];

        for(int i = 0; i<transpose.length; i++) {
            for(int j = 0; j<transpose[i].length; j++) {
                transpose[i][j]=matrix[j][i];
            }
        }
        System.out.println("Matrix :");
        for(int[] elements : matrix) {
            for(int i : elements) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose :");
        for(int[] elements : transpose) {
            for (int i : elements) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
