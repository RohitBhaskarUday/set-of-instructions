package sortings;

public class SelectionSort {
    public static void main(String[] args) {
        //first initialize the array.
        int[] arr = {5,4,3,2,1};
        //get the length
        int n = arr.length;

        //call the method to sort the array.
        selectionSort(arr, n);

        for (int element : arr) {
            System.out.print(element + " ");
        }

    }

    private static void selectionSort(int[] arr, int n){
        //selection sort from name we can derive that
        //select the minimum index position and swap their positions.
        for (int i = 0; i < n; i++) {
            //assume that start index is the minimum index value
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                //compare each index element with one adjacent ones to find the minimum index element.
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap the minimum index you have found with the current element.
            int temp = arr[i];
            arr[i]=  arr[minIndex];
            arr[minIndex] = temp;

        }
    }

}
