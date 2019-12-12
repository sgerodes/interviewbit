import challenges.inteviewbit.collections.ListNode;

public class MergeSortList {

    public ListNode sortList(ListNode A) {
        if (A == null || A.next == null) return A;
        ListNode preHead = new ListNode(Integer.MIN_VALUE);
        preHead.next = A;
        int len = length(A);



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
