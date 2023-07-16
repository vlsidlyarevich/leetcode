/**
 * Count_Odd_Numbers_in_an_Interval_Range.
 *
 * @author Vladislav Sidlyarevich
 * @since 04.07.2023
 */
class Count_Odd_Numbers_in_an_Interval_Range {

    public int countOdds(int low, int high) {
        int result = 0;
        if (low % 2 != 0) {
            low += 1;
            result++;

            if (low >= high) return result;
        }

        return high % 2 == 0
            ? result + (high - low) / 2
            : result + (high - low) / 2 + 1;
    }
}
