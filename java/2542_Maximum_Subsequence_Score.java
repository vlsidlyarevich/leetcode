import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Maximum_Subsequence_Score.
 *
 * @author Vladislav Sidlyarevich
 * @since 03.02.2024
 */
class Maximum_Subsequence_Score {

    public long maxScore(int[] nums1, int[] nums2, int k) {

        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            pairs.add(new Pair(nums1[i], nums2[i]));
        }

        pairs.sort(Comparator.comparingInt(p -> ((Pair) p).right).reversed());

        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        long max = 0;
        long curMax = 0;

        for (Pair pair : pairs) {
            queue.add(pair.left);
            curMax += pair.left;

            if (queue.size() > k) {
                curMax -= queue.poll();
            }
            if (queue.size() == k) max = Math.max(max, curMax * pair.right);
        }

        return max;
    }

    private class Pair {

        int left;
        int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
}
