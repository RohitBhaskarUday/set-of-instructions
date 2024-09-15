package arrays;

public class ThirdMaximum {

    public static void main(String[] args) {


        int[] arr = {1,2,4,5,Integer.MIN_VALUE, Integer.MAX_VALUE};

        // Task is to find the third largest element in the given array.

        // Hint: think about the approach of 1st and 2nd Largest value;

        // let us declare first, 2nd and third largest on a row.

        // we are declaring as long because it does not avoid the case when we compare the Integer.MINVALUE with Long.MINVALUE

        long first = Long.MIN_VALUE;
        long second  = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int element: arr){

            if(element > first){
                third = second;
                second = first;
                first = element;
            } else if (element > second && element < first) {
                third = second;
                second = element;
            } else if (element > third && element < second) {
                third = element;
            }

        }

        int result = third == Long.MIN_VALUE ? (int)first : (int)third;

        System.out.println(result);




    }

}
