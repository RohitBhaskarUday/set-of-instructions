package string;

public class IsSequence {
    public static void main(String[] args) {

        //there will be 2 strings s1 and t1 you have to find whether the sequence
        // is present within t1 in straight order
        String s1 = "Hello World";
        int len= 0;
        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)!=' '){
                len++;
            }else{
                break;
            }
        }

        System.out.println(len);


    }
}
