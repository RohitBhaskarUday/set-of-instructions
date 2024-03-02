package hashing;

import java.util.Scanner;

public class ImplementHashMap {

    public static void main(String[] args) {

        int [] arr = {1,2,3,3,5,2,5};

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        int[] hash = new int[n];

        for(int i = 0;i<arr.length; i++){
            hash[arr[i]]+=1;
        }

        for(int frequency : hash){
            System.out.println(frequency);
        }

    }
}
