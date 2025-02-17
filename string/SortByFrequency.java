package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFrequency {
    public static void main(String[] args) {
       String str = "tree";

       //calculate the frequency map of the array
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        StringBuilder sb = new StringBuilder();

        //now sort the freq map using a list, bucket sort or priorty que
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((obj1, obj2) -> map.get(obj2) - map.get(obj1));

        for(Character c : list){
            for(int i=0; i<map.get(c); i++){
                sb.append(c);
            }
        }

        char s = '0';
        int a = s-'0';
        System.out.println("a is "+a);


        System.out.println(sb);
        System.out.println(0*-1);


    }
}


