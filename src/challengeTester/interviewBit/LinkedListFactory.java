package challengeTester.interviewBit;

import java.util.List;

public class LinkedListFactory {

    static public ListNode fromList(List<Integer> lst){
        if (lst.isEmpty()) return null;
        ListNode head = new ListNode(lst.get(0));
        ListNode prev = head;
        for (int i = 1; i < lst.size(); i++) {
            ListNode listNode = new ListNode(lst.get(i));
            prev.next = listNode;
            prev = listNode;
        }
        return head;
    }
}
