package com.company.SearchingNewtonSchool;

import java.util.HashMap;
import java.util.Scanner;

public class ABBA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(abba(s));
    }

    private static int abba(String s) {
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') countA++;
            else countB++;
        }
        return Math.min(countA, countB);
    }
}

