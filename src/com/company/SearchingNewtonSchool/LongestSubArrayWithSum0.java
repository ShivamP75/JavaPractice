package com.company.SearchingNewtonSchool;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithSum0 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lenOfLongSubarr(arr, n));
    }

    private static int lenOfLongSubarr(int[] arr, int n) {
        int i;
        int sum = 0;
        int maxLength = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (i = 0; i < n; i++) {
//            8
//            15 -2 2 -8 1 7 10 23
            sum += arr[i];

            if(sum == 0){
                end = i+1;
                maxLength = end;
            }
            if(hm.containsKey(sum)){
                start = hm.get(sum);
                end = i;
                if((end - start) > maxLength){
                    maxLength = (end - start);
                }
            }
            else{
                hm.put(sum, i);
            }
        }
        if(end == -1) return -1;
        else return maxLength;

    }
}
