/**
 * Max_Consecutive_Ones_III.
 *
 * @author Vladislav Sidlyarevich
 * @since 12.10.2023
 */
class Max_Consecutive_Ones_IIIs {

    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] == 0) k--;

            if (k < 0) {
                if (nums[left] == 0) k++;
                left++;
            }

            right++;
        }

        return right - left;
    }
}
