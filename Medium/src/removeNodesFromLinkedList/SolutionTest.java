package removeNodesFromLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.ListNode;

public class SolutionTest {

    @Test
    public void test1(){
        ListNode head = new ListNode(5,new ListNode(2,new ListNode(13,new ListNode(3,new ListNode(8)))));
        ListNode expected = new ListNode(13,new ListNode(8));

        Assertions.assertEquals(Solution.removeNodes(head),expected);
    }
}
