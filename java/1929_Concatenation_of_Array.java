/**
 * Concatenation_of_Array.
 *
 * @author Vladislav Sidlyarevich
 * @since 05.06.2023
 */
class Concatenation_of_Array {

    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }

        return result;
    }
}
