import math.ReverseInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString sol = new ReverseString();

    @Test
    void solve() {
        String[] initial = new String[]{"the sky is blue", "this is ib"};
        String[] expected = new String[]{"blue is sky the", "ib is this"};
        for (int i = 0; i < initial.length; i++) {
            assertEquals(expected[i], sol.solve(initial[i]));
        }
    }

    @Test
    void solveSpaces() {
        String[] initial = new String[]{"the sky  is     blue", " this is ib "};
        String[] expected = new String[]{"blue is sky the", "ib is this"};
        for (int i = 0; i < initial.length; i++) {
            assertEquals(expected[i], sol.solve(initial[i]));
        }
    }

    @Test
    void solveEmpty() {
        String[] initial = new String[]{"", " "};
        String[] expected = new String[]{"", ""};
        for (int i = 0; i < initial.length; i++) {
            assertEquals(expected[i], sol.solve(initial[i]));
        }
    }
}