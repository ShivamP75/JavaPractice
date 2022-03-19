package com.company.SearchingNewtonSchool;

import java.util.Scanner;

public class SubArrayMinima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        3
//         1 2 3

        for(int i = 0;i<n;i++){
            int min = arr[i];
            for(int j = i;j<n;j++){
                if(arr[j] < min) min = arr[j];
                sum += min;
            }
        }
        System.out.println(sum);
    }
}
