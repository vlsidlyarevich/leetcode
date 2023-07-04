/**
 * Count_the_Digits_That_Divide_a_Number.
 *
 * @author Vladislav Sidlyarevich
 * @since 29.06.2023
 */
class Count_the_Digits_That_Divide_a_Number {

    public int countDigits(int num) {

        int count = 0;

        while (num > 0) {
            if (num % 10 != 0 && num % (num % 10) == 0) count++;
            num = num / 10;
        }

        return count;
    }
}
