import java.util.Stack;

/**
 * Removing_Stars_From_a_String.
 *
 * @author Vladislav Sidlyarevich
 * @since 30.10.2023
 */
class Removing_Stars_From_a_String {

    public String removeStars(String s) {
        var stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if(c == '*') stack.pop();
            else stack.push(c);
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}
