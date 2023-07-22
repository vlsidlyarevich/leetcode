import java.util.Arrays;

/**
 * Plus_One.
 *
 * @author Vladislav Sidlyarevich
 * @since 21.07.2023
 */
class Plus_One {

    public int[] plusOne(int[] digits) {

        boolean increaseByTen = true;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 9 && increaseByTen) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                increaseByTen = false;
            }
        }

        if (increaseByTen) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
