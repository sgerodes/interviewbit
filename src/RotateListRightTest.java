import challenges.inteviewbit.Parser;
import challenges.inteviewbit.collections.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RotateListRightTest {

    RotateListRight sol = new RotateListRight();

    @Test
    void rotateRight() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3 4]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[3 4 1 2]"));
        int B = 2;
        ListNode actual = sol.rotateRight(initial, B);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }

    @Test
    void rotateRight2() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3 4]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[2 3 4 1]"));
        int B = 3;
        ListNode actual = sol.rotateRight(initial, B);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }

    @Test
    void rotateRight3() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3 4]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3 4]"));
        int B = 4;
        ListNode actual = sol.rotateRight(initial, B);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }

    @Test
    void rotateRight4() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[2 1]"));
        int B = 1;
        ListNode actual = sol.rotateRight(initial, B);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }


    // Corner cases

    @Test
    void rotateRightcornerCases1() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[]"));
        int B = 4;
        ListNode actual = sol.rotateRight(initial, B);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }

    @Test
    void rotateRightcornerCases2() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1]"));
        int B = 4;
        ListNode actual = sol.rotateRight(initial, B);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }

    @Test
    void rotateRightcornerCases3() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3]"));
        int B = 0;
        ListNode actual = sol.rotateRight(initial, B);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }

    @Test
    void rotateRightcornerCases4() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3]"));
        int B = 300;
        ListNode actual = sol.rotateRight(initial, B);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }


    private String errorMessage(ListNode expected, ListNode actual) {
        return String.format("\nexpected: %s\nactual: %s", expected != null ? expected.repr() : "null", actual != null ? actual.repr() : "null");
    }
}