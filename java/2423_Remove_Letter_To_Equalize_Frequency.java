import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Remove_Letter_To_Equalize_Frequency.
 *
 * @author Vladislav Sidlyarevich
 * @since 10.06.2023
 */
class Remove_Letter_To_Equalize_Frequency {

    public boolean equalFrequency(String word) {
        Map<Character, Integer> charFrequences = new HashMap<>();

        for (char c : word.toCharArray()) {
            charFrequences.compute(c, (k, v) -> (v == null) ? 1 : ++v);
        }

        List<Integer> frequencies = new ArrayList<>(charFrequences.values());
        if (allElementsShouldEqual(frequencies, 1)) return true;

        for (int i = 0; i < frequencies.size(); i++) {
            int allShouldEqual = frequencies.get(i) - 1;
            frequencies.set(i, allShouldEqual);
            if (allShouldEqual == 0 && allElementsShouldEqual(frequencies)) {
                return true;
            } else if (allElementsShouldEqual(frequencies, allShouldEqual)) {
                return true;
            }

            frequencies.set(i, allShouldEqual + 1);
        }

        return false;
    }

    private boolean allElementsShouldEqual(List<Integer> list, int number) {
        return list.stream().allMatch(n -> n == number || n == 0);
    }

    private boolean allElementsShouldEqual(List<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        set.remove(0);
        return set.size() == 1;
    }
}
