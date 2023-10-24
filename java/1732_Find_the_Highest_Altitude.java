/**
 * Find_the_Highest_Altitude.
 *
 * @author Vladislav Sidlyarevich
 * @since 16.10.2023
 */
class Find_the_Highest_Altitudes {

    public int largestAltitude(int[] gain) {
        int max = gain[0];
        int sum = gain[0];

        for (int j : gain) {
            sum += j;
            if (sum > max) max = sum;
        }

        return max;
    }
}
