package searching;

import java.util.Scanner;
import java.util.SortedMap;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be linearly search: ");
        int n = sc.nextInt();

        //iterate through the array from the beginning to the end
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                System.out.println(n+" is in the position "+i +" of the array");
            }

        }

    }
}
