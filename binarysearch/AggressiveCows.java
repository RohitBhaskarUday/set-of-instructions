package binarysearch;

import java.util.Arrays;

public class AggressiveCows {

    public static void main(String[] args) {

        int arr[] = {0,3,4,7,10,9};

        int k = 4;

        Arrays.sort(arr);

        int n = arr.length;

        int min = arr[0];
        int max = arr[n-1];


        for(int i=1; i<=max-min; i++){
            if(canWePut(arr, k, i) == true){
                continue;
            }
            else{
                System.out.println(i-1);
            }
        }
    }

   /// public static int agressiveCows() /*
    //
    // write the code over here
    // */

    public static boolean canWePut(int[] arr, int cows, int distance){

        int count = 1;
        int last = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] - last >= distance){
                count++;
                last = arr[i];
            }
        }

        if(count>=cows) return true;
        else return false;

    }

}
