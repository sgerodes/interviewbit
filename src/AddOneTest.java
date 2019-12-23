import challenges.inteviewbit.JavaLists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AddOneTest {

    AddOne sol = new AddOne();

    @Test
    void plusOne() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 3]");
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("1 2 4");

        assertIterableEquals(expected, sol.plusOne(initial));
    }
    @Test
    void plusOne2() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[9 9 9]");
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("1 0 0 0");

        assertIterableEquals(expected, sol.plusOne(initial));
    }
    @Test
    void plusOne3() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[0]");
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("1");

        assertIterableEquals(expected, sol.plusOne(initial));
    }
    @Test
    void plusOne4() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[0 0 0 3]");
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("4");

        assertIterableEquals(expected, sol.plusOne(initial));
    }
    void plusOne5() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[0 0 0 0]");
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("1");

        assertIterableEquals(expected, sol.plusOne(initial));
    }
}