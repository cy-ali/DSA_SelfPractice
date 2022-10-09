package questions;

import java.util.HashSet;
public class IntersectionsOfLinkedLists {
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> listSet = new HashSet<>();
        ListNode a = headA;
        ListNode b = headB;
        while (a != null) {
            listSet.add(a);
            a = a.next;
        }

        while (b !=null){
            if (listSet.contains(b))  return b;
            b = b.next;
        }

        return null;
    }

}
