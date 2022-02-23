package SortingPractice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 3, 2};
        int n = arr.length;
        int[] res = selectionSort(arr, n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] selectionSort(int[] arr, int n ){
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }
}
