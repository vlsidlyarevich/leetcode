import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Decompress_Run_Length_Encoded_List.
 *
 * @author Vladislav Sidlyarevich
 * @since 18.06.2023
 */
class Decompress_Run_Length_Encoded_Lists {

    public int[] decompressRLElist(int[] nums) {
        int resultListSize = 0;

        for (int i = 0; i < nums.length; i += 2) {
            resultListSize += nums[i];
        }

        int[] result = new int[resultListSize];

        int resultIndex = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, resultIndex, resultIndex + nums[i], nums[i + 1]);
            resultIndex += nums[i];
        }

        return result;
    }
}
