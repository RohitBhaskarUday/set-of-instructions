public class insertionSort {

    public static void main(String[] args){

        //first initialize the array.
        int[] arr = {5,2,61,2,0};
        //get the length
        int n = arr.length;

        //call the method to sort the array.
        insertion(arr, n);

        for(int i : arr){
            System.out.println(i);
        }
    }

    private static void insertion(int[] arr, int n){

        //lets start iterating the array.
        for (int i = 0; i < n; i++) {
            int j = i-1;
            while(j>=0 && arr[j]>arr[j+1]){
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
