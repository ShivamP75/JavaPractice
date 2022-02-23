package com.company.SearchingNewtonSchool;

import java.util.Scanner;

public class OptimalPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            double minDis = minimumDis(x1,y1);
            System.out.println(minDis);
        }
    }

    private static double minimumDis(int x1, int y1) {
        double minimum = 1000;
        for (int x = 0; x <= 100 ; x++) {
            double min;
            for (int y = 0; y <= 100 ; y++) {
                if(y == y1) continue;;
                min = Math.sqrt(Math.pow(x-x1, 2) + Math.pow(y-y1, 2));
                minimum = Math.min(min, minimum);
            }
        }
        return minimum;
    }
}
