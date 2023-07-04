import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Valid_Parentheses.
 *
 * @author Vladislav Sidlyarevich
 * @since 04.07.2023
 */
class Valid_Parentheses {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (Character c : s.toCharArray()) {
            switch (c) {
                case '}' -> {
                    if (!stack.isEmpty() && stack.peek() == '{') stack.remove();
                    else stack.push(c);
                }
                case ')' -> {
                    if (!stack.isEmpty() && stack.peek() == '(') stack.remove();
                    else stack.push(c);
                }
                case ']' -> {
                    if (!stack.isEmpty() && stack.peek() == '[') stack.remove();
                    else stack.push(c);
                }
                case null, default -> stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
