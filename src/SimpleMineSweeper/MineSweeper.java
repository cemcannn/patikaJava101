package SimpleMineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    public static void run() {
        int row, col, inputRow, inputCol, mineNumber, mineArea, counter=0, freeArea;
        boolean isWin = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("======================================= \n" +
                "Welcome to Mine Sweeper Game!\n" +
                "Please input row value of mine : ");
        row = scan.nextInt();
        System.out.print("Please input column value of mine : ");
        col = scan.nextInt();

        Random randRow = new Random();
        Random randCol = new Random();

        mineArea = row * col;
        mineNumber = Math.floorDiv(mineArea,4);
        freeArea = mineArea-mineNumber;
        String[][] mine = new String[row][col];

        while(mineNumber>0) {
            int mineRow = randRow.nextInt(row);
            int mineCol = randCol.nextInt(col);
            if (mine[mineRow][mineCol]!="*") {
                mine[mineRow][mineCol] = "*";
                mineNumber--;
            }
        }
//Shows mines!
//        for(int i = 0; i<row; i++) {
//            for(int j = 0; j<col; j++) {
//                if(mine[i][j]==null) {
//                    mine[i][j]="-";
//                }
//                System.out.print(mine[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println("=======================================");
        while(freeArea>0) {
            for(int i = 0; i<row; i++) {
                for(int j = 0; j<col; j++) {
                    if(mine[i][j]==null) {
                        mine[i][j]="-";
                    }
                    if(mine[i][j].equals("*")) {
                        System.out.print("-");
                    } else {
                        System.out.print(mine[i][j]);
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.print("Please input row value : ");
            inputRow = scan.nextInt();
            System.out.print("Please input col value : ");
            inputCol = scan.nextInt();

            if(inputRow<0 || inputRow>=row || inputCol<0 || inputCol>=col) {
                System.out.println("Your input values out of mine area! Please input again.\n" +
                        "=======================================");
                continue;
            }

            if(mine[inputRow][inputCol].equals("*")) {
                System.out.println("You stepped mine, you lost the game!");
                isWin = false;
                break;
            } else {
                counter=0;
                if(inputCol+1<col) {
                    if (mine[inputRow][inputCol+1]=="*") {
                        counter++;
                    }
                }
                if(inputRow+1<row) {
                    if (mine[inputRow+1][inputCol]=="*") {
                        counter++;
                    }
                }
                if(inputRow+1<row && inputCol+1<col) {
                    if (mine[inputRow+1][inputCol+1]=="*") {
                        counter++;
                    }
                }
                if(inputCol-1>=0) {
                    if (mine[inputRow][inputCol-1]=="*") {
                        counter++;
                    }
                }
                if(inputRow-1>=0) {
                    if (mine[inputRow-1][inputCol]=="*") {
                        counter++;
                    }
                }
                if(inputCol-1>=0 && inputRow-1>=0) {
                    if (mine[inputRow-1][inputCol-1]=="*") {
                        counter++;
                    }
                }
                if(inputRow+1<row && inputCol-1>=0) {
                    if (mine[inputRow+1][inputCol-1]=="*") {
                        counter++;
                    }
                }
                if(inputRow-1>=0 && inputCol+1<col) {
                    if (mine[inputRow-1][inputCol+1]=="*") {
                        counter++;
                    }
                }
            }

            if(mine[inputRow][inputCol].equals("-")){
                String number = String.valueOf(counter);
                mine[inputRow][inputCol]=number;
                freeArea--;
            } else {
                System.out.print("You already stepped this area.");
            }
            System.out.println("=======================================");
        }
        if (isWin) {
            System.out.println("Congratulations, you won the game!");
        }

        for(int i = 0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mine[i][j] + " ");
            }
            System.out.println();
        }
    }
}
