import challenges.inteviewbit.collections.ListNode;

public class MergeSortList {

    public ListNode sortList(ListNode A) {
        return divideInHalfMergeSort(A);
    }

    private ListNode divideInHalfMergeSort(ListNode A) {
        return divideInHalfMergeSort(A, length(A));
    }

    private ListNode divideInHalfMergeSort(ListNode A, int len) {
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

    public ListNode chopOneElementMergeSort(ListNode A) {
        if (A == null || A.next == null) return A;

        ListNode B = A.next;
        A.next = null;
        B = chopOneElementMergeSort(B);

        ListNode preHead = new ListNode(Integer.MIN_VALUE);
        ListNode curr = preHead;

        while (A != null && B != null) {
            if (A.val < B.val) {
                curr.next = A;
                A = A.next;
                curr = curr.next;
            } else {
                curr.next = B;
                B = B.next;
                curr = curr.next;
            }
        }
        curr.next = A != null ? A : B;
        return preHead.next;
    }

    public static int length(ListNode A) {
        int l = 0;
        while (A != null) {
            A = A.next;
            l++;
        }
        return l;
    }
}
