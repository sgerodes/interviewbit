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

    public static boolean equals(ListNode ptr1, ListNode ptr2) {
        while (ptr1 != null && ptr2 != null) {
            if (!ptr1.equals(ptr2)) return false;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1 == null && ptr2 == null;
    }

    public static ListNode detectCycle(ListNode A) {
        Set<ListNode> nodes = new HashSet<>();
        while (A != null) {
            if (nodes.contains(A)) return A;
            nodes.add(A);
            A = A.next;
        }
        return null;
    }

    static public ListNode fromList(List<Integer> lst) {
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

    public static ListNode swapAdjacentNodesAfter(ListNode parent) {
        if (parent == null || parent.next == null || parent.next.next == null) return parent;
        ListNode A = parent.next;
        parent.next = A.next;
        A.next = parent.next.next;
        parent.next.next = A;
        return parent;
    }

    public static ListNode sortList(ListNode A) {
        return divideInHalfMergeSort(A);
    }

    public static ListNode divideInHalfMergeSort(ListNode A) {
        return divideInHalfMergeSort(A, length(A));
    }

    private static ListNode divideInHalfMergeSort(ListNode A, int len) {
        if (A == null || A.next == null) return A;
        int half = len / 2;
        ListNode preB = A;
        ListNode B;
        for (int i = 1; i < half; ++i) {
            preB = preB.next;
        }
        B = preB.next;
        preB.next = null;

        A = divideInHalfMergeSort(A, half);
        B = divideInHalfMergeSort(B, len - half);
        ListNode preHead = new ListNode(Integer.MIN_VALUE);
        ListNode curr = preHead;
        while (A != null && B != null) {
            if (A.val < B.val) {
                curr.next = A;
                A = A.next;
            } else {
                curr.next = B;
                B = B.next;
            }
            curr = curr.next;
        }
        curr.next = A != null ? A : B;
        return preHead.next;
    }

    public static ListNode insertionSortList(ListNode A) {
        if (A == null || A.next == null) return A;
        ListNode preHead = new ListNode(Integer.MIN_VALUE);
        preHead.next = A;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            ListNode parent = preHead;
            while (parent.next != null && parent.next.next != null) {
                if (parent.next.val > parent.next.next.val) {
                    isSorted = false;
                    ListNode.swapAdjacentNodesAfter(parent);
                }
                parent = parent.next;
            }
        }
        return preHead.next;
    }
    public static ListNode rotateRight(ListNode head, int shift) {
        if (head == null || head.next == null || shift == 0) return head;
        int len = length(head);
        shift = shift % len;
        if (shift == 0) return head;

        ListNode Bparent = head;
        for (int i = 1; i < len - shift; i++) {
            Bparent = Bparent.next;
        }
        ListNode last = Bparent;
        while (last.next != null){
            last = last.next;
        }

        last.next = head;
        head = Bparent.next;
        Bparent.next = null;

        return head;
    }

    public static int length(ListNode A) {
        int l = 0;
        while (A != null) {
            A = A.next;
            l++;
        }
        return l;
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
            ListNode startOfTheCycle = ListNode.detectCycle(A);
            if (startOfTheCycle != null) {
                throw new LoopedLikedListException("List is Looped at node with val" + startOfTheCycle.val);
            }
            stringBuilder.append(A.val);
            stringBuilder.append(" -> ");
            A = A.next;
        }
        stringBuilder.append("null");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}