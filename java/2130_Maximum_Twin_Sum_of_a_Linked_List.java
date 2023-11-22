/**
 * Maximum_Twin_Sum_of_a_Linked_List.
 *
 * @author Vladislav Sidlyarevich
 * @since 21.11.2023
 */
class Maximum_Twin_Sum_of_a_Linked_List {

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int pairSum(ListNode head) {
        var middle = head;
        int max = 0;

        var fast = head;
        while (fast != null && fast.next != null) {
            middle = middle.next;
            fast = fast.next.next;
        }

        var slowMiddle = middle;
        ListNode nextNode, prev = null;
        while (slowMiddle != null) {
            nextNode = slowMiddle.next;
            slowMiddle.next = prev;
            prev = slowMiddle;
            slowMiddle = nextNode;
        }

        while (prev != null) {
            if (head.val + prev.val > max) max = head.val + prev.val;

            prev = prev.next;
            head = head.next;
        }

        return max;
    }
}
