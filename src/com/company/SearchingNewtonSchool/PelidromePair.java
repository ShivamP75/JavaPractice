package com.company.SearchingNewtonSchool;

import java.util.Scanner;

public class PelidromePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        aabaaba
        pelidromePair(s);
    }

    private static void pelidromePair(String s) {
        int mul = 1;
        for (int k = 3; k < s.length(); k++) {
            if ((k & 1) != 0) {
                int temp = 0;
                temp +=k;
                int t = temp;
                int i = 0;
                while (i < (s.length() - (k-1))) {

                    String subS = s.substring(i, t++);
                    i++;
                    System.out.println(subS);

                    boolean isPeli = isPelidrome(subS, 0, subS.length() - 1);
                    if (isPeli) {
                        i += subS.length()-1;
                        mul *= subS.length();
                    }
                }
            }
        }
        System.out.println(mul);
    }

    public static boolean isPelidrome(String ifPelidrome, int i, int j) {
        for (int k = 0; k < ifPelidrome.length(); k++) {

        }
        if (i >= j) return true;
        if (ifPelidrome.charAt(i) != ifPelidrome.charAt(j)) return false;

        return isPelidrome(ifPelidrome, i + 1, j - 1);
    }
}
