package arrays;

public class SetMatrixZeros {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int n  = arr.length;



//        for(int i=0; i<n;i++){
//            reverse(arr[i]);
//        }

        for (int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                int temp = arr[i][j];
                arr[i][j]=arr[n-j-1][n-i-1];
                arr[n-j-1][n-i-1]=temp;
            }
        }

        for (int i = 0; i <n; i++) {
            for (int j=0; j<n; j++){
                System.out.println(arr[i][j]);
            }

        }
    }

    public static void reverse(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left] = nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }


}
