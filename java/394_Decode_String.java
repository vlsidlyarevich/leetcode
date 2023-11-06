import java.util.Stack;

/**
 * Decode_String.
 *
 * @author Vladislav Sidlyarevich
 * @since 02.11.2023
 */
class Decode_String {

    //"3[a2[c]]"
    public String decodeString(String s) {
        var strings = new Stack<String>();
        var multipliers = new Stack<Integer>();

        var accumulator = 0;
        StringBuilder temp = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                accumulator = accumulator * 10 + (c - '0');
            } else if (c == '[') {
                multipliers.push(accumulator);
                accumulator = 0;
                strings.push(temp.toString());
                temp = new StringBuilder();
            } else if (c == ']') {
                String str = strings.pop();
                int multiplicator = multipliers.pop();

                while (multiplicator-- != 0) {
                    str += str;
                }
                strings.push(str);
            } else {
                temp.append(c);
            }
        }

        return strings.peek();
    }
}
