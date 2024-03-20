package searching;

import java.util.Scanner;
/*
* Binary search works in such a way that the array should always be sorted.
* Once the array is sorted. it starts dividing the array into two half and
* it checks if the middle element is less than or greater than
* then it changes the start -- end positions accordingly.
* this continues till the element is found
* it avoids unnecessary scanning of the elements which helps in the TC.
*/
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be searched: ");

        int n = sc.nextInt();

        //call for binary Search;

        int position = binarySearch(arr,n);

        //int recursive_position = recursiveBinarySearch(arr, n);

        System.out.println("The value n is located at position "+position);

    }






    private static int binarySearch(int[] arr, int element){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(element<arr[mid]){
                high = mid-1;
            } else if (element>arr[mid]) {
                low = mid+1;
            }
            else return mid;
        }
        return -1;
    }

}
