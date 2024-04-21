package arrays;

import java.util.Scanner;

public class ImplementArraysandMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();



        // lets call linear search in this
        //initialize the array
        int[] arr  = {1,6,7,8,2,1,2,3};
        for(int i = 0;i<arr.length;i++) {
            if (arr[i] == n) {
                System.out.println("The position is at index "+i);
            }
        }
        System.out.println("Index not found");




    }
}
