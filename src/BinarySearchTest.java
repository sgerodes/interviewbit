import challenges.inteviewbit.JavaLists;
import challenges.inteviewbit.binarysearch.BinarySearch;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch<Integer> sol = new BinarySearch<>();

    @Test
    void binarySearchObject() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 3 4]");
        int toFind = 3;
        int atIndex = initial.indexOf(toFind);

        assertEquals(atIndex, sol.binarySearchIndexOfInteger(initial, toFind), errorMessage(initial,toFind,atIndex));
    }
    @Test
    void binarySearchObject2() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 3 4 5 6 10 15 18 100 500 501]");
        int toFind = 501;
        int atIndex = initial.indexOf(toFind);

        assertEquals(atIndex, sol.binarySearchIndexOfInteger(initial, toFind), errorMessage(initial,toFind,atIndex));
    }
    @Test
    void binarySearchObject3() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 3 4]");
        int toFind = 1;
        int atIndex = initial.indexOf(toFind);

        assertEquals(atIndex, sol.binarySearchIndexOfInteger(initial, toFind), errorMessage(initial,toFind,atIndex));
    }

    @Test
    void binarySearchObject4() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 3 4]");
        int toFind = 100;
        int atIndex = initial.indexOf(toFind);

        assertEquals(atIndex, sol.binarySearchIndexOfInteger(initial, toFind), errorMessage(initial,toFind,atIndex));
    }

    @Test
    void binarySearchObject5() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 3 4]");
        int toFind = -1;
        int atIndex = initial.indexOf(toFind);

        assertEquals(atIndex, sol.binarySearchIndexOfInteger(initial, toFind), errorMessage(initial,toFind,atIndex));
    }

    @Test
    void binarySearchObject6() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 3 4 5]");
        int toFind = 4;
        int atIndex = initial.indexOf(toFind);

        assertEquals(atIndex, sol.binarySearchIndexOfInteger(initial, toFind), errorMessage(initial,toFind,atIndex));
    }

    @Test
    void binarySearchObject7() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 3 4 5]");
        int toFind = 5;
        int atIndex = initial.indexOf(toFind);

        assertEquals(atIndex, sol.binarySearchIndexOfInteger(initial, toFind), errorMessage(initial,toFind,atIndex));
    }

    @Test
    void binarySearchObject8() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1 2 3 4 5]");
        int toFind = 1;
        int atIndex = initial.indexOf(toFind);

        assertEquals(atIndex, sol.binarySearchIndexOfInteger(initial, toFind), errorMessage(initial,toFind,atIndex));
    }


    // Corner cases

    @Test
    void binarySearchObjectCornerCases() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[1]");
        int toFind = 1;
        int atIndex = initial.indexOf(toFind);

        assertEquals(atIndex, sol.binarySearchIndexOfInteger(initial, toFind), errorMessage(initial,toFind,atIndex));
    }
    @Test
    void binarySearchObjectCornerCases2() {
        ArrayList<Integer> initial = JavaLists.fromStringWithSpaceSeparatedToList("[]");
        int toFind = 1;
        int atIndex = initial.indexOf(toFind);

        assertEquals(atIndex, sol.binarySearchIndexOfInteger(initial, toFind), errorMessage(initial,toFind,atIndex));
    }


    private String errorMessage(ArrayList<Integer> initial, int toFind, int atIndex){
        return String.format("Expected to find {%d} at index {%d} in %s",toFind, atIndex, initial.toString());
    }
}