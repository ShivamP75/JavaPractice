package com.company.SearchingNewtonSchool;

import java.util.Arrays;
import java.util.Scanner;

//Tom loves Chess boards. He admires its symmetry and how the black and white colours are placed adjacently along both the axis.
//        On his birthday, Tom has been gifted a board which is in the form an NxN grid. Every cell is painted either black or white. Since Tom loves the placement of colours in a chessboard, he will try to convert the board that has been gifted to him identical to a chessboard. He has both black and white colours available to him. Help him find out the minimum number of the cell he will have to recolour to get a chessboard like board.
//        Input
//        First line contains an integer N, denoting the size of the board
//        Next N lines contains N space separated integers and each integer being either '0' or '1'
//        '1' represent black cell
//        '0' represents white cell
//
//        Constraints
//        1 <= N <= 1000
//        Output
//        A single integer that is the minimum number of cells that Tom will have to colour to convert the given board to a chess board
public class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count1 = 0;
        int[][] twoDArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoDArray[i][j] = sc.nextInt();
                if(twoDArray[i][j] == twoDArray[i][j-1]) count1++;
            }
        }
        System.out.println(count1);
//        System.out.println(chessBoard(twoDArray, n));
    }

    private static int chessBoard(int[][] twoDArray, int n) {
        int count = 0;
//        boolean[] flag = new boolean[n * n];
//        int k = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (twoDArray[i][j] == 0) {
//                    flag[k] = false;
//                    k++;
//                } else {
//                    flag[k] = true;
//                    k++;
//                }
//            }
//        }
//        boolean flag1 = flag[0];

        return count;
    }
}
