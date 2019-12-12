package challenges.inteviewbit.collections;

import challenges.inteviewbit.exceptions.LoopedLikedListException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public boolean equals(Object that) {
        if (!(that instanceof ListNode)) return false;
        return this.val == ((ListNode) that).val;
    }

    public String repr() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        ListNode A = this;
        while (A != null) {
            if (ListNode.isLooped(A)) {
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

    public static ListNode swapAdjacentNodesAfter(ListNode parent){
        if (parent == null || parent.next == null || parent.next.next == null) return parent;
        ListNode A = parent.next;
        parent.next = A.next;
        A.next = parent.next.next;
        parent.next.next = A;
        return parent;
    }

    public static ListNode insertionSortList(ListNode A) {
        if (A == null || A.next == null) return A;
        ListNode preHead = new ListNode(Integer.MIN_VALUE);
        preHead.next = A;
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            ListNode parent = preHead;
            while (parent.next != null && parent.next.next != null){
                if (parent.next.val > parent.next.next.val){
                    isSorted = false;
                    ListNode.swapAdjacentNodesAfter(parent);
                }
                parent = parent.next;
            }
        }
        return preHead.next;
    }

    public static int length(ListNode A){
        int l = 0;
        while (A != null) {
            A = A.next;
            l++;
        }
        return l;
    }

}