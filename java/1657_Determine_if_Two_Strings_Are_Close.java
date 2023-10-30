import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Determine_if_Two_Strings_Are_Close.
 *
 * @author Vladislav Sidlyarevich
 * @since 24.10.2023
 */
class Determine_if_Two_Strings_Are_Close {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        var word1CharsFreq = new HashMap<Character, Integer>();
        for (char c : word1.toCharArray()) {
            word1CharsFreq.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }

        var word2CharsFreq = new HashMap<Character, Integer>();
        for (char c : word2.toCharArray()) {
            word2CharsFreq.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }
        var result1 = word1CharsFreq.values().toArray();
        var result2 = word2CharsFreq.values().toArray();
        Arrays.sort(result1);
        Arrays.sort(result2);

        return Arrays.equals(result1, result2)
            && word1CharsFreq.keySet().equals(word2CharsFreq.keySet());
    }
}
