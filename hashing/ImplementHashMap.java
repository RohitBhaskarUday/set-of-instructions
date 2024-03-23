package hashing;

import java.util.*;

public class ImplementHashMap {

    public static void main(String[] args) {

//        int [] arr = {1,2,3,3,5,2,5};
//
//        Scanner sc  = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] hash = new int[n];
//
//        for(int i = 0;i<arr.length; i++){
//            hash[arr[i]]+=1;
//        }
//
//        for(int frequency : hash){
//            System.out.println(frequency);
//        }

        Map<String, Integer> map = new HashMap<>();
        map.put("Rohit",1);
        map.put("Raj", 2);
        map.put("Chandler", 7);

        System.out.println(map.get("ro"));
        System.out.println(map.getOrDefault("ss",0));
        System.out.println(map.getOrDefault("Rohit",2));

        System.out.println(map.containsKey("Rohit"));


        // For creating adjacency list in graphs.







    }
}
