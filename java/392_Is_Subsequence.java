import java.util.Stack;

/**
 * Is_Subsequence.
 *
 * @author Vladislav Sidlyarevich
 * @since 03.10.2023
 */
class Is_Subsequence {

    public boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()) return false;

        var stack = new Stack<Character>();
        char[] charArray = s.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            stack.push(charArray[i]);
        }

        for (char c : t.toCharArray()) {
            if (stack.isEmpty()) return true;
            if (c == stack.peek()) stack.pop();
        }

        return stack.isEmpty();
    }
}
