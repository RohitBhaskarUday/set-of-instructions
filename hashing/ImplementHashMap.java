package hashing;

import java.sql.SQLOutput;
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

//        Map<String, Integer> map = new HashMap<>();
//        map.put("Rohit",1);
//        map.put("Raj", 2);
//        map.put("Chandler", 7);
//
//        System.out.println(map.get("ro"));
//        System.out.println(map.getOrDefault("ss",0));
//        System.out.println(map.getOrDefault("Rohit",2));
//
//        System.out.println(map.containsKey("Rohit"));

    // read this outtttttttt ------------------------>
        // For creating adjacency list in graphs.


        //Hashmap creation, accessing and programming

        //this is a naive approach which takes TC= O(N*N) and SC= O(N) with auxilary space
        int[] arr  = {10,5,1,5,10};

        int n = arr.length;

        boolean[] visited = new boolean[n];

        for(int i = 0;i<n;i++){

            //skipping this already visited element
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j = i+1;j<n;j++){

                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }

            }
            //System.out.println(arr[i] +" : "+count);
        }

        //Now using hashmaps and its methods
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println("key "+entry.getKey()+ " "+ "Value "+ entry.getValue());
        }



        







    }
}
