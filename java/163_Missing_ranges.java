import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Missing_ranges.
 *
 * @author Vladislav Sidlyarevich
 * @since 24.08.2023
 */
class Missing_ranges {

    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length == 0) {
            result.add(List.of(lower, upper));
            return result;
        }

        if (lower < nums[0]) {
            result.add(List.of(lower, nums[0] - 1));
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] <= 1) {
                continue;
            }
            result.add(List.of(nums[i] + 1, nums[i + 1] - 1));
        }

        if (upper > nums[nums.length - 1]) {
            result.add(List.of(nums[nums.length - 1] + 1, upper));
        }

        return result;
    }
}
