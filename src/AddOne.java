import java.util.ArrayList;

public class AddOne {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean overflow = true;

        for (int i = A.size()-1; i >= 0; i--) {
            if (overflow) {
                int d = A.get(i) + 1;
                overflow = d>=10;
                d %= 10;
                A.set(i, d);
            } else break;
        }
        int i = 0;
        if (overflow){
            ans.add(1);
        }
        else {
            while (A.get(i) == 0) i++;
        }
        while (i < A.size()) ans.add(A.get(i++));
        return ans;
    }
}
