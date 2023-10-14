import java.util.Set;

/**
 * Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length.
 *
 * @author Vladislav Sidlyarevich
 * @since 11.10.2023
 */
class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {

    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int maxVowels = 0;
        for (int i = 0; i < k; i++) {
            maxVowels += vowels.contains(s.charAt(i)) ? 1 : 0;
        }

        int sum = maxVowels;
        for (int i = k; i <= s.length() - 1; i++) {
            if (vowels.contains(s.charAt(i - k))) sum -= 1;
            if (vowels.contains(s.charAt(i))) sum += 1;
            maxVowels = Math.max(maxVowels, sum);
        }

        return maxVowels;
    }
}
