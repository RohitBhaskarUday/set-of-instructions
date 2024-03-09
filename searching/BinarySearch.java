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

        System.out.println("The value n is located at position "+position);

    }

    private static int binarySearch(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        while (low <=high) {
            int mid = (low + high) / 2;
            if (arr[mid] < n) {
                low = mid+1;
            } else if (arr[mid]>n) {
                high = mid - 1;
            }
            else return mid;
        }
        return -1;
    }
}
