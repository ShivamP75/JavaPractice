package com.company.SearchingNewtonSchool;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralOrder(matrix));

    }
    /*
    1 2 3 4
    5 6 7 8
    9 10 11 12
    13 14 15 16
    1 2 3 4 5 8 12 16 15 14 13 9 5 6 7 11 10
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int sum = 0;
        int dir = 0;
        while(top <= bottom && left <= right){
            if(dir == 0){
                for (int i = left; i <= right; i++) {
//            System.out.print(matrix[top][i] + " ");
//            sum += matrix[top][i];
                    arr.add(matrix[top][i]);
                }
                top++;
            }

            else if(dir ==1){
                for (int i = top; i <= bottom; i++) {
//            System.out.print(matrix[i][right]+  " ");
//            sum += matrix[i][right];
                    arr.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir ==2 ){
                for (int i = right; i >= left; i--) {
//            System.out.print(matrix[bottom][i]  + " ");
//            sum += matrix[bottom][i];
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if( dir == 3){
                for (int i = bottom; i >= top; i--) {
//            System.out.print(matrix[i][left] + " ");
//            sum += matrix[i][left];
                    arr.add(matrix[i][left]);
                }
                left++;
            }
            dir = (dir+1)%matrix.length;
        }
        return arr;
    }
}
