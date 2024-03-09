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

        mergeSort(arr, low, high);

        System.out.println("The sorted array");
        for (int element: arr) {
            System.out.println(element);
        }

    }

    public static void mergeSort(int[] arr, int low, int high){
        //base case
        if(low>=high) return;
        //find the middle
        int mid = (low+high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low,mid,high);
    }

    public static void merge(int [] arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;

        //create the temporary array
        ArrayList<Integer> temp = new ArrayList<>();

        while(left<=mid && right<=high){
            if(arr[left]>=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <=high ; i++) {
            arr[i]= temp.get(i-low);
        }


    }
}
