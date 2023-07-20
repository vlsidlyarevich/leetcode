/**
 * Move_Zeroes.
 *
 * @author Vladislav Sidlyarevich
 * @since 20.07.2023
 */
class Move_Zeroes {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
