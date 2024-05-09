package removeDuplicatesFromSortedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.ListNode;

public class SolutionTest {

    @Test
    public void test(){
        ListNode head = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3)))));
        ListNode expected = new ListNode(1,new ListNode(2,new ListNode(3)));


        Assertions.assertEquals(expected,Solution.deleteDuplicates(head));

    }
}
