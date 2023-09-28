/**
 * Product_of_Array_Except_Self.
 *
 * @author Vladislav Sidlyarevich
 * @since 26.09.2023
 */
class Product_of_Array_Except_Self {

    public int[] productExceptSelf(int[] nums) {

        int[] rightProducts = new int[nums.length];
        int[] leftProducts = new int[nums.length];

        leftProducts[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProducts[i] = nums[i - 1] * leftProducts[i - 1];
        }

        rightProducts[nums.length - 1] = 1;
        for (int i = rightProducts.length - 2; i >= 0; i--) {
            rightProducts[i] = nums[i + 1] * rightProducts[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rightProducts[i] * leftProducts[i];
        }

        return nums;
    }
}
