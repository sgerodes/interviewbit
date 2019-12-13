package challenges.inteviewbit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JavaListsTest {

    @Test
    void listIntersection() {
        ArrayList<Integer> A = JavaLists.fromStringWithSpaceSeparatedToList("1 2 3 4");
        ArrayList<Integer> B = JavaLists.fromStringWithSpaceSeparatedToList("1 2");
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("1 2");

        assertIterableEquals(expected, JavaLists.listIntersection(A, B));
    }

    @Test
    void listIntersection2() {
        ArrayList<Integer> A = JavaLists.fromStringWithSpaceSeparatedToList("1 2 3 4");
        ArrayList<Integer> B = JavaLists.fromStringWithSpaceSeparatedToList("");
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("");

        assertIterableEquals(expected, JavaLists.listIntersection(A, B));
    }

    @Test
    void listIntersection3() {
        ArrayList<Integer> A = JavaLists.fromStringWithSpaceSeparatedToList("1 2 3 4");
        ArrayList<Integer> B = JavaLists.fromStringWithSpaceSeparatedToList("5 6 7");
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("");

        assertIterableEquals(expected, JavaLists.listIntersection(A, B));
    }

    @Test
    void listIntersection4() {
        ArrayList<Integer> A = JavaLists.fromStringWithSpaceSeparatedToList("1 2 3 4");
        ArrayList<Integer> B = JavaLists.fromStringWithSpaceSeparatedToList("3 4 5 6 7");
        ArrayList<Integer> expected = JavaLists.fromStringWithSpaceSeparatedToList("3 4");

        assertIterableEquals(expected, JavaLists.listIntersection(A, B));
    }
}