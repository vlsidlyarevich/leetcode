/**
 * Reverse_Words_in_a_String.
 *
 * @author Vladislav Sidlyarevich
 * @since 25.09.2023
 */
class Reverse_Words_in_a_String {

    public String reverseWords(String s) {
        s = " " + s;
        char[] array = s.toCharArray();
        var result = new StringBuilder();

        Integer wordFinish = null;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != ' ' && wordFinish == null) {
                wordFinish = i;
                continue;
            }

            if (array[i] == ' ' && wordFinish != null) {
                result.append(s.substring(i + 1, wordFinish + 1));
                result.append(" ");
                wordFinish = null;
            }
        }

        return result.toString().trim();
    }
}
