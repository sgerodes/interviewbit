import challenges.inteviewbit.collections.ListNode;

public class ReverseList {

    public ListNode reverseListrec(ListNode A) {
        if (A == null || A.next == null) return A;
        return reverseListrec(null, A);
    }

    public ListNode reverseListrec(ListNode prev, ListNode A) {
        if (A.next == null){
            A.next = prev;
            return A;
        }
        ListNode B = A.next;
        A.next = prev;
        return reverseListrec(A, B);
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
