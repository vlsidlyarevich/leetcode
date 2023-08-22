import java.util.stream.Collectors;

/**
 * Buddy_Strings.
 *
 * @author Vladislav Sidlyarevich
 * @since 21.08.2023
 */
class Buddy_Strings {

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) {
            var chars = s.chars().boxed()
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
            for (int key : chars.keySet()) {
                if (chars.get(key) >= 2) return true;
            }
        }

        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (firstIndex == -1) firstIndex = i;
                else if (secondIndex == -1) secondIndex = i;
                else return false;
            }
        }

        if (firstIndex < 0 || secondIndex < 0) return false;

        return s.charAt(firstIndex) == goal.charAt(secondIndex)
            && s.charAt(secondIndex) == goal.charAt(firstIndex);
    }
}
