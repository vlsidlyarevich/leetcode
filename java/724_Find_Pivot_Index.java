/**
 * Find_Pivot_Index.
 *
 * @author Vladislav Sidlyarevich
 * @since 17.10.2023
 */
class Find_Pivot_Index {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum * 2 == sum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
