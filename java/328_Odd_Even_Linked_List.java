/**
 * Odd_Even_Linked_List.
 *
 * @author Vladislav Sidlyarevich
 * @since 18.11.2023
 */
class Odd_Even_Linked_List {

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

    public ListNode oddEvenList(ListNode head) {

        ListNode even = null;
        ListNode evenHead = null;
        ListNode curr = head;

        while (curr.next != null) {
            if (evenHead == null) {
                evenHead = curr.next;
                even = evenHead;
            } else {
                even.next = curr.next;
                even = even.next;
            }

            curr.next = curr.next.next;
            curr = curr.next;
        }

        curr.next = evenHead;

        return head;
    }
}
