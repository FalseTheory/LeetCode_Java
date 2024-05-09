package deleteNodeInLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.ListNode;

public class SolutionTest {

    @Test
    public void test(){
        ListNode base = new ListNode(4,new ListNode(5,new ListNode(1,new ListNode(9))));
        ListNode deletedNode = base.next;
        ListNode expected = new ListNode(4,new ListNode(1,new ListNode(9)));
        Solution.deleteNode(deletedNode);
        Assertions.assertEquals(expected,base);
    }
}
