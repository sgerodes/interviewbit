import challenges.inteviewbit.collections.LinkedList;
import challenges.inteviewbit.collections.ListNode;
import challenges.inteviewbit.Parser;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReverseBetweenTest {

    ReverseBetween sol = new ReverseBetween();


    @Test
    void reverseBetweenCase1() {

        String listRepr = "[1, 2, 3]";
        String listRepr1 = "[1, 3, 2]";
        int B = 2;
        int C = 3;

        ListNode actual = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr));
        ListNode expected = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr1));
        String failedString = failedString(expected, actual, B, C);

        assertTrueForList(expected,actual,B, C, failedString);
    }

    @Test
    void reverseBetween() {

        ArrayList<Integer> integers = Parser.fromStringWithCommaSeparatedToList("[1, 2, 3, 4, 5]");
        ListNode head = LinkedListFactory.fromList(integers);
        ArrayList<Integer> shouldIntegers = Parser.fromStringWithCommaSeparatedToList("[1, 4, 3, 2, 5]");
        ListNode should = LinkedListFactory.fromList(shouldIntegers);

        assertTrue(LinkedList.equals(should, sol.reverseBetween(head,2,4)),
                String.format("Expected %s, actual %s", LinkedList.repr(should), LinkedList.repr(head)));
    }

    @Test
    void reverseBetween2() {

        String listRepr = "[1, 2, 3, 4]";
        String listRepr1 = "[1, 4, 3, 2]";
        int B = 2;
        int C = 4;

        ListNode actual = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr));
        ListNode expected = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr1));
        String failedString = failedString(expected, actual, B, C);

        assertTrueForList(expected,actual,B, C, failedString);
    }

    @Test
    void reverseBetween3() {

        String listRepr = "[1, 2, 3]";
        String listRepr1 = "[1, 3, 2]";
        int B = 2;
        int C = 4;

        ListNode actual = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr));
        ListNode expected = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr1));
        String failedString = failedString(expected, actual, B, C);

        assertTrueForList(expected,actual,B, C, failedString);
    }
    @Test
    void reverseBetween4() {

        String listRepr = "[1, 2]";
        String listRepr1 = "[1, 2]";
        int B = 2;
        int C = 4;

        ListNode actual = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr));
        ListNode expected = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr1));
        String failedString = failedString(expected, actual, B, C);

        assertTrueForList(expected,actual,B, C, failedString);
    }
    @Test
    void reverseBetween5() {

        ArrayList<Integer> integers = Parser.fromStringWithCommaSeparatedToList("[1]");
        ListNode head = LinkedListFactory.fromList(integers);
        ArrayList<Integer> shouldIntegers = Parser.fromStringWithCommaSeparatedToList("[1]");
        ListNode should = LinkedListFactory.fromList(shouldIntegers);

        assertTrue(LinkedList.equals(should, sol.reverseBetween(head,2,4)),
                String.format("Expected %s, actual %s", LinkedList.repr(should), LinkedList.repr(head)));
    }
    @Test
    void reverseBetween6() {

        ArrayList<Integer> integers = Parser.fromStringWithCommaSeparatedToList("[]");
        ListNode head = LinkedListFactory.fromList(integers);
        ArrayList<Integer> shouldIntegers = Parser.fromStringWithCommaSeparatedToList("[]");
        ListNode should = LinkedListFactory.fromList(shouldIntegers);

        assertTrue(LinkedList.equals(should, sol.reverseBetween(head,2,4)),
                String.format("Expected %s, actual %s", LinkedList.repr(should), LinkedList.repr(head)));
    }

    @Test
    void reverseBetween7() {

        String listRepr = "[1, 2, 3, 4, 5]";
        String listRepr1 = "[5, 4, 3, 2, 1]";
        int B = 0;
        int C = 10;

        ListNode actual = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr));
        ListNode expected = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr1));
        String failedString = failedString(expected, actual, B, C);

        assertTrueForList(expected,actual,B, C, failedString);
    }
    @Test
    void reverseBetween8() {
        String listRepr = "[1, 2, 3, 4, 5]";
        String listRepr1 = "[3, 2, 1, 4, 5]";
        int B = 0;
        int C = 3;

        ListNode actual = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr));
        ListNode expected = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr1));
        String failedString = failedString(expected, actual, B, C);

        assertTrueForList(expected,actual,B, C, failedString);
    }
    @Test
    void reverseBetween9() {
        String listRepr = "[1, 2, 3, 4, 5]";
        String listRepr1 = "[5, 4, 3, 2, 1]";
        int B = -500;
        int C = 500;

        ListNode actual = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr));
        ListNode expected = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr1));
        String failedString = failedString(expected, actual, B, C);

        assertTrueForList(expected,actual,B, C, failedString);
    }

    @Test
    void reverseBetween10() {
        String listRepr = "[1, 2, 3]";
        String listRepr1 = "[1, 2, 3]";
        int B = 500;
        int C = -500;

        ListNode actual = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr));
        ListNode expected = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr1));
        String failedString = failedString(expected, actual, B, C);

        assertTrueForList(expected,actual,B, C, failedString);
    }

    @Test
    void reverseBetween11() {
        String listRepr = "[1, 2, 3]";
        String listRepr1 = "[1, 2, 3]";
        int B = 2;
        int C = 2;

        ListNode actual = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr));
        ListNode expected = LinkedListFactory.fromList(Parser.fromStringWithCommaSeparatedToList(listRepr1));
        String failedString = failedString(expected, actual, B, C);

        assertTrueForList(expected,actual,B, C, failedString);
    }

    private void  assertTrueForList(ListNode expected, ListNode actual, int B, int C, String failedString){
        assertTrue(LinkedList.equals(expected, sol.reverseBetween(actual,B,C)),
                String.format("%s\nactual\t\t%s\n", failedString, LinkedList.repr(actual)));
    }

    private String failedString(ListNode expected, ListNode initial, int B, int C){
        return String.format("\nexpected\t%s\ninitial\t\t%s with B=%d, C=%d;", LinkedList.repr(expected), LinkedList.repr(initial), B, C);
    }
}