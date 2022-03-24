package com.company.SearchingNewtonSchool;

import java.util.ArrayList;
import java.util.Stack;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] nge = nextGreaterElement(arr);
        System.out.println(Arrays.toString(nge));
        int[] pge = prevGreaterElement(arr);
        System.out.println(Arrays.toString(pge));
        for(int i = 0; i < n; i++){
            System.out.print((nge[i] + pge[i]) + " ");
        }
    }

    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int ci = 1;
        int[] res = new int[arr.length];
        while (ci < arr.length) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[ci]) {
                res[stack.pop()] = ci+1;
            }
            stack.push(ci);
            ci++;
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }
        return res;
    }
    public static int[] prevGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        int ci = arr.length - 2;
        int[] res = new int[arr.length];
        while (ci >= 0) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[ci]) {
                res[stack.pop()] = ci+1;
            }
            stack.push(ci);
            ci--;
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = -1;
        }
        return res;
    }

}