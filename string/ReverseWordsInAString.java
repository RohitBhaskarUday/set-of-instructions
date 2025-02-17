package string;

public class ReverseWordsInAString {

    public static void main(String[] args) {

        String str = "Sky is blue";


        String str1 = Solution.reverseWords(str);
        System.out.println(str1);

    }
}

class Solution{
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >=0; i--){
            int j = i;
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            sb.append(s.substring(j+1, i+1));
            sb.append(" ");
            i=j;

        }

        return sb.toString().trim();
    }
}




