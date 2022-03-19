//package com.company.SearchingNewtonSchool;
//
//import java.util.*;
//
//public class GroupOfNumbers implements Comparable<Pair> {
//
//    public static void main(String[] args) {
//        // Your code here
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        groupOfNum(arr, n);
//    }
//
//    public static void groupOfNum(int[] arr, int n) {
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            if (hm.containsKey(arr[i])) {
//                hm.put(arr[i], hm.get(arr[i]) + 1);
//            } else {
//                hm.put(arr[i], 1);
//            }
//        }
//        ArrayList<Pair> arrList = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//            Pair pair = new Pair((int) entry.getKey(), (int) entry.getValue());
//            arrList.add(pair);
//        }
//        Arrays.sort(arrList, (a, b) -> {
//
//        });
//
//        }
//
//
//    @Override
//    public int compareTo(Pair o) {
//        return 0;
//    }
//}
