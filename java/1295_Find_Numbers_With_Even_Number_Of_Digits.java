/**
 * Find_Numbers_With_Even_Number_Of_Digits.
 *
 * @author Vladislav Sidlyarevich
 * @since 05.06.2023
 */
class Find_Numbers_With_Even_Number_Of_Digits {

    public int findNumbers(int[] nums) {
        int digitsWithEvenNumbers = 0;

        for(int number : nums) {
            if(Integer.toString(number).length() % 2 == 0) digitsWithEvenNumbers++;
        }

        return digitsWithEvenNumbers;
    }
}
