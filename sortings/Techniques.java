package sortings;

public class Techniques {

    public static void main(String[] args) {
        //for transferring elements from one array to another array
        int[] arr = {1,2,3,4,5};
        int n =5;
        int [] temp = new int[n];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        for (int element : temp){
            System.out.print(element+ " ");
        }
    }
}
