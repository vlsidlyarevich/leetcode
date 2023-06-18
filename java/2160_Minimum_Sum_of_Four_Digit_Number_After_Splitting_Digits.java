import java.util.Arrays;

/**
 * Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits.
 *
 * @author Vladislav Sidlyarevich
 * @since 13.06.2023
 */
class Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits {

    public int minimumSum(int num) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            int o = num % 10;
            digits[i] = o;
            num = num / 10;
        }
        Arrays.sort(digits);

        return (10 * digits[0] + digits[2]) + (10 * digits[1] + digits[3]);
    }
}
