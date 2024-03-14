package searching;

import java.util.Scanner;

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
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int middle = (start+end)/2;
            if(arr[middle]>element){
                end = middle-1;
            }
            else if (arr[middle]<element){
                start = middle+1;
            }
            else return middle;
        }
        return -1;
    }

}
