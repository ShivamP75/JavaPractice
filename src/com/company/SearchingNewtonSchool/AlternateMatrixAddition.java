package com.company.SearchingNewtonSchool;

import java.util.Scanner;

public class AlternateMatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumBlack = 0;
        int sumWhite = 0;
//        int[][] twoDArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                twoDArray[i][j] = sc.nextInt();
                int num = sc.nextInt();
                if((i & 1) ==0) {
                    if (((j & 1 )== 0)) sumBlack += num;
                    else sumWhite += num;
                }
                else{
                    if (((j & 1) != 0)) sumBlack += num;
                    else sumWhite += num;
                }
            }
        }
        System.out.println(sumBlack);
        System.out.println(sumWhite);
//        matrixAddition(twoDArray);
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <n ; j++) {
//                System.out.print(twoDArray[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    private static void matrixAddition(int[][] twoDArray) {
        int sumBlack = 0;
        int sumWhite = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray.length; j++) {
                if((i & 1) ==0) {
                    if (((j % 1 )== 0)) sumBlack += twoDArray[i][j];
                    else sumWhite += twoDArray[i][j];
                }
                else{
                    if (((j & 1) != 0)) sumBlack += twoDArray[i][j];
                    else sumWhite += twoDArray[i][j];
                }
            }
        }

        System.out.println(sumBlack);
        System.out.println(sumWhite);
    }

}
