package com.company.SearchingNewtonSchool;

import java.util.Arrays;
import java.util.Scanner;

public class DTriplets {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(dTriplets(arr, p));

    }

    public static int dTriplets(int[] arr, int P) {
        Arrays.sort(arr);

        int count = 0;
        int i = 0, j = 2;
        while (j != arr.length) {
            if (i == j - 1) {
                j++;
                continue;
            }
            if ((arr[j] - arr[i]) > P) {
                i++;
            } else {
                int x = j - i;
                count += (x * (x - 1)) / 2;
                j++;
            }
        }
        return count;
    }


//    public static int dTriplets(int[] arr, int P) {
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int count = 0;
//        int i;
//        for (i = arr.length - 1; i >= 1; i--) {
//            if (arr[i] - arr[0] <= P) break;
//        }
//        if (i == 1) return 0;
//        else if (i == 2) return 1;
//        else return 2 * (i - 1);
//    }
}
//        quickSort(arr, 0, arr.length - 1);
//        int ans = 0;
//        int i = 0;
//        int j = 0;
//        int n = arr.length;
//        while (j != n) {
//
//            if (i == j - 1) {
//                j++;
//                continue;
//            }
//
//            if ((arr[j] - arr[i]) > p) {
//                i++;
//            } else {
//
//                int x = j - i;
//
//                ans += (x * (x - 1)) / 2;
//
//                j++;
//
//            }
//        }
//        return ans;
//    }
//
//    public static void quickSort(int[] arr, int l, int r) {
//        if (l >= r) return;
//        int pivIndx = partition(arr, l, r);
//
//        quickSort(arr, l, pivIndx - 1);
//        quickSort(arr, pivIndx + 1, r);
//
//    }
//
//    public static int partition(int[] arr, int l, int r) {
//        int pivot = arr[r];
//        int i = l, j = l;
//        while (i <= r) {
//            if (arr[i] <= pivot) {
//                int temp = arr[j];
//                arr[j] = arr[i];
//                arr[i] = temp;
//                j++;
//            }
//            i++;
//        }
//        return j - 1;
//    }
