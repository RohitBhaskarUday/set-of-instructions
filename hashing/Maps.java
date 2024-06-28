package hashing;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        HashMap<Integer,Integer> hmap = new HashMap<>();

        map.put(1,3);
        hmap.put(1,3);


        System.out.println(hmap.get(3));
        System.out.println(map.get(1));

        for(Map.Entry<Integer,Integer> i: map.entrySet()){
           int value= i.getValue();
            System.out.println(i+":"+value);
        }


    }
}
