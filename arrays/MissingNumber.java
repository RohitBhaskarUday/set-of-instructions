package arrays;

public class MissingNumber {

    //task is to find the missing number within a given range using xor which is the most optimal soluti
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};

        int n = arr.length;
        int xor=0;

        for(int i=0; i<n; i++){
            xor=xor^arr[i];
        }

        System.out.println("before"+xor);

        for (int i = 0; i <=n; i++) {
            xor=xor^i;
        }



        System.out.println(xor);




    }
}
