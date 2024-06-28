package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLeaders {

    public static void main(String[] args) {

        int[] arr = {10,4,2,4,1};

        //now we need to find the leaders in this array.

        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        for(int i=0; i<n; i++){
            int element = arr[i];
            boolean flag = false;
            for(int j=i+1; j<n; j++){
                if(element<arr[j]){
                    flag=true;
                }
            }
            if(!flag){
                leaders.add(element);
            }
        }


        Collections.reverse(leaders);


        for(Integer k: leaders){
            System.out.print(k+" ");
        }



    }
}
