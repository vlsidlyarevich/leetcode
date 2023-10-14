/**
 * Maximum_Average_Subarray_I.
 *
 * @author Vladislav Sidlyarevich
 * @since 10.10.2023
 */
class Maximum_Average_Subarray_I {

    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) return nums[0];

        double max = 0;
        for (int i = 0; i < k; i++) {
            max += nums[i];
        }
        double sum = max;
        for (int i = k; i <= nums.length - 1; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum);
        }

        return max / k;
    }
}
