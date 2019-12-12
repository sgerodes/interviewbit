import challenges.inteviebit.collections.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class lPalin {
    public int lPalin(ListNode A) {
        int len = listlen(A);
        if (len == 0) return 1;
        int half = len / 2;
        ListNode node = A;
        for (int i = 0; i < half - 1; i++) {
            node = node.next;
        }
        ListNode tail = reverseList(node.next);
        node.next = null;

        for (int i = 0; i < half; i++) {
            if (A.val != tail.val) return 0;
            A = A.next;
            tail = tail.next;
        }
        return 1;
    }

    public int listlen(ListNode A){
        int l = 0;
        while (A != null) {
            A = A.next;
            l++;
        }
        return l;
    }

    public ListNode reverseList(ListNode A) {
        if (A == null || A.next == null) return A;
        ListNode prev = null;
        ListNode B = A.next;
        while (A.next != null){
            A.next = prev;
            prev = A;
            A = B;
            B = B.next;
        }
        A.next = prev;
        return A;
    }
}
