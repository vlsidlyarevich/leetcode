/**
 * Shuffle_The_Array.
 *
 * @author Vladislav Sidlyarevich
 * @since 05.06.2023
 */
class Shuffle_The_Array {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];

        int lol = 0;
        for (int i = 0; i < n; i++) {
            result[lol++] = nums[i];
            result[lol++] = nums[i + n];
        }

        return result;
    }
}
