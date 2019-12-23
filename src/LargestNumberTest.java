import challenges.inteviewbit.JavaLists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    LargestNumber sol = new LargestNumber();

    @Test
    void largestNumberZeros() {
        ArrayList<Integer> integers = JavaLists.fromStringWithSpaceSeparatedToList("[0 0 0 0]");
        String expected = "0";
        assertEquals(expected, sol.largestNumber(integers));
    }

    @Test
    void largestNumberZeros2() {
        ArrayList<Integer> integers = JavaLists.fromStringWithSpaceSeparatedToList("[0]");
        String expected = "0";
        assertEquals(expected, sol.largestNumber(integers));
    }

    @Test
    void largestNumber() {
        ArrayList<Integer> integers = JavaLists.fromStringWithSpaceSeparatedToList("[12 34]");
        String expected = "3412";
        assertEquals(expected, sol.largestNumber(integers));
    }

    @Test
    void largestNumber2() {
        ArrayList<Integer> integers = JavaLists.fromStringWithSpaceSeparatedToList("[12 34 9]");
        String expected = "93412";
        assertEquals(expected, sol.largestNumber(integers));
    }
    @Test
    void largestNumber3() {
        ArrayList<Integer> integers = JavaLists.fromStringWithCommaSeparatedToList("[3, 30, 34, 5, 9]");
        String expected = "9534330";
        assertEquals(expected, sol.largestNumber(integers));
    }
}