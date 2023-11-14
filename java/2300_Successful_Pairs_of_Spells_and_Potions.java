import java.util.Arrays;

/**
 * Successful_Pairs_of_Spells_and_Potions.
 *
 * @author Vladislav Sidlyarevich
 * @since 07.11.2023
 */
class Successful_Pairs_of_Spells_and_Potions {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        int[] res = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            res[i] = potions.length - findFirstPosition(potions, spells[i], success);
        }

        return res;
    }

    public int findFirstPosition(int[] potions, int spell, long success) {

        int left = 0;
        int right = potions.length - 1;

        while (left<=right) {
            int mid = left + (right - left) / 2;
            if ((long) potions[mid] * spell >= success) {
                right =  mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
