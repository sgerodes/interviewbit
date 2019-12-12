package challengeTester.interviewBit;

import java.util.HashSet;
import java.util.Set;

public class IBLinkedList {

    ListNode head;

    public IBLinkedList(ListNode head) {
        this.head = head;
    }

    public static String repr(ListNode A) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        while (A != null) {
            if (IBLinkedList.isLooped(A)) {
                throw new ListLoopedException("List is Looped");
            }
            stringBuilder.append(A.val);
            stringBuilder.append(" -> ");
            A = A.next;
        }
        stringBuilder.append("null");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static boolean hasSameValues(ListNode ptr1, ListNode ptr2){
        while (ptr1 != null && ptr2 != null){
            if (!ptr1.hasEqualValue(ptr2)) return false;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if (ptr1 == null && ptr2 == null){
            return true;
        }
        return false;
    }

    public static boolean isLooped(ListNode A){
        ListNode ptr = A;
        Set<ListNode> nodes = new HashSet<>();
        while (ptr != null){
            if (nodes.contains(ptr)) return true;
            nodes.add(ptr);
            ptr = ptr.next;
        }
        return false;
    }

}
