import java.util.Arrays;

/**
 * Merge_Strings_Alternately.
 *
 * @author Vladislav Sidlyarevich
 * @since 17.07.2023
 */
class Merge_Strings_Alternately {

    public String mergeAlternately(String word1, String word2) {
        char[] result = new char[word1.length() + word2.length()];
        Arrays.fill(result, ' ');

        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();

        for (int i = 0; i < word1Chars.length; i++) {
            result[i * 2] = word1Chars[i];
        }

        for (int i = 0; i < word2Chars.length; i++) {
            result[i * 2 + 1] = word1Chars[i];
        }

        return Arrays.toString(result);
    }
}
