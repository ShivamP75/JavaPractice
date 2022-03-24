package com.company.SearchingNewtonSchool;

import java.util.Scanner;
import java.util.Stack;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] arr = new int[n];
        int arr[] = {9, 7, 2, 4, 6, 8, 2, 1, 5};
        int n = arr.length;
        int k = 3;
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        maxAndMin(arr, n , k);
    }

    private static void maxAndMin(int[] arr, int n , int k) {
        int[] res = nextGreaterElement(arr);
        for(int i = 0;i< n-k; i++){
            if(res[i] == -1){
                System.out.print(arr[i] + " ");
            }
            else{
                System.out.print(res[i] + " ");
            }
        }

    }

    public static int[] nextGreaterElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] res = new int[arr.length];
        s.push(0);
        int ci = 0;
        while(ci < arr.length){
            while(!s.isEmpty() && arr[s.peek()] < arr[ci]){
                res[s.pop()] = arr[ci];
            }
            s.push(ci);
            ci++;
        }
        while(!s.isEmpty()){
            res[s.pop()] = -1;
        }
        return res;
    }

}
