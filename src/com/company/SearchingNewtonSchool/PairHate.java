package com.company.SearchingNewtonSchool;

import java.util.Scanner;
import java.util.Stack;

public class PairHate {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> s = new Stack<>();
        s.push(str.charAt(0));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (!s.isEmpty()) {
                if (s.peek().equals(str.charAt(i))) {
                    s.pop();
                }
                else{
                    s.push(str.charAt(i));
                }
            } else {
                s.push(str.charAt(i));
            }
        }
        if(s.size() == 1){
            System.out.println(s.pop());
        }
        else {
            while (!s.isEmpty()) {
                sb.append(s.pop());
            }
            sb.reverse();
            System.out.println(sb.toString());

        }
    }
}
