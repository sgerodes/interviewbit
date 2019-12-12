import challenges.inteviewbit.collections.ListNode;

public class RotateListRight {
    public ListNode rotateRight(ListNode head, int shift) {
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
}
