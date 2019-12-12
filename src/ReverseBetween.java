import challengeTester.interviewBit.ListNode;



public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int B, int C) {
        B = Math.max(1, B);
        C = Math.max(C, B);
        ListNode beforeReverseStart = head;
        int diff = C - B;
        if (diff < 1) return head;
        if (B < 1) beforeReverseStart = null;
        else {
            while (B > 2){
                if (beforeReverseStart == null) return head;
                beforeReverseStart = beforeReverseStart.next;
                B--;
            }
        }
        if (beforeReverseStart == null || beforeReverseStart.next == null) return head;
        if (B == 1){
            head = reverseList(beforeReverseStart, diff);
        }else {
            beforeReverseStart.next = reverseList(beforeReverseStart.next, diff);
        }
        return head;
    }

    public ListNode reverseList(ListNode tail, int len) {
        ListNode prev = null;
        ListNode head = tail;
        ListNode next = head.next;
        if (next == null) return head;
        while(len >= 0){
            if (next == null) break;
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            --len;
        }
        tail.next = next;
        return prev;
    }

}
