import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmazingSubstringsTest {

    AmazingSubstrings sol = new AmazingSubstrings();

    @Test
    void solve() {
        String input = "ABEC";
        int expected = 6;
        assertEquals(expected, sol.solve(input));
    }

    @Test
    void solve2() {
        String input = "ABCD";
        int expected = 4;
        assertEquals(expected, sol.solve(input));
    }

    @Test
    void solve3() {
        String input = "";
        int expected = 0;
        assertEquals(expected, sol.solve(input));
    }

    @Test
    void solve4() {
        String input = "A";
        int expected = 1;
        assertEquals(expected, sol.solve(input));
    }

    @Test
    void solve5() {
        String input = "D";
        int expected = 0;
        assertEquals(expected, sol.solve(input));
    }
}