import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * How_Many_Numbers_Are_Smaller_Than_the_Current_Number.
 *
 * @author Vladislav Sidlyarevich
 * @since 12.06.2023
 */
class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> positions = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            positions.put(nums[i], i);
        }

        Arrays.sort(nums);
        int[] result = new int[nums.length];
        for (int num : nums) {
            result[positions.get(num)] = num;
        }
        return result;
    }
}
