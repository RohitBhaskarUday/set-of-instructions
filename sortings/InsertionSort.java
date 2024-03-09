package sortings;

public class InsertionSort {

    public static void main(String[] args){

        //first initialize the array.
        int[] arr = {5,2,61,7,0};
        //get the length
        int n = arr.length;

        //call the method to sort the array.
        insertion(arr, n);

        for(int element : arr){
            System.out.print(element+" ");
        }
    }

    private static void insertion(int[] arr, int n){

        //let's start iterating the array.
        for (int i = 0; i < n; i++) {
            //some optimizations
            int card = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>card){
                //the swap condition was the problem. be mindful while writing the swap fn.
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]=temp;
                j=j-1;

                //best example for insertion sort is Sorting a pack of cards.
                //remember this logic and you can implement insertion sort by yourselves.
            }

        }


    }

}
