package com.company.SearchingNewtonSchool;

import java.util.*;

public class MaxOFAllSubArrayOfSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
       for(int i = arr.length-1; i>=0; i--) {
           if (arr[i] > max) {
               max = arr[i];
               System.out.println(max);
           }

       }
    }
}
