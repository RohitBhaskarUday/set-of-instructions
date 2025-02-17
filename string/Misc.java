package string;

import java.util.HashMap;
import java.util.Map;

public class Misc {
    public static void main(String[] args) {

        String s1 = "flow";
        String s2 = "flower";
        String prefix="";

        System.out.println(s1.indexOf(s2));
        prefix = s1.substring(0, s1.length() - 1);
        System.out.println(prefix);

        String ss = "1234";

        int val = ss.charAt(3) - '0';
        System.out.println(val);

        StringBuilder sb = new StringBuilder();
        sb.append("abcd");
        System.out.println(sb);
        char ch = 'a';

        int s = ch - 'a';
        System.out.println(" this "+s);

        sb.append(ch);
        System.out.println(sb);

        System.out.println(sb.substring(0,1));

        int x = 1534236469;

        int v = Integer.MAX_VALUE;
        System.out.println(v);

        int rev = 0;
        while(x!=0){
            int n = x%10;
            rev = rev*10+n;
            x = x/10;
        }
        System.out.println(rev);

        if(v>rev){
            System.out.println(true);
        }

        System.out.println(x);


        String stringo = "dog cat dog cat";
        String pattern = "abba";

       String[] small = stringo.split(" ");


       Map<Character, String> map = new HashMap<>();

       for(int i=0; i<pattern.length(); i++){
           char c = pattern.charAt(i);
           if(map.containsKey(c)){

           }

       }














    }
}
