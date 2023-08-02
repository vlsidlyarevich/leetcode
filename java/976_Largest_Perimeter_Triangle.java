import java.util.Arrays;

/**
 * Largest_Perimeter_Triangle.
 *
 * @author Vladislav Sidlyarevich
 * @since 01.08.2023
 */
class Largest_Perimeter_Triangle {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] + nums[i - 1] > nums[i - 2]
                && nums[i - 1] + nums[i - 2] > nums[i]
                && nums[i] + nums[i - 2] > nums[i - 1]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }
}
