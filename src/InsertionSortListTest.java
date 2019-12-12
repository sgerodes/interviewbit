import challenges.inteviewbit.Parser;
import challenges.inteviewbit.collections.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortListTest {

    InsertionSortList sol = new InsertionSortList();


    @Test
    void insertionSortList() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 3 2 4]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3 4]"));
        ListNode actual  = sol.insertionSortList(initial);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }
    @Test
    void insertionSortList2() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[4 3 2 1]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3 4]"));
        ListNode actual  = sol.insertionSortList(initial);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }
    @Test
    void insertionSortList3() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[3 2 5 4 7]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[2 3 4 5 7]"));
        ListNode actual  = sol.insertionSortList(initial);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }
    @Test
    void insertionSortList4() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[2 1 2 3 1 3 2]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 1 2 2 2 3 3]"));
        ListNode actual  = sol.insertionSortList(initial);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }
    @Test
    void insertionSortListCornerCase1() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1]"));
        ListNode actual  = sol.insertionSortList(initial);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }
    @Test
    void insertionSortListCornerCase2() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[]"));
        ListNode actual  = sol.insertionSortList(initial);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }
    @Test
    void insertionSortListCornerCase3() {
        ListNode initial = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3]"));
        ListNode actual  = sol.insertionSortList(initial);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }
    @Test
    void insertionSortListCornerCase4() {
        ListNode initial  = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[2 1]"));
        ListNode expected = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2]"));
        ListNode actual  = sol.insertionSortList(initial);
        assertTrue(ListNode.equals(expected, actual), errorMessage(expected, actual));
    }


    @Test
    void swapAdjacentNodes() {
        ListNode list1 = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3 4]"));
        ListNode list2 = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 3 2 4]"));
        InsertionSortList.swapAdjacentNodesAfter(list1);
        assertTrue(ListNode.equals(list1, list2));
    }
    @Test
    void swapAdjacentNodes2() {
        ListNode list1 = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3]"));
        ListNode list2 = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 3 2]"));
        InsertionSortList.swapAdjacentNodesAfter(list1);
        assertTrue(ListNode.equals(list1, list2));
    }
    @Test
    void swapAdjacentNodes3() {
        ListNode list1 = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2]"));
        ListNode list2 = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2]"));
        InsertionSortList.swapAdjacentNodesAfter(list1);
        assertTrue(ListNode.equals(list1, list2));
    }
    @Test
    void swapAdjacentNodes4() {
        ListNode list1 = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1]"));
        ListNode list2 = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1]"));
        InsertionSortList.swapAdjacentNodesAfter(list1);
        assertTrue(ListNode.equals(list1, list2));
    }
    @Test
    void swapAdjacentNodes5() {
        ListNode list1 = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[1 2 3]"));
        ListNode list2 = ListNode.fromList(Parser.fromStringWithSpaceSeparatedToList("[2 1 3]"));
        ListNode tmpHead = new ListNode(Integer.MIN_VALUE);
        tmpHead.next = list1;
        list1 = InsertionSortList.swapAdjacentNodesAfter(tmpHead).next;
        assertTrue(ListNode.equals(list1, list2), errorMessage(list2, list1));
    }

    private String errorMessage(ListNode expected, ListNode actual){
        return String.format("\nexpected: %s\nactual: %s", expected != null ? expected.repr() : "null", actual != null ? actual.repr() : "null");
    }
}