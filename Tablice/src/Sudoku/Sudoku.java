package Sudoku;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Sudoku {
    static int[][] sudoku = new int[9][9];

    public static void printBoard() {
        for (int i = 0; i < 9; i++) {
            System.out.print("\n");
            if(i%3==0)
                System.out.print("\n");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0)
                    System.out.print(" ");
                if (sudoku[i][j] == 0)
                    System.out.print(". ");
                if (sudoku[i][j] == 1)
                    System.out.print("1 ");
                if (sudoku[i][j] == 2)
                    System.out.print("2 ");
                if (sudoku[i][j] == 3)
                    System.out.print("3 ");
                if (sudoku[i][j] == 4)
                    System.out.print("4 ");
                if (sudoku[i][j] == 5)
                    System.out.print("5 ");
                if (sudoku[i][j] == 6)
                    System.out.print("6 ");
                if (sudoku[i][j] == 7)
                    System.out.print("7 ");
                if (sudoku[i][j] == 8)
                    System.out.print("8 ");
                if (sudoku[i][j] == 9)
                    System.out.print("9 ");
            }
        }
    }

    public static void main(String[] args) {
       sudoku [0][0]=2;
       sudoku [0][3]=6;
       sudoku [0][5]=7;
       sudoku [0][6]=5;
        sudoku [1][7]=9;
        sudoku [1][8]=6;
        sudoku [2][6]=3;
        sudoku [2][5]=1;
        sudoku [2][2]=7;
        sudoku [2][1]=6;
        sudoku [3][1]=5;
        sudoku [3][3]=7;
        sudoku [3][4]=3;
        sudoku [3][5]=2;
        sudoku [4][1]=7;
        sudoku [4][7]=2;
        sudoku [5][3]=1;
        sudoku [5][4]=8;
        sudoku [5][5]=9;
        sudoku [5][7]=7;
        sudoku [6][2]=3;
        sudoku [6][3]=5;
        sudoku [6][6]=6;
        sudoku [6][8]=4;
        sudoku [7][0]=8;
        sudoku [7][1]=4;
        sudoku [8][2]=5;
        sudoku [8][3]=2;
        sudoku [8][5]=6;
        sudoku [8][8]=8;
        printBoard();
    }
}
