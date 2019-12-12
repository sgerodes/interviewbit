import challenges.inteviewbit.Parser;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class BinaryFindMinTest {

    BinaryFindMin sol = new BinaryFindMin();
    Random rand = new Random();

    @Test
    void findMinBunch() {
        for (int i = 0; i < 100; i++) {
            ArrayList<Integer> initial = Parser.generateRandomIntegerListWithUniqueValues(10, 0, 15);
            Collections.sort(initial);
            int expected = initial.get(0);
            List<Integer> shifted = shift(initial, rand.nextInt(initial.size()));
            assertEquals(expected, sol.findMin(shifted), errorMessage(shifted,expected));
        }
    }
    @Test
    void findMinBunch2() {
        for (int i = 0; i < 100; i++) {
            ArrayList<Integer> initial = Parser.generateRandomIntegerListWithUniqueValues(10, -10, 3);
            Collections.sort(initial);
            int expected = initial.get(0);
            List<Integer> shifted = shift(initial, rand.nextInt(initial.size()));
            assertEquals(expected, sol.findMin(shifted), errorMessage(shifted,expected));
        }
    }
    @Test
    void findMinBunch3() {
        for (int i = 0; i < 1000; i++) {
            ArrayList<Integer> initial = Parser.generateRandomIntegerListWithUniqueValues(rand.nextInt(10)+1, - rand.nextInt(5), rand.nextInt(15) + 20);
            Collections.sort(initial);
            int expected = initial.get(0);
            List<Integer> shifted = shift(initial, rand.nextInt(initial.size()));
            try {
                assertEquals(expected, sol.findMin(shifted), errorMessage(shifted,expected));
            } catch (Exception e){
                System.out.println( errorMessage(shifted,expected));
                e.printStackTrace();
            }
        }
    }
    @Test
    void findMin() {
        ArrayList<Integer> shifted = Parser.fromStringWithSpaceSeparatedToList("[4 5 6 7 8 1 2 3]");
        int expected = 1;

        assertEquals(expected, sol.findMin(shifted), errorMessage(shifted,expected));
    }
    @Test
    void findMin4() {
        ArrayList<Integer> shifted = Parser.fromStringWithSpaceSeparatedToList("[18 3]");
        int expected = 3;

        assertEquals(expected, sol.findMin(shifted), errorMessage(shifted,expected));
    }
    @Test
    void findMin2() {
        ArrayList<Integer> shifted = Parser.fromStringWithSpaceSeparatedToList("[4 5 1]");
        int expected = 1;

        assertEquals(expected, sol.findMin(shifted), errorMessage(shifted,expected));
    }

    @Test
    void findMin3() {
        ArrayList<Integer> shifted = Parser.fromStringWithSpaceSeparatedToList("[1]");
        int expected = 1;

        assertEquals(expected, sol.findMin(shifted), errorMessage(shifted,expected));
    }

    private List<Integer> shift(List<Integer> initial, int shift) {
        Integer[] shifted = new Integer[initial.size()];
        int len = initial.size();
        for (int i = 0; i < len; i++) {
            shifted[ (i + shift) % len] = initial.get(i);
        }
        return Arrays.asList(shifted);
    }

    private String errorMessage(List<Integer> initial, int expected){
        return String.format("Expected: {%d}; in %s", expected, initial.toString());
    }

}