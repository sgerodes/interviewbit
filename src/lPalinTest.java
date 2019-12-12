import challengeTester.interviewBit.LinkedListFactory;
import challengeTester.interviewBit.ListNode;
import challengeTester.interviewBit.Parser;
import challengeTester.interviewBit.RandomListFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class lPalinTest {

    lPalin sol = new lPalin();
    Random random = new Random();

    @Test
    void listLen() {
        ArrayList<Integer> integers = Parser.fromStringWithCommaSeparatedToList("[3, 5, 4, 2]");
        ListNode listNode = LinkedListFactory.fromList(integers);
        assertEquals(integers.size(), sol.listlen(listNode));

        for (int i = 0; i < 10; i++) {
            integers = RandomListFactory.generateRandomIntegerList(random.nextInt(10), -5,10);
            listNode = LinkedListFactory.fromList(integers);
            assertEquals(integers.size(), sol.listlen(listNode));
        }
    }

    @Test
    void lPalinPositive() {
        String[] arrays = new String[]{"[]", "[1]", "[3, 5, 5, 3]", "[3, 5, 7, 5, 3]", "[1, 2, 2, 1]", "[1, 2, 4, 5, 4, 2, 1]"};
        for (String elem: arrays) {
            ArrayList<Integer> integers = Parser.fromStringWithCommaSeparatedToList(elem);
            ListNode head = LinkedListFactory.fromList(integers);
            assertEquals(1, sol.lPalin(head), String.format("%s should be a Palindrome", integers.toString()));
        }

    }

    @Test
    void lPalinNeagtive() {
        String[] arrays = new String[]{ "[1, 2, 3, 4]", "[1, 2, 3]", "[1, 2]", "[22, 22, 3]"};
        for (String elem: arrays) {
            ArrayList<Integer> integers = Parser.fromStringWithCommaSeparatedToList(elem);
            ListNode head = LinkedListFactory.fromList(integers);
            assertEquals(0, sol.lPalin(head), String.format("%s should NOT be a Palindrome", integers.toString()));
        }

    }
}