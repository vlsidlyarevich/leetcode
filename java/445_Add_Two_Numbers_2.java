/**
 * Add_Two_Numbers.
 *
 * @author Vladislav Sidlyarevich
 * @since 10.08.2023
 */
class Add_Two_Numbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l1Current = revertNode(l1);
        ListNode l2Current = revertNode(l2);

        ListNode result = new ListNode();
        ListNode resultCurrent = result;

        boolean accumulator = false;

        while (l1Current != null || l2Current != null) {
            int sum = (l1Current != null ? l1Current.val : 0)
                + (l2Current != null ? l2Current.val : 0);

            if (accumulator) {
                sum++;
                accumulator = false;
            }
            if (sum >= 10) {
                accumulator = true;
                sum = sum - 10;
            }

            resultCurrent.next = new ListNode(sum);
            resultCurrent = resultCurrent.next;

            l1Current = l1Current != null ? l1Current.next : null;
            l2Current = l2Current != null ? l2Current.next : null;
        }

        if (accumulator) {
            resultCurrent.next = new ListNode(1);
        }

        return revertNode(result.next);
    }
    
    private ListNode revertNode(ListNode head) {
        if (head == null) return null;

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;

            current.next = prev;
            prev = current;

            current = next;
        }

        return prev;
    }

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
}
