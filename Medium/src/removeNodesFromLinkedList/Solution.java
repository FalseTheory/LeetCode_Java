package removeNodesFromLinkedList;

import util.ListNode;

import java.util.Stack;

public class Solution {

    public static ListNode removeNodes(ListNode head) {
        head = reverse(head,null);
        ListNode p = head;
        Stack<ListNode> stack = new Stack<>();
        int maxValue = 0;
        while(p!=null){
            if(p.val>=maxValue){
                maxValue = p.val;
                stack.push(p);
            }
            p = p.next;
        }
        head = stack.pop();
        p = head;
        while(!stack.empty()){
            p.next = stack.pop();
            p = p.next;
        }
        p.next = null;
        return head;
    }

    public static ListNode reverse(ListNode curr, ListNode prev){
        if(curr==null){
            return prev;
        }
        ListNode next = curr.next;
        curr.next = prev;
        return reverse(next, curr);

    }
}
