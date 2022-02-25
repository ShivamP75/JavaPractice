package com.company.SearchingNewtonSchool;

import java.util.Scanner;

public class EasySorting {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String temp;
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
