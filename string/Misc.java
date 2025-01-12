package string;

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








    }
}
