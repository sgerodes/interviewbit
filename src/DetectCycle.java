import challenges.inteviewbit.collections.ListNode;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle {

    public ListNode detectCycle(ListNode a) {
        Set<ListNode> nodes = new HashSet<>();
        while (a != null){
            if (nodes.contains(a)) return a;
            nodes.add(a);
            a = a.next;
        }
        return null;
    }

}
