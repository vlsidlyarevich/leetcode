import java.util.PriorityQueue;

/**
 * Total_Cost_to_Hire_K_Workers.
 *
 * @author Vladislav Sidlyarevich
 * @since 05.02.2024
 */
class Total_Cost_to_Hire_K_Workers {

    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> leftPriorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> rightPriorityQueue = new PriorityQueue<>();

        long result = 0;
        int left = 0;
        int right = costs.length - 1;

        while (k-- > 0) {

            while (leftPriorityQueue.size() < candidates && left <= right) {
                leftPriorityQueue.add(costs[left++]);
            }

            while (rightPriorityQueue.size() < candidates && right >= left) {
                rightPriorityQueue.add(costs[right--]);
            }

            int leftMin = leftPriorityQueue.isEmpty() ? Integer.MAX_VALUE : leftPriorityQueue.peek();
            int rightMin = rightPriorityQueue.isEmpty() ? Integer.MAX_VALUE : rightPriorityQueue.peek();

            if (leftMin <= rightMin) {
                result += leftPriorityQueue.remove();
            } else {
                result += rightPriorityQueue.remove();
            }
        }

        return result;
    }
}
