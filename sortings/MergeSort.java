package sortings;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {

        //first initialize the array.
        int[] arr = {5,4,3,2,1};

        mergeSort(arr);

        for(int element : arr){
            System.out.print(element+" ");
        }
    }

    private static void mergeSort(int[] arr){
        //call merge sort helper fn
        int n = arr.length;
        int left = 0;
        int right = n-1;

        mergeSortHelper(arr,left, right);
    }

    private static void mergeSortHelper(int [] arr, int left, int right){
        //since this is recursion based you will have a base case
        if (left>=right) return;
        //always find the middle till the entire array has been broken down
        int mid = (left+right)/2;

        mergeSortHelper(arr, left , mid);
        mergeSortHelper(arr, mid+1, right);
        merge(arr, left, mid, right);

    }

    private static void merge(int[] arr, int low, int middle, int high){
        // now merge the sorted array
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = middle+1;

        while(left<=middle && right <= high){
            if (arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=middle){
            temp.add(arr[left]);
            left++;
        }

        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        for(int i =low; i<=high;i++){
            arr[i]= temp.get(i-low);
        }

    }
}
