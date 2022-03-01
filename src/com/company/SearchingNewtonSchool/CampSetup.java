package com.company.SearchingNewtonSchool;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class CampSetup {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            long[] arrX = new long[num];
            long[] arrY = new long[num];
            for (int i = 0; i < num; i++) {
                arrX[i] = sc.nextLong();
                arrY[i] = sc.nextLong();
            }
            Arrays.sort(arrX);
            Arrays.sort(arrY);

            int mid = (int)(Math.ceil((double)(num / 2.0) - 1));
            System.out.println(arrX[mid]+" "+arrY[mid]);
        }
    }

// This code is contributed by Bilal
