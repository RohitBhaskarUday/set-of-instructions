package arrays;
public class RotateAnArray{

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};


        //task is to rotate the array towards the left by k times.
        // my intuition
        // it works but not for larger inputs value k = 50,000+ . We needed to find a better way
        int n = nums.length;
        int k =3;

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







        //print the array
        for (int i : nums){
            System.out.print(i+" ");
        }

    }

}