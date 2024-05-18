package arrays;

public class ArrayRotateByRight {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        int k = 20;
        int n = nums.length;

        //reduce the k value by doing k = k%n;

        k = k%n;
        //store the elements that needed to be shifted on to a temporary array

        int [] temp = new int[k];
       // System.arraycopy(nums, n - k , temp, 0, k);
        for (int i = 0; i <k ; i++) {
            temp[i] = nums[n-k+i];
        }

        for(int i = n-k-1; i>=0;i--){
            //the ith value we need to shift is only k values away.
            //but go from behind so that you actually won't writeoff the unshifted element
            nums[i+k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }


        for(int i: nums){
            System.out.print(i+" ");
        }
    }

}
