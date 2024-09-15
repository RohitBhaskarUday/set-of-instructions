package binarysearch;

public class PeakElement {

    public static void main(String[] args) {

        int[] arr = {1,2,1,3,5,6,4};

        // return the peak element in this array

        //int peak = getPeak(arr, arr.length);

        int peak = getPeakOptimized(arr, arr.length);
        System.out.println(peak);

    }

    public static int getPeakOptimized(int[] arr, int n){
        int ans = -1;
        if (n == 1){
            return arr[0];
        }
        if(n ==2){
            if(arr[0]>arr[1]){
                return arr[0];
            }else return arr[1];
        }



        return ans;

    }

    public static int getPeak(int[] arr, int n){

        int ans = -1;

        if (n == 1){
            return arr[0];
        }

        if(n ==2){
            if(arr[0]>arr[1]){
                return arr[0];
            }else return arr[1];
        }

        for(int i=1; i<n-1; i++){
            if(arr[i]>arr[i-1] && arr[i]> arr[i+1]) {
                ans = arr[i];
            }
        }

        return ans;
    }
}
