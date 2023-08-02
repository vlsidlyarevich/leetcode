
/**
 * Lemonade_Change.
 *
 * @author Vladislav Sidlyarevich
 * @since 01.08.2023
 */
class Lemonade_Changes {

    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) five++;
            else if (bill == 10) {
                if (five == 0) return false;
                five--;
                ten++;
            } else {
                if (ten == 0 && five >= 3) {
                    five -= 3;
                } else if (ten > 0 && five >= 1) {
                    ten--;
                    five--;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
