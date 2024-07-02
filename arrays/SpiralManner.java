package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralManner {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        List<Integer> ls = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;
        int top = 0;
        int bottom = n-1;
        int left=0;
        int right = m-1;

    while (left<=right && top<=bottom) {


        for (int i = left; i <= right; i++) {
            ls.add(arr[top][i]);
        }
        top++;
        for (int i = top; i <= bottom; i++) {
            ls.add(arr[i][right]);
        }
        right--;
        if(top<=bottom){
            for (int i = right; i >= left; i--) {
                ls.add(arr[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){
            for (int i = bottom; i >= top; i--) {
                ls.add(arr[i][left]);
            }
            left++;
        }

    }

    for(int i: ls){
        System.out.println(i+" ");
    }


    }
}
