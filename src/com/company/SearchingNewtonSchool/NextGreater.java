package com.company.SearchingNewtonSchool;


import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6, 3, 2};
        int[] res = nextGreaterElement(arr);
        System.out.println(Arrays.toString(res));

    }
    public static int[] nextGreaterElement(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> s =  new Stack<>();
        s.push(0);
        int ci = 1;
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
//    -1 6 6 -1 -1 -1
}

