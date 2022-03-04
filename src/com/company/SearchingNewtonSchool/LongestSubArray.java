package com.company.SearchingNewtonSchool;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lenOfLongSubarr(arr, n, 0));
    }

    private static int lenOfLongSubarr(int[] arr, int n, int k) {
        int i;
        int maxLength = 0;
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (i = 0; i < n; i++) {
            sum += arr[i];
            if(sum - k == 0){
                maxLength = i+1;
            }
            if(hm.containsKey(sum - k)) {
                if (maxLength < (i - hm.get(sum - k))) {
                    maxLength = i - hm.get(sum - k);
                }
            }
            hm.put(sum, i);
            }
        return maxLength;
    }
}
