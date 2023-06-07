import java.util.HashSet;

/**
 * Jewels_And_Stones.
 *
 * @author Vladislav Sidlyarevich
 * @since 06.06.2023
 */
class Jewels_And_Stoness {

    public int numJewelsInStones(String jewels, String stones) {
        var set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        var result = 0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) result++;
        }

        return result;
    }
}
