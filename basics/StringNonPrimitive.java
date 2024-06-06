package basics;

public class StringNonPrimitive {

    //why is java string considered as a reference
    // strings are immutable ;  Strings are literals
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");


        System.out.println(s1==s3); //the content might be same
        //but they are completely pointing towards different blocks of memory
        //one is at string pool and the other is a obj block inside of heap memory

        //System.out.println(4^1^2^1^2); xor operation

    }




}
