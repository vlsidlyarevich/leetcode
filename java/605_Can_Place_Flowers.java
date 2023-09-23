/**
 * Can_Place_Flowers.
 *
 * @author Vladislav Sidlyarevich
 * @since 20.09.2023
 */
class Can_Place_Flowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 1;
        for (int j : flowerbed) {
            if (j == 1) count = 0;
            count++;
            if (count == 3) {
                n--;
                count = 1;
            }
        }

        if (flowerbed[flowerbed.length - 1] == 0) count++;
        if (count == 3) n--;

        return n <= 0;
    }
}
