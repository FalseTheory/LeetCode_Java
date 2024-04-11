package palindromeLinkedList;

import util.ListNode;
import java.util.Stack;
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode start = head;
        int length = 0;
        while(start!=null){
            length++;
            start=start.next;
        }
        Stack<Integer> half = new Stack<>();
        start = head;
        for(int i = 0; i<length/2;i++){
            half.push(start.val);
            start=start.next;

        }
        if(length%2!=0){
            half.push(start.val);
        }
        while(start!=null){
            if(half.pop()!=start.val){
                return false;
            }
            start = start.next;
        }
        return true;

    }
}
