package arrays;

import java.util.ArrayList;

public class Union {


    //task is to find the union of two arrays in sorted order.

    public static void main(String[] args) {

        int[] arr1= {1, 1, 2, 2, 3, 3};
        int[] arr2= {2, 2, 3, 3, 4, 4};

        int n = arr1.length;
        int m = arr2.length;

        //Initialize a temporary array
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n && j<m){

            //check if the element is less or greater
            if(arr1[i]<=arr2[j]){
                if(arr.isEmpty() || arr.get(arr.size()-1)!=arr1[i]){
                    arr.add(arr1[i]);
                }
                i++;
            } else{
                if(arr.isEmpty() || arr.get(arr.size()-1)!=arr2[j]){
                    arr.add(arr2[j]);
                }
                j++;
            }

        }


        while(i<n){
            if(arr.isEmpty() || arr.get(arr.size()-1)!=arr1[i]){
                arr.add(arr1[i]);
            }
            i++;
        }

        while(j<m){
            if(arr.isEmpty() || arr.get(arr.size()-1)!=arr2[j]){
                arr.add(arr2[j]);
            }
            j++;
        }


        for(int element: arr){
            System.out.print(element+" ");
        }



    }

}
