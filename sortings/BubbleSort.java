package sortings;

public class BubbleSort {
    public static void main(String[] args) {
        //first initialize the array.
        int[] arr = {5,2,61,7,0};
        //get the length
        int n = arr.length;

        //call the method to sort the array.
        bubble(arr, n);

        for(int element : arr) {
            System.out.print(element + " ");
        }
    }

    private static void bubble(int[] arr, int n){

        //let's start iterating through the array.
        for (int i = 0; i < n; i++) {
            boolean swap = true;
            for(int j =0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    // swap case has been hit
                    swap = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
        }
            if(swap) break;
        }
    }
}
