/**
 * Max_Consecutive_Ones.
 *
 * @author Vladislav Sidlyarevich
 * @since 05.06.2023
 */

class Max_Consecutive_Ones {

    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int maxConsecutiveOnes = 0;

        for (int number : nums) {
            counter = number == 1 ? counter + 1 : 0;

            if (counter > maxConsecutiveOnes) maxConsecutiveOnes = counter;
        }

        return maxConsecutiveOnes;
    }
}


