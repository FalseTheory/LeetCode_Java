package reverseLinkedList;

import util.ListNode;
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    public ListNode reverse(ListNode curr, ListNode prev){
        if(curr==null){
            return prev;
        }
        ListNode next = curr.next;
        curr.next = prev;
        return reverse(next, curr);

    }
}
