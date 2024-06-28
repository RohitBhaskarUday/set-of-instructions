package hashing;

import java.util.Set;

public class HashSet {

    public static void main(String[] args) {

        Set<Integer> set = new java.util.HashSet<>();

        int[] arr  = {100,4,200,1,3,2};

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i: set) System.out.println(i);

    }
}
