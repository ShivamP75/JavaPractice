package com.company.SearchingNewtonSchool;

public class ImplementQuickSort {
}
//
//    /*
//    // Information about the arguments given in function
//    arr[]: input array
//    start: starting index of array
//    end: ending index of array
//    */
//    public static int[] quickSort(int arr[], int start, int end)
//    {
//        // Your code here
//        // You can create your own helper function
//        quickSort1(arr,start,end);
//        int[] arr1 = arr;
//        return arr1;
//    }
//
//    public static void quickSort1(int[] arr, int l, int r) {
//        if (l >= r) return;
//        int pi = partitionIndex(arr, l, r);
//        quickSort(arr, l, pi - 1);
//        quickSort(arr, pi + 1, r);
//    }
//
//    public static int partitionIndex(int[] arr, int l, int r) {
//        int pivot = arr[r];
//        int i = l, j = l;
//        while (i <= r) {
//            if (arr[i] <= pivot) {
//                if (i != j) swap(arr, i, j);
//                j++;
//            }
//            i++;
//        }
//        return j - 1;
//    }
//
//    public static void swap(int[] arr, int i, int minIdx) {
//        int temp = arr[i];
//        arr[i] = arr[minIdx];
//        arr[minIdx] = temp;
//    }
