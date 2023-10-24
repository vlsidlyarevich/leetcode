import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Unique_Number_of_Occurrences.
 *
 * @author Vladislav Sidlyarevich
 * @since 19.10.2023
 */
class Unique_Number_of_Occurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
        }
        return map.size() == new HashSet<>(map.values()).size();
    }
}
