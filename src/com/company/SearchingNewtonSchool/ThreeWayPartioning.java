package com.company.SearchingNewtonSchool;

import java.util.ArrayList;
import java.util.Scanner;


public class ThreeWayPartioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arrayList.add(sc.nextInt());
            }
            int lowVal = sc.nextInt();
            int highVal = sc.nextInt();
            System.out.println(threeWayPartioning(arrayList, lowVal, highVal));
        }
    }

    private static ArrayList<Integer> threeWayPartioning(ArrayList<Integer> arrayList, int l, int h) {
        int low = partitions(arrayList, 0, l);
        partitions(arrayList, low,h);
        return arrayList;
    }

    //    public static void quickSort(ArrayList<Integer> arrayList, int l, int r){
//        if(l > r ) return;
//
//        int pivotIndex = partitions(arrayList, l , r);
//        quickSort(arrayList, l, pivotIndex-1);
//        quickSort(arrayList, pivotIndex+1, r);
//    }
    public static int partitions(ArrayList<Integer> arrayList, int l, int r) {
        int pivot = r;
        int i = l;
//        7 5 1 4 3 8
        for (int j = l; j < arrayList.size(); j++) {
            if (arrayList.get(j) < pivot) {
                int temp = arrayList.get(i);
                arrayList.set(i, arrayList.get(j));
                arrayList.set(j, temp);
                i++;
            }
        }
        if( i == 0) return 0;

        return i - 1;

    }
}
