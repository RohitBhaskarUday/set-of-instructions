package sortings;

public class QuickSort {
    public static void main(String[] args) {

        //initizalize the array to be sorted.
        int[] arr = {4,5,6,21,2,1};

        for(int i : arr){
            System.out.print(i+" ");
        }

        int low = 0;

        int high = arr.length-1;

        //calling quicksort
        quickSort(arr, low, high);

        for (int i : arr){
            System.out.println(i+" ");
        }
    }

    private static void quickSort(int[] arr, int low, int high){
        if (low<high){
            int pivotIndex = partition(arr, low,high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }

    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int left = low;
        int right = high;
        while(left<right) {
            while (arr[left] <= pivot && left <= high - 1) {
                left++;
            }
            while (arr[right] > pivot && right >= low + 1) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;

        return right;
    }
}
