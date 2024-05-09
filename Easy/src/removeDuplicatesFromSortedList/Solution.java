package removeDuplicatesFromSortedList;

import util.ListNode;

public class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode pointer = head;
        while(pointer!=null && pointer.next!=null){
            if(pointer.next.val==pointer.val){
                pointer.next = pointer.next.next;
                continue;
            }
            pointer=pointer.next;
        }
        return head;
    }
}
