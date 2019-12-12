package challengeTester.interviewBit;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public boolean hasEqualValue(ListNode that){
        return this.val == that.val;
    }

}