package deleteNodeInLinkedList;

import util.ListNode;

public class Solution {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;


    }
}
