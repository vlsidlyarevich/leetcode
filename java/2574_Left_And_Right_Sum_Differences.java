/**
 * Left_And_Right_Sum_Differences.
 *
 * @author Vladislav Sidlyarevich
 * @since 07.06.2023
 */
class Left_And_Right_Sum_Differences {

    public int[] leftRightDifference(int[] nums) {
        int rightSum = 0;
        int[] result = new int[nums.length];

        for (int num : nums) {
            rightSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            result[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return result;
    }
}
