package com.company.SearchingNewtonSchool;

import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 4;
        int[][] res = spiral(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] spiral(int n) {
        int[][] spiralMatrix = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int k = 1;
        int dir = 0;
        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    spiralMatrix[top][i] = k++;
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= bottom; i++) {
                    spiralMatrix[i][right] = k++;
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    spiralMatrix[bottom][i] = k++;
                }
                bottom--;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--) {
                    spiralMatrix[i][left] = k++;
                }
                left++;
            }
            dir = (dir + 1) % n;
        }
        return spiralMatrix;
    }
}
