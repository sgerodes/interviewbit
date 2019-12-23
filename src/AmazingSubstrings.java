import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AmazingSubstrings {
    private static final Set<Character> VOWELS = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public int solve(String A) {
        int ans = 0;
        final int MOD = 10003;
        for (int i = 0; i < A.length(); i++) {
            if (VOWELS.contains(A.charAt(i))) ans = (ans + A.length() - i) % MOD;
        }
        return ans;
    }

}
