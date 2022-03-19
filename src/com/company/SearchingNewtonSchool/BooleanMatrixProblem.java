package com.company.SearchingNewtonSchool;

import java.util.Scanner;

public class BooleanMatrixProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
//            int[][] twoDArray = new int[m][n];
            for (int j = 0; j < m; j++) {
                boolean flag = false;
                for (int k = 0; k < n; k++) {
                    int res = sc.nextInt();
                    if(res == 1) {
                        flag = true;
                        break;
                    }

//                    twoDArray[j][k] = sc.nextInt();
                }
                if(flag){
                    for (int k = 0; k < n; k++) {
                        System.out.print(1 + " ");
                    }
                }
                else{
                    for (int k = 0; k < n; k++) {
                        System.out.print(0 + " ");
                    }
                }
                System.out.println();
            }
//            booleanMatrixProblem(twoDArray,m,n);
        }
    }

    private static void booleanMatrixProblem(int[][] twoDArray, int m, int n) {
        for (int i = 0; i < m; i++) {
            boolean flag = false;
            for (int j = 0; j <n ; j++) {
                if(twoDArray[i][j] == 1) flag = true;
            }
            if(flag){
                for (int j = 0; j <n ; j++) {
                    twoDArray[i][j] = 1;
                    System.out.print(twoDArray[i][j] + " ");
                }
            }
            else{
                for (int j = 0; j <n ; j++) {
                    System.out.print(twoDArray[i][j] + " ");
                }
            }
            System.out.println();

        }

    }
}
