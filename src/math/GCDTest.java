package math;

import org.junit.jupiter.api.Test;
import sun.misc.GC;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    GCD sol = new GCD();

    @Test
    void gcd() {
        int a = 30;
        int b = 16;
        int expected = 5;

        assertEquals(expected, sol.gcd(a,b));
    }
}