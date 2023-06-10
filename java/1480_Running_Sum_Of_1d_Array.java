/**
 * Running_Sum_Of_1d_Array.
 *
 * @author Vladislav Sidlyarevich
 * @since 09.06.2023
 */
class Running_Sum_Of_1d_Arrays {

    public int[] runningSum(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
