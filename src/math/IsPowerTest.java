package math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPowerTest {

    IsPower sol = new IsPower();

    @Test
    void isPower() {
        int number = 1024000000;
        int expected = 1;
        assertEquals(expected, sol.isPower(number));
    }

    @Test
    void isPower2() {
        int number = 2;
        int expected = 0;
        assertEquals(expected, sol.isPower(number));
    }
    @Test
    void isPowerBunch() {
        int[] numbers =  new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] expected = new int[]{0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1};
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(expected[i], sol.isPower(numbers[i]), String.format("Number: {%d}",numbers[i]));
        }
    }
}