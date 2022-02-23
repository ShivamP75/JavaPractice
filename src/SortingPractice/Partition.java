package SortingPractice;

import java.util.Arrays;

public class Partition {
    public static void main(String[] args) {
        int[] arr = {9,8,23,27,6,18};
        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }


        static int partition(int arr[], int start, int end)
    {
        int pivot = arr[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
//                {11,7,2,6,9,8}
                i++; // increment index of smaller element
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        i++;
        int t = arr[i];
        arr[i] = arr[end];
        arr[end] = t;
        return i;
    }
    public static void quickSort(int[] arr, int l, int r){
        if(l<r) {
            int pivIndex = partition(arr, l, r);

            quickSort(arr, l, pivIndex - 1);
            quickSort(arr, pivIndex + 1, r);
        }

    }
}
