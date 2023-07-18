import java.util.Arrays;

/**
 * Valid_Anagram.
 *
 * @author Vladislav Sidlyarevich
 * @since 17.07.2023
 */
class Valid_Anagram {

    public boolean isAnagram(String s, String t) {
        char[] firstArr = s.toCharArray();
        char[] secondArr = t.toCharArray();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        return Arrays.equals(firstArr,secondArr);
    }
}
