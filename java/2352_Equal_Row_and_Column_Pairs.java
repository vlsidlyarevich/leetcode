import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Equal_Row_and_Column_Pairs.
 *
 * @author Vladislav Sidlyarevich
 * @since 25.10.2023
 */
class Equal_Row_and_Column_Pairs {

    public int equalPairs(int[][] grid) {
        int count = 0;

        Map<String, Integer> rows = new HashMap<>();

        for (int[] ints : grid) {
            rows.put(Arrays.toString(ints), rows.getOrDefault(Arrays.toString(ints), 0) + 1);
        }

        for (int i = 0; i < grid[0].length; i++) {
            var column = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                column[j] = grid[j][i];
            }

            var increment = rows.getOrDefault(Arrays.toString(column), 0);
            if (increment != null) count += increment;
        }

        return count;
    }
}
