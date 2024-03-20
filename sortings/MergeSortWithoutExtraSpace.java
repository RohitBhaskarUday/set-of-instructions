package sortings;

import java.util.ArrayList;

public class MergeSortWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1};

        System.out.println("The unsorted array");
        for (int element: arr) {
            System.out.println(element);
        }

        int low = 0;
        int high = arr.length-1;

       // mergeSort(arr, low, high);

        System.out.println("The sorted array");
        for (int element: arr) {
            System.out.println(element);
        }

    }



}
