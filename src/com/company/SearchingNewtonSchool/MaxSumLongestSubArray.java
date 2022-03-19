package com.company.SearchingNewtonSchool;


public class MaxSumLongestSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSumInArray(arr, arr.length));
    }

    public static int maxSumInArray(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, s= 0, end = 0;
        for (int i = 0; i < n; i++) {

            sum += arr[i];
            if (maxSum < sum) {
                maxSum = sum;
                start = s;
                end = i;

            }
            if (sum < 0) {
                sum = 0;
                s = i+1;
            }

        }
        System.out.println(start + " " + end);
        return maxSum;
    }
}
