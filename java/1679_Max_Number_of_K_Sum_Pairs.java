import java.util.Arrays;

/**
 * Max_Number_of_K_Sum_Pairs.
 *
 * @author Vladislav Sidlyarevich
 * @since 04.10.2023
 */
class Max_Number_of_K_Sum_Pairs {

    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0, right = nums.length - 1, counter = 0;

        while (left != right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                counter++;
                left++;
                right--;
            } else if (sum > k) {
                right--;
            } else {
                left++;
            }
        }

        return counter;
    }
}
