package com.company.SearchingNewtonSchool;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> s = new Stack<>();
        int max = arr[0];
        for(int i = 1; i< n ; i++){
            if(arr[i] > max){
                max = arr[i];
                s.push(max);
                System.out.print(s.pop()+ " ");
            }

        }


//        for(int i = 0; i< n-1; i++){
//            int max = arr[i];
//            for(int j = i+1;j<n;j++){
//                if(arr[j] > max){
//                    max = arr[j];
//                    System.out.print(max + " ");
//                    break;
//                }
//            }
//            if(max == arr[i]){
//                System.out.print("-1 ");
//            }
//        }
//        System.out.print("-1");
    }
}
