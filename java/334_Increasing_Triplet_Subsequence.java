/**
 * Increasing_Triplet_Subsequence.
 *
 * @author Vladislav Sidlyarevich
 * @since 28.09.2023
 */
class Increasing_Triplet_Subsequence {

    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int next_min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
                continue;
            }

            if (num != min && next_min > num) {
                next_min = num;
                continue;
            }

            if (next_min < num) return true;
        }

        return false;
    }
}
