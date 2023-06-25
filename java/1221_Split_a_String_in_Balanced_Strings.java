/**
 * Split_a_String_in_Balanced_Strings.
 *
 * @author Vladislav Sidlyarevich
 * @since 19.06.2023
 */
class Split_a_String_in_Balanced_Strings {

    public int balancedStringSplit(String s) {
        int result = 0;
        int count = 0;

        for (Character c : s.toCharArray()) {
            if (c == 'R') count++;
            else count--;

            if (count == 0) result++;
        }

        return result;
    }
}
