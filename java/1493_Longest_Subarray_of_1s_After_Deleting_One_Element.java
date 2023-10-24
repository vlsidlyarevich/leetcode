/**
 * Longest_Subarray_of_1s_After_Deleting_One_Element.
 *
 * @author Vladislav Sidlyarevich
 * @since 14.10.2023
 */
class Longest_Subarray_of_1s_After_Deleting_One_Elements {

    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int k = 1;

        while (right < nums.length) {
            if (nums[right] == 0) k--;

            if (k < 0) {
                if (nums[left] == 0) k++;
                left++;
            }

            right++;
        }

        return right - left - 1;
    }
}
