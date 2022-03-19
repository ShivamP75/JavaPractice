package com.company.SearchingNewtonSchool;

import java.util.Scanner;

//Given an array of N integers and an integer K, your task is to calculate the count of pairs whose sum is divisible by K.
public class PairSumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countPairs(arr, arr.length, k));
    }

    public static int countPairs(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if((arr[i] + arr[j]) % k == 0 ) count++;
            }
        }
        return count;
    }
}
