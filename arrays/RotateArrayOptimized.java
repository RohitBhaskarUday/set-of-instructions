package arrays;

public class RotateArrayOptimized {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80};
        int[] numsLeft = {1,2,3,4,5,6,7};

        int k = 3;
        int n = nums.length;
        int n1 = numsLeft.length;
        // we will reduce the value of k by n times.
        k = k%n1;

        // we will start looking at the array by parts. reverse the array by parts.
        //from 0 to n-k is first part, from n-k to n 2nd part, and later we will reverse the entire array.
        reverse(nums,0,n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);

        //same approach for the array rotating left.
        reverse(numsLeft, 0,k-1);
        reverse(numsLeft, n1-k-1, n1-1);
        reverse(numsLeft, 0, n1-1);



        for (int i: numsLeft){
            System.out.print(i+" ");
        }

    }

    public static void reverse(int[] nums, int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
