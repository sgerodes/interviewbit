package challenges.inteviebit.collections;

import challenges.inteviebit.exceptions.LoopedLikedListException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedList {

    public static String repr(ListNode A) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        while (A != null) {
            if (LinkedList.isLooped(A)) {
                throw new LoopedLikedListException("List is Looped");
            }
            stringBuilder.append(A.val);
            stringBuilder.append(" -> ");
            A = A.next;
        }
        stringBuilder.append("null");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static boolean equals(ListNode ptr1, ListNode ptr2){
        while (ptr1 != null && ptr2 != null){
            if (!ptr1.equals(ptr2)) return false;
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
