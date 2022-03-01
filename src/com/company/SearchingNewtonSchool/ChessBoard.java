package com.company.SearchingNewtonSchool;

import java.util.Arrays;
import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] boolArray = new boolean[n * n];
        for (int i = 0; i < n * n; i++) {
            int temp = sc.nextInt();
            if (temp == 1) boolArray[i] = true;
            else boolArray[i] = false;
        }
        int i = 0;
        int count = 0;
        if((n&1) == 0){
            while (i < boolArray.length - 1) {
                if((i > 0) && (((i+1) % n) == 0)){
                    if(boolArray[i] != boolArray[i+1]) {
                        count++;
                        boolArray[i+1] = boolArray[i];
                    }
                }
//                4
//                1 0 1 0    0 1 0 1
//            i   0 1 2 3    4 5 6 7
//                0 1 2 3 4
                else{
                    if (boolArray[i] == boolArray[i+1]) {
                        count++;
                        boolArray[i+1] = !boolArray[i];
                    }
                }
                i++;
            }
        }
        else{
            while (i < boolArray.length - 1) {
                if (boolArray[i] == boolArray[i+1]) {
                    count++;
                    boolArray[i+1] = !boolArray[i];
                }
                i++;
            }
        }
//        System.out.println(Arrays.toString(boolArray));
        System.out.println(count);
    }
}

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


//
////Tom loves Chess boards. He admires its symmetry and how the black and white colours are placed adjacently along both the axis.
////        On his birthday, Tom has been gifted a board which is in the form an NxN grid. Every cell is painted either black or white. Since Tom loves the placement of colours in a chessboard, he will try to convert the board that has been gifted to him identical to a chessboard. He has both black and white colours available to him. Help him find out the minimum number of the cell he will have to recolour to get a chessboard like board.
////        Input
////        First line contains an integer N, denoting the size of the board
////        Next N lines contains N space separated integers and each integer being either '0' or '1'
////        '1' represent black cell
////        '0' represents white cell
////
////        Constraints
////        1 <= N <= 1000
////        Output
////        A single integer that is the minimum number of cells that Tom will have to colour to convert the given board to a chess board
//public class ChessBoard {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count1 = 0;
//        int[] arr = new int[n*n];
//        arr[0] = sc.nextInt();
////        int[][] twoDArray = new int[n][n];
//        for (int i = 1; i < n*n; i++) {
//            arr[i] = sc.nextInt();
//
////            for (int j = 0; j < n; j++) {
////                twoDArray[i][j] = sc.nextInt();
////                if (twoDArray[i][j] == twoDArray[i][j - 1]) count1++;
////            }
//        }
//        int i = 1;
//        // System.out.println(Arrays.toString(flag));
//        while(i < (n * n )){
//            if(arr[0] == arr[i]) count1++;
//
//            i = i+2;
//        }
//        i = 0;
//        while(i < (n * n )){
//            if(arr[0] != arr[i]) count1++;
//
//            i = i+2;
//        }
////        System.out.println(Arrays.toString(arr));
//        System.out.println(count1);
////        return count;
////        System.out.println(chessBoard(twoDArray, n));
//    }
//}
//
////    private static int chessBoard(int[][] twoDArray, int n) {
////        int count = 0;
//////        boolean[] flag = new boolean[n * n];
//////        int k = 0;
//////        for (int i = 0; i < n; i++) {
//////            for (int j = 0; j < n; j++) {
//////                if (twoDArray[i][j] == 0) {
//////                    flag[k] = false;
//////                    k++;
//////                } else {
//////                    flag[k] = true;
//////                    k++;
//////                }
//////            }
//////        }
//////        boolean flag1 = flag[0];
////
////        return count;
////    }
////}
