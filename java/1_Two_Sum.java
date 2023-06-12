import java.util.HashMap;
import java.util.Map;

/**
 * Two_Sum.
 *
 * @author Vladislav Sidlyarevich
 * @since 10.06.2023
 */
class Two_Sum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsPositions = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numsPositions.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (numsPositions.containsKey(target - nums[i]) && numsPositions.get(target - nums[i]) != i)
                return new int[]{numsPositions.get(target - nums[i]), i};
        }

        return new int[]{};
    }
}
