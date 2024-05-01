package arrays;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        int n = arr.length;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <n ; i++) {
            set.add(arr[i]);
        }

        for(Integer i: set){
            System.out.println(i);
        }


    }
}
