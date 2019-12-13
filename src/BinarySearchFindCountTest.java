import challenges.inteviewbit.JavaLists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchFindCountTest {

    BinarySearchFindCount sol = new BinarySearchFindCount();
    Random rand = new Random();

    @Test
    void binaryFindCount() {
        for (int i = 0; i < 1000; i++) {
            ArrayList<Integer> initial = JavaLists.generateRandomIntegerList(10, -2, 4);
            int toFind = initial.get(rand.nextInt(initial.size()-1));
            Collections.sort(initial);
            int expected = Collections.frequency(initial, toFind);
            assertEquals(expected, sol.findCount(initial, toFind), errorMessage(initial,toFind,expected));
        }
    }

    @Test
    void binaryFindCount2() {
        for (int i = 0; i < 1000; i++) {
            ArrayList<Integer> initial = JavaLists.generateRandomIntegerList(100, -20, 15);
            int toFind = initial.get(rand.nextInt(initial.size()-1));
            Collections.sort(initial);
            int expected = Collections.frequency(initial, toFind);
            assertEquals(expected, sol.findCount(initial, toFind), errorMessage(initial,toFind,expected));
        }
    }
    @Test
    void binaryFindCount3() {
        for (int i = 0; i < 100; i++) {
            ArrayList<Integer> initial = JavaLists.generateRandomIntegerList(100, -20, 15);
            int toFind = -100;
            Collections.sort(initial);
            int expected = Collections.frequency(initial, toFind);
            assertEquals(expected, sol.findCount(initial, toFind), errorMessage(initial,toFind,expected));
        }
    }
    @Test
    void binaryFindCount4() {
        for (int i = 0; i < 100; i++) {
            ArrayList<Integer> initial = JavaLists.generateRandomIntegerList(100, -20, 15);
            int toFind = 100;
            Collections.sort(initial);
            int expected = Collections.frequency(initial, toFind);
            assertEquals(expected, sol.findCount(initial, toFind), errorMessage(initial,toFind,expected));
        }
    }

    @Test
    void binarySearchBorder() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 3 3 3 3 3 4]");
        int toFind = 3;
        boolean left = true;
        int expected = 2;

        assertEquals(expected, sol.binarySearchBorder(initial, toFind, left), errorMessage(initial,toFind,expected));
    }

    @Test
    void binarySearchBorder3() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 4]");
        int toFind = 3;
        boolean left = false;
        int expected = -1;

        assertEquals(expected, sol.binarySearchBorder(initial, toFind, left), errorMessage(initial,toFind,expected));
    }
    @Test
    void binarySearchBorder4() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 4]");
        int toFind = 3;
        boolean left = true;
        int expected = -1;

        assertEquals(expected, sol.binarySearchBorder(initial, toFind, left), errorMessage(initial,toFind,expected));
    }

    @Test
    void binarySearchBorder5() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 1 1 1 2 4]");
        int toFind = 1;
        boolean left = true;
        int expected = 0;

        assertEquals(expected, sol.binarySearchBorder(initial, toFind, left), errorMessage(initial,toFind,expected));
    }

    @Test
    void binarySearchBorder5_1() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 1 4]");
        int toFind = 1;
        boolean left = true;
        int expected = 0;

        assertEquals(expected, sol.binarySearchBorder(initial, toFind, left), errorMessage(initial,toFind,expected));
    }

    @Test
    void binarySearchBorder6() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 1 1 1 2 4]");
        int toFind = 1;
        boolean left = false;
        int expected = 3;

        assertEquals(expected, sol.binarySearchBorder(initial, toFind, left), errorMessage(initial,toFind,expected));
    }

    @Test
    void binarySearchBorder7() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[2 1 1 1 1]");
        int toFind = 1;
        boolean left = false;
        int expected = 4;

        assertEquals(expected, sol.binarySearchBorder(initial, toFind, left), errorMessage(initial,toFind,expected));
    }

    @Test
    void binarySearchBorder8() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[]");
        int toFind = 3;
        boolean left = false;
        int expected = -1;

        assertEquals(expected, sol.binarySearchBorder(initial, toFind, left), errorMessage(initial,toFind,expected));
    }

    @Test
    void binarySearchBorder9() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[3]");
        int toFind = 3;
        boolean left = false;
        int expected = 0;

        assertEquals(expected, sol.binarySearchBorder(initial, toFind, left), errorMessage(initial,toFind,expected));
    }


    private String errorMessage(ArrayList<Integer> initial, int toFind, int expected){
        return String.format("Searching: {%d}; Expected: {%d}; in %s", toFind, expected, initial.toString());
    }
}