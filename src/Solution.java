/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {

    }

    public int ListLen(ListNode A){
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
