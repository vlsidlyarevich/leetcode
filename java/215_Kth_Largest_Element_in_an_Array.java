import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Kth_Largest_Element_in_an_Array.
 *
 * @author Vladislav Sidlyarevich
 * @since 19.01.2024
 */
class Kth_Largest_Element_in_an_Array {

    public int findKthLargest(int[] nums, int k) {
        var heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int num : nums) {
            heap.add(num);
        }
        while (k-- != 1) {
            heap.remove();
        }
        return heap.remove();
    }
}
