package com.company.SearchingNewtonSchool;

import java.util.Scanner;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.printf("%.2f", median(arr1,arr2,m, n));
    }
    public static float median(int[] arr1, int[] arr2, int m, int n){
        float m1 = -1;
        float m2 = -1;
        int i= 0;
        int j = 0;
        if((m + n)% 2 == 1){
            for (int count = 0; count <= (m+n)/2; count++) {
                if(i != m && j != n){
                   m1 = (arr1[i]>arr2[j]) ? arr2[j++] : arr1[i++];
                }
                else if(i<m) m1 = arr1[i++];
                else m1 = arr1[j++];

            }
            return m1;
        }
        else{
            for (int count = 0; count <= (m+n)/2; count++) {
                m2 = m1;
                if(i != n && j != m){
                    m1 = (arr1[i]>arr2[j]) ? arr2[j++] : arr1[i++];
                }
                else if(i<m) m1 = arr1[i++];
                else m1 = arr1[j++];

            }
            return ((m1+m2)/2);

        }
    }
}

