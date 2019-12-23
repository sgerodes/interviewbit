import java.util.ArrayList;

public class ZizZagString {

    //stringerab

    //1
    //stringerab

    //2
    //s r n e a
    // t i g r b

    //3
    //s   n   a
    // t i g r b
    //  r   e

    //4
    //s     e
    // t   g r
    //  r n   a
    //   i     b

    //5
    //s       a
    // t     r b
    //  r   e
    //   i g
    //    n

    public String convert(String A, int B) {
        if (B <= 1) return A;
        ArrayList<String> ans = new ArrayList<>();
        int[] gaps = new int[]{(B-1) * 2 , 0};
        for (int i = 0; i < B; i++) {
            boolean first = true;
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < A.length();) {
                if (gaps[first? 0 : 1] == 0){
                    first = !first;
                    continue;
                }
                sb.append(A.charAt(j));
                j += gaps[first? 0 : 1];
                first = !first;
            }
            gaps[0] -= 2;
            gaps[1] += 2;
            ans.add(sb.toString());
        }
        return String.join("", ans);
    }
}
