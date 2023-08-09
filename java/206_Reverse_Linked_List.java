/**
 * Reverse_Linked_List.
 *
 * @author Vladislav Sidlyarevich
 * @since 09.08.2023
 */
class Reverse_Linked_List {

    public ListNode reverseList(ListNode head) {
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
