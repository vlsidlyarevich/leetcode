/**
 * Merge_Two_Sorted_Lists.
 *
 * @author Vladislav Sidlyarevich
 * @since 07.08.2023
 */
class Merge_Two_Sorted_Lists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;

        ListNode result = new ListNode();
        ListNode prev = result;

        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                prev.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                prev.next = new ListNode(list1.val);
                list1 = list1.next;
            }

            prev = prev.next;
        }

        prev.next = list1 == null ? list2 : list1;

        return result.next;
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
