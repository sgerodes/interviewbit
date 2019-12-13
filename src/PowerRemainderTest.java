import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PowerRemainderTest {

    PowerRemainder solution = new PowerRemainder();
    Random random = new Random();

    @Test
    void pow() {
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(Integer.MAX_VALUE);
            int n = random.nextInt(Integer.MAX_VALUE);
            int d = random.nextInt(Integer.MAX_VALUE)+1;
            int actual = solution.pow(x,n,d);
            long expected = solution.powLong(x,n,d);
            assertTrue(actual >= 0, errorMessage(x,n,d, actual));
            assertEquals(expected, actual, errorMessage(x,n,d, expected));
        }
    }

    @Test
    void powBig() {
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(100);
            int n = random.nextInt(100);
            int d = random.nextInt(100)+1;
            int actual = solution.pow(x,n,d);
            int expected = solution.powBig(x,n,d);
            assertTrue(actual >= 0, errorMessage(x,n,d, actual));
            assertEquals(expected, actual, errorMessage(x,n,d, expected));
        }
    }

    @Test
    void powAlt() {
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(10);
            int n = random.nextInt(10);
            int d = random.nextInt(10)+1;
            int expected = solution.pow(x,n,d);
            int actual = solution.powAlternating(x,n,d);
            assertTrue(actual >= 0, errorMessage(x,n,d, actual));
            assertEquals(expected, actual, errorMessage(x,n,d, expected));
        }
    }

    @Test
    void powFactorisation() {
        for (int i = 0; i < 1000; i++) {
            int x = random.nextInt(3)+1;
            int n = random.nextInt(4)+1;
            int d = random.nextInt(3)+1;
            int actual = solution.pow(x,n,d);
            int expected = solution.powFromInterviewBit(x,n,d);
            assertTrue(actual >= 0, errorMessage(x,n,d, actual));
            assertEquals(expected, actual, errorMessage(x,n,d, expected));
        }
    }
    @Test
    void powFactorisation2() {
        int x = 3;
        int n = 4;
        int d = 5;
        int actual = solution.pow(x,n,d);
        int expected = solution.powInt(x,n,d);
        assertTrue(actual >= 0, errorMessage(x,n,d, actual));
        assertEquals(expected, actual, errorMessage(x,n,d, expected));

    }
    @Test
    void powFactorisation3() {
        for (int i = 0; i < 10000; i++) {
            int x = random.nextInt(6);
            int n = random.nextInt(15)+1;
            int d = random.nextInt(30)+1;
            int actual = solution.pow(x,n,d);
            int expected = solution.powFromInterviewBit(x,n,d);
            assertTrue(actual >= 0, errorMessage(x,n,d, actual));
            assertEquals(expected, actual, errorMessage(x,n,d, expected));
        }
    }
    @Test
    void powFactorisation3big() {
        for (int i = 0; i < 1; i++) {
            int x = random.nextInt(71045971);
            int n = random.nextInt(41535485)+1;
            int d = random.nextInt(64735492)+1;
            int actual = solution.pow(x,n,d);
            int expected = solution.powFromInterviewBit(x,n,d);
            assertTrue(actual >= 0, errorMessage(x,n,d, actual));
            assertEquals(expected, actual, errorMessage(x,n,d, expected));
        }
    }
    @Test
    void powFactorisation4() {
        int x = 5;
        int n = 14;
        int d = 11;
        int actual = solution.pow(x,n,d);
        int expected = solution.powBig(x,n,d);
        assertTrue(actual >= 0, errorMessage(x,n,d, actual));
        assertEquals(expected, actual, errorMessage(x,n,d, expected));

    }




    private String errorMessage(long x, long n, long d, long expected){
        return String.format("Expected {%d}; with values x=%d; n=%d; d=%d", expected, x, n, d);
    }
}