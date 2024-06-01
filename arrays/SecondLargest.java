package arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 2};
        int n = arr.length;

        int max = -1; int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }

        int secondMax = Integer.MIN_VALUE; int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i <n; i++) {
            if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
            if (arr[i]<secondMin && arr[i]!=min) {
                secondMin = arr[i];

            }

        }

        System.out.println(max+" "+min);

        System.out.println(secondMax+" "+secondMin);

        System.out.println("The Second Largest opti "+SecondL(arr));


    }


    public static int SecondL(int[] arr){
        int n = arr.length;
        int Largest = Integer.MIN_VALUE;
        int SLargest = -1;
        for(int i = 0; i<n; i++){
            if(arr[i]>Largest){
                Largest = arr[i];
            } else if (arr[i]>SLargest && arr[i]<Largest) {
                SLargest = arr[i];
            }
        }

        return SLargest;
    }
}
