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
        int[] arr1 = partitions(arr,0,n-1);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] partitions(int[] arr, int l , int r){
        int pivot = arr[r];
        int i = l;
        for (int j = l; j < arr.length; j++) {
            if(arr[j] < pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        return arr;
    }
}
