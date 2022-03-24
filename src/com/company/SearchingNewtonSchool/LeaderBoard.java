package com.company.SearchingNewtonSchool;

import java.util.Scanner;
import java.util.Stack;

public class LeaderBoard {
    // Your code here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Long> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(s.isEmpty()){
                s.push(sc.nextLong());
            }
            else{
                Long newInt = sc.nextLong();
                if(s.peek() == newInt){
                    continue;
                }
                else{
                    s.push(newInt);
                }
            }
        }
        int m = sc.nextInt();
        int[] attempts = new int[m];
        for (int i = 0; i < m; i++) {
            attempts[i] = sc.nextInt();
        }
        int j = 0;
        while(!s.isEmpty() && j < m){
            if(s.peek() == attempts[j]){
                System.out.println(s.size());
                s.pop();
                j++;
            }
            else if(s.peek() > attempts[j]){
                System.out.println(s.size()+1);
                j++;
            }
            else{
                s.pop();
            }
        }
        if(s.isEmpty() && j > m){
            System.out.println(1);
        }
    }


}
