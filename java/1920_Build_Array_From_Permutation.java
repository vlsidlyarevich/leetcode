/**
 * Build_Array_From_Permutation.
 *
 * @author Vladislav Sidlyarevich
 * @since 05.06.2023
 */
class Build_Array_From_Permutation {

    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }
}
