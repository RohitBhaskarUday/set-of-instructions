package string;

public class Atoi {
    public static void main(String[] args) {
        String s  = "0-1";
        boolean negative = false;
        int ans = 0;
        for (int i=0 ;i<s.length(); i++){
            if((s.charAt(i)-'0')>=49){
                break;
            }
            if(s.charAt(i)==' '|| s.charAt(i)=='0'){
                continue;
            }
            if(s.charAt(i)=='-'){
                negative = true;
                continue;
            }
            int val = s.charAt(i) - '0';
            if(val<0){
                break;
            }
            ans+=val;

            ans = ans *10;
        }

        System.out.println(ans/10);
    }
}
