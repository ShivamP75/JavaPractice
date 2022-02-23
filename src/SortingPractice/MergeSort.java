package SortingPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {5,6,1,8,4,3,2};
        int[] arr = merge(arr1,0,arr1.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < arr1.length + arr2.length; k++) {
            if(i != arr1.length && j!= arr2.length){
                arr[k] = (arr1[i] > arr2[j]) ? arr2[j++] : arr1[i++];

            }
            else if(i<arr1.length){
                arr[k] = arr1[i++];
            }
            else{
                arr[k] = arr2[j++];
            }
        }
        return arr;
    }

    public static int[] merge(int[] arr,int start,int end){
        if(start == end){
            int[] res = new int[1];
            res[0] = arr[start];
            return res;
        }
        int mid = (start+end)/2;
        int[] lArr = merge(arr,start, mid);
        int[] rArr = merge(arr,mid+1, end);
        return mergeTwoSortedArray(lArr, rArr);
    }
}
/*
[6,4,2,7,5] size 5
0        4
mid 2
0        2
0       1


res  6

 */
