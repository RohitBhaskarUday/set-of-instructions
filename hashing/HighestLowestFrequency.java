package hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestLowestFrequency {

    public static void main(String[] args) {

        int[] arr = {10, 10, 10, 3, 3, 3};
        int n = arr.length;
        //create the hashmap
        Map<Integer, Integer> map = new HashMap<>();

        //input the elements and find its frequency one by one
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }

        int maxValue = 0; int minValue = Integer.MAX_VALUE;
        int minElement = Integer.MIN_VALUE; int maxElement = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();

            int value = entry.getValue();

            //case 1
            if(value>maxValue){
                maxValue=value;
                maxElement=key;
                System.out.println(maxValue);
            } else if (value == maxValue && key<maxElement) {
                maxElement=key;
                System.out.println(maxValue);
            }
            //case 2
            if(value<minValue){
                minValue=value;
                minElement=key;
            } else if (value == minValue && key<minElement)  {
                minElement=key;
            }

        }

        System.out.println(maxElement+ " "+ minElement);

        String[] strs = {"flower","flow","flight"};

        char[] str1 = {'1','2','3'};
        int value = str1[1]-'0';

        int a = 1;
        String res = "100";

        for(int i = 0; i < res.length(); i++){
           int val = res.charAt(i)-'0';
            System.out.println(val);

        }




    }


}
