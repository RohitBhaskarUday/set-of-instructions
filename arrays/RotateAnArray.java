package arrays;
public class RotateAnArray{

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};


        //task is to rotate the array towards the left by k times.
        // my intuition
        // it works but not for larger inputs value k = 50,000+ . We needed to find a better way
        int n = nums.length;
        int k =3;
        k = k%n;

//        while(k>0){
//            int i = n-1;
//            for(int j = n-2; j>=0;j--){
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                i--;
//            }
//            k--;
//        }

        // solve this in a week or two.

        //better solution.
        //if its left rotate store the elements in the left to a temporary array.
        leftRotate(k, n, nums);
        rightRotate(k,n,nums);

    }

    private static void rightRotate(int k , int n, int[] nums){
        //first add the items on the right to a temporary array,
        int[] temp = new int[k];
        for(int i =n-k; i<n; i++){
            temp[i-(n-k)] = nums[i];
        }

        //start from the backward so that no element gets missedout.
        for(int i = n-k-1; i>=0; i--){
            nums[i+k] = nums[i];
        }

        for(int i =0; i<k;i++){
            nums[i] = temp[i];
        }

        System.out.println("This is the right rotation by k elements");

        for (int i: nums){
            System.out.print(i+" ");
        }


    }


    private static void leftRotate(int k, int n, int[] nums){
        int[] temp = new int[k];
        for(int i = 0; i<k;i++){
            temp[i] = nums[i];
        }

        //now shift the back part of the elements to the front/ I mean shift the elements from the kth position to the front.
        for(int i = k; i<n;i++){
            nums[i-k] = nums[i];
        }

        for(int i = n-k; i<n; i++){
            nums[i] = temp[i-(n-k)];
        }


        for (int i: nums){
            System.out.print(i+" ");
        }
    }

}