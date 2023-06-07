import java.util.HashMap;
import java.util.Map;

/**
 * Number_Of_Good_Pairs.
 *
 * @author Vladislav Sidlyarevich
 * @since 06.06.2023
 */
class Number_Of_Good_Pairs {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        int result = 0;

        for (int num : nums) {
            int counter = map.getOrDefault(num, 0);
            result += counter;
            map.put(num, ++counter);
        }

        return result;
    }
}
