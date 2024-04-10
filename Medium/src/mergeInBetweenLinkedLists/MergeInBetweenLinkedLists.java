package mergeInBetweenLinkedLists;


import util.ListNode;

public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        ListNode start = null;
        ListNode end = null;
        int length = 1;
        while (list1 != null) {
            if (length == a) {
                start = list1;
            }
            if (length == b + 1) {

                end = list1;
                break;
            }
            length++;
            list1 = list1.next;
        }
        ListNode tmp2 = list2;
        while (tmp2.next != null) {
            tmp2 = tmp2.next;
        }
        start.next = list2;
        tmp2.next = end.next;

        return head;
    }
}
