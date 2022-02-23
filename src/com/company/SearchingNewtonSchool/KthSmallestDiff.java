package com.company.SearchingNewtonSchool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KthSmallestDiff {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < k; i++) {
            for (int j = i+1; j < n; j++) {
                arrList.add(Math.abs(arr[i] - arr[j]));

            }
        }
        Collections.sort(arrList);
        System.out.println(arrList);
        System.out.println(arrList.get(k-1));
    }
}
