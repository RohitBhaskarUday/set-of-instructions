package ArrayHards;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {

        // Ways of this question

        //1) Given Row and Column find the element of that place
        //  for example if Row=5; Column =3; ans=6;

        //2) Print any row given of the pascal's triangle.
        // for example row=5; output = 1 4 6 4 1

        //3) Given N = 5, you have to print the entire triangle.

        List<Integer> ls  = new ArrayList<>();

        ls.add(2);

        System.out.println(ls.get(ls.size()-1));



    }

}
