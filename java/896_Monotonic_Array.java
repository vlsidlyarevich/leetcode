/**
 * Monotonic_Array.
 *
 * @author Vladislav Sidlyarevich
 * @since 23.07.2023
 */
class Monotonic_Array {

    public boolean isMonotonic(int[] nums) {
        int number = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) number++;
            else number--;
        }

        return Math.abs(number) == nums.length;
    }
}
