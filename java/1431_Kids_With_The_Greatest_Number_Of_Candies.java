import java.util.ArrayList;
import java.util.List;

/**
 * Kids_With_The_Greatest_Number_Of_Candies.
 *
 * @author Vladislav Sidlyarevich
 * @since 07.06.2023
 */
class Kids_With_The_Greatest_Number_Of_Candies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);

        int max = candies[0];
        for (int candy : candies) {
            if (candy > max) max = candy;
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) result.add(true);
            else result.add(false);
        }

        return result;
    }
}
