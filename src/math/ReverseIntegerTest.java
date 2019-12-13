package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    ReverseInteger sol = new ReverseInteger();

    @Test
    void reverse() {
        int num = 15;
        int expected = 51;
        assertEquals(expected, sol.reverse(num));
    }
    @Test
    void reverse2() {
        int num = -15;
        int expected = -51;
        assertEquals(expected, sol.reverse(num));
    }
    @Test
    void reverse3() {
        int num = 0;
        int expected = 0;
        assertEquals(expected, sol.reverse(num));
    }
    @Test
    void reverse4() {
        int num = 5000;
        int expected = 5;
        assertEquals(expected, sol.reverse(num));
    }
    @Test
    void reverse5() {
        int num = -5000;
        int expected = -5;
        assertEquals(expected, sol.reverse(num));
    }
    @Test
    void reverse6() {
        int num = -1146467285;
        int expected = 0;
        assertEquals(expected, sol.reverse(num));
    }
}