/**
 * Subtract_the_Product_and_Sum_of_Digits_of_an_Integer.
 *
 * @author Vladislav Sidlyarevich
 * @since 12.06.2023
 */
class Subtract_the_Product_and_Sum_of_Digits_of_an_Integers {

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        do {
            int o = n % 10;
            sum += o;
            product *= o;
            n = n / 10;
        } while (n != 0);

        return product - sum;
    }
}
