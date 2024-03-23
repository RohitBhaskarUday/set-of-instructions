package sortings;

import java.util.*;
public class Techniques {

    public static void main(String[] args) {

        //for transferring elements from one array to another array
        int[] arr = {1,2,3,4,5};
        int n =5;
        int [] temp = new int[n];

//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
//        for (int element : temp){
//            System.out.print(element+ " ");
//        }
//
//        double x  = Math.random();
//        System.out.println(x);

        //lets see the how binary search works in Collections framework.

//for graphs use this technique.
//        Map<Integer, List<Integer>> adj = new HashMap<>();
//        //1-2 3-5 1-3
//        if(adj.get(1) == null){
//            adj.put(1, new ArrayList<>());
//            adj.get(1).add(2);
//        }

        int[] arr_1 = new int[5];

        int low = 0;
        int high = arr_1.length-1;

        ArrayList<Integer> temp_1 = new ArrayList<>();
        temp_1.add(1);
        temp_1.add(2);
        temp_1.add(3);
        temp_1.add(4);
        temp_1.add(5);

        for (int i = low; i <= high; i++) {
            System.out.println(i);
            arr_1[i] = temp_1.get(i-low);
        }

        for(int i : arr_1){
            System.out.println(":::::");
            System.out.println(i);
        }




    }
}
