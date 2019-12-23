import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATOITest {

    ATOI sol = new ATOI();

    @Test
    void atoi() {
        String input = "7 U 0 T7165 0128862 089 39 5";
        int expected = 7;
        assertEquals(expected, sol.atoi(input));
    }
    @Test
    void atoi1_2() {
        String input = "      7 U 0 T7165 0128862 089 39 5";
        int expected = 7;
        assertEquals(expected, sol.atoi(input));
    }
    @Test
    void atoi1_3() {
        String input = "- 7 3 32 2";
        int expected = 0;
        assertEquals(expected, sol.atoi(input));
    }
    @Test
    void atoi1_4() {
        String input = "+ 7 3 32 2";
        int expected = 0;
        assertEquals(expected, sol.atoi(input));
    }
    @Test
    void atoi1_5() {
        String input = "+7 3 32 2";
        int expected = 7;
        assertEquals(expected, sol.atoi(input));
    }

    @Test
    void atoi2() {
        String input = "u7 U 0 T7165 0128862 089 39 5";
        int expected = 0;
        assertEquals(expected, sol.atoi(input));
    }
    @Test
    void atoi3() {
        String input = "-15";
        int expected = -15;
        assertEquals(expected, sol.atoi(input));
    }
    @Test
    void atoi4() {
        String input = "1500000000000000000000000";
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, sol.atoi(input));
    }
    @Test
    void atoi5() {
        String input = "-15000000000000000000000000";
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, sol.atoi(input));
    }
    @Test
    void atoi6() {
        String input = String.valueOf(100L + Integer.MAX_VALUE);
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, sol.atoi(input));
    }
    @Test
    void atoi7() {
        String input = String.valueOf(-100L + Integer.MIN_VALUE);
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, sol.atoi(input));
    }
}