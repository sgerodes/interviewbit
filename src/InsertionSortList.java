import challenges.inteviewbit.collections.ListNode;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode A) {
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
                    swapAdjacentNodesAfter(parent);
                }
                parent = parent.next;
            }
        }
        return preHead.next;
    }

    static ListNode swapAdjacentNodesAfter(ListNode parent){
        if (parent == null || parent.next == null || parent.next.next == null) return parent;
        ListNode A = parent.next;
        parent.next = A.next;
        A.next = parent.next.next;
        parent.next.next = A;
        return parent;
    }

}
