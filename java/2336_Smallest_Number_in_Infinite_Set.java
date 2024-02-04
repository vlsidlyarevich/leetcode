import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * Smallest_Number_in_Infinite_Set.
 *
 * @author Vladislav Sidlyarevich
 * @since 21.01.2024
 */
class Smallest_Number_in_Infinite_Set {

    class SmallestInfiniteSet {

        private PriorityQueue<Integer> queue;
        private HashSet<Integer> added;
        private Integer current;

        public SmallestInfiniteSet() {
            this.queue = new PriorityQueue<>();
            this.added = new HashSet<>();
            this.current = 1;
        }

        public int popSmallest() {
            int result;
            if (!queue.isEmpty()) {
                result = queue.remove();
                added.remove(result);
            } else {
                result = current;
                current++;
            }
            return result;
        }

        public void addBack(int num) {
            if (num >= current) return;
            if (added.contains(num)) return;
            queue.add(num);
            added.add(num);
        }
    }
}
