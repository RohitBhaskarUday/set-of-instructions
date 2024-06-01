package arrays;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        int n = arr.length;

        //brute
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i <n ; i++) {
//            set.add(arr[i]);
//        }



        //in a much more optimized way is.
        int j =0;
        for(int i = 1; i<n;i++){
            if(arr[i]!=arr[j]){
                arr[j+1] = arr[i];
                j++;
            }
        }

        for(Integer i: arr){
            System.out.print(i+" ");
        }


    }
}
