/**
 * Sign_of_the_Product_of_an_Array.
 *
 * @author Vladislav Sidlyarevich
 * @since 22.07.2023
 */
class Sign_of_the_Product_of_an_Array {

    public int arraySign(int[] nums) {
        int negatives = 0;

        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) {
                negatives++;
            }
        }

        return negatives % 2 == 0 ? 1 : -1;
    }
}
