package com.company.SearchingNewtonSchool;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        waveArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void waveArray(int[] arr) {
        Arrays.sort(arr);
//        int i = 0;
//        while(i<arr.length-1){
//            swap(arr,i,i+1);
//            i = i+2;
//
//        }
        int mid = arr.length/2;
        System.out.println(mid);

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}