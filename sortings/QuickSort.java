package sortings;

public class QuickSort {
    public static void main(String[] args) {

        //initialize the array to be sorted.
        int[] arr = {5,4,3,2,1};

        int low = 0;
        int high = arr.length-1;

        //calling quicksort
        quickSort(arr, low, high);
        for (int i : arr){
            System.out.println(i+" ");
        }
    }

    //quick sort is an in-place algorithm.
    private static void quickSort(int[] arr, int low, int high){
        if (low<high){
            int pivotIndex = partition(arr, low,high);
            quickSort(arr, low, pivotIndex);
            quickSort(arr,pivotIndex+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        //check from left to right
        while (i < j){
            //check if the index element is less than the pivot element
            //if the condition passes and if the i value is in bound of the array to the right
            //increment the i value till we find element larger than that of pivot.
            while (arr[i]<=pivot && i<high){
                i++;
            }

            //check if the index element is greater than the pivot element
            //if the condition passes and if the j value is in bound of the array to the left
            //decrement the j value till we find the value smaller than that of pivot.
            while (arr[j]>pivot && j>=low){
                j--;
            }

            //once both the pointer stop at one point we can swap those positions
            //this is done in order to make the left end filled with small elements and right end with large elements.
            //swap those elements to make the above step happen.
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap the j-th position with the current pivot element.
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
