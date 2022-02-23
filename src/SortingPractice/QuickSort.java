package SortingPractice;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {11,10,15,7,20,13};

        quickSort(arr,0,arr.length-1);
//        System.out.println(partitions(arr,0,arr.length-1));

        System.out.println(Arrays.toString(arr));

    }

//    private static void quickSort(int[] arr, int l, int r) {
//        if(l < r) {
//            int pivIndx = partitions(arr, l, r);
//
//            quickSort(arr, l, pivIndx - 1);
//            quickSort(arr, pivIndx + 1, r);
//        }
//
//    }
//
//    private static int partitions(int[] arr, int l, int r) {
//        int pivot = arr[r];
//        int i = l-1;
//        for (int j = 0; j < r; j++) {
//            if(arr[j] < pivot){
//                i++;
//                int temp = arr[j];
//                arr[j] = arr[i];
//                arr[i] = temp;
//            }
//        }
//        i++;
//        int temp = arr[i];
//        arr[i] = arr[r];
//        arr[r] = temp;
//        return i;
//    }




















    public static int partitions(int[] arr, int l, int r){
        int pivot = arr[r];
        int i = l;
        int j;
        for (j = l; j < arr.length; j++) {
            if(arr[j] <= pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        return i-1;
    }

    public static void quickSort(int[] arr, int l, int r){
        if(l>r) return;
        int pivotIndx = partitions(arr,l,r);

        quickSort(arr,l,pivotIndx-1);
        quickSort(arr,pivotIndx+1, r);
    }
}
