/**
 * Koko_Eating_Bananas.
 *
 * @author Vladislav Sidlyarevich
 * @since 13.11.2023
 */
class Koko_Eating_Bananas {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isValid(piles, mid, h)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean isValid(int[] piles, int speed, int h) {
        int actualHours = 0;

        for (int pile : piles) {
            actualHours += pile / speed;
            if (pile % speed > 0) actualHours++;
        }

        return actualHours <= h;
    }
}
