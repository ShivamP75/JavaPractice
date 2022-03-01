package com.company.SearchingNewtonSchool;

import java.util.Scanner;

public class NewChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] twoDArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoDArray[i][j] = sc.nextInt();
            }
        }
        System.out.println(chessBoard(twoDArray, n));
    }
// 1 0 1 0
// 1
    private static int chessBoard(int[][] twoDArray, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {

                if((n&1) == 0){
                    if (i > 0 && j == 0) {
                        if (twoDArray[i][j] != twoDArray[i - 1][twoDArray.length - 1]) {
                            count++;
                            if (twoDArray[i][j] == 1) {
                                twoDArray[i][j] = 0;
                            } else {
                                twoDArray[i][j] = 1;
                            }


                        }
                    } else if (twoDArray[i][j + 1] == twoDArray[i][j]) {
                        count++;
                        if (twoDArray[i][j+1] == 1) {
                            twoDArray[i][j+1] = 0;
                        } else {
                            twoDArray[i][j+1] = 1;
                        }
                    }
                }
                else{
                    if (i > 0 && j == 0) {
                        if (twoDArray[i][j] == twoDArray[i - 1][twoDArray.length - 1]) {
                            count++;
                            if (twoDArray[i][j] == 1) {
                                twoDArray[i][j] = 0;
                            } else {
                                twoDArray[i][j] = 1;
                            }


                        }
                    } else if (twoDArray[i][j + 1] == twoDArray[i][j]) {
                        count++;
                        if (twoDArray[i][j+1] == 1) {
                            twoDArray[i][j+1] = 0;
                        } else {
                            twoDArray[i][j+1] = 1;
                        }
                    }
                }
            }
        }
        return count;
    }
}

