package com.company.SearchingNewtonSchool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashingCountDuplicate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        HashSet<Integer> hSet = new HashSet<>();
        for(int i = 0; i < num; i++){
            int a = Integer.parseInt(reader.readLine());
            hSet.add(a);
            }
        System.out.println(hSet.size());
    }
}
