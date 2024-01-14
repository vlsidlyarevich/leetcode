import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Letter_Combinations_of_a_Phone_Number.
 *
 * @author Vladislav Sidlyarevich
 * @since 11.01.2024
 */
class Letter_Combinations_of_a_Phone_Number {

    List<String> combinations = new ArrayList<>();
    Map<Character, List<Character>> keyboard = Map.of(
        '1', List.of(),
        '2', List.of('a', 'b', 'c'),
        '3', List.of('d', 'e', 'f'),
        '4', List.of('g', 'h', 'i'),
        '5', List.of('j', 'k', 'l'),
        '6', List.of('m', 'n', 'o'),
        '7', List.of('p', 'q', 'r', 's'),
        '8', List.of('t', 'u', 'v'),
        '9', List.of('w', 'x', 'y', 'z')
    );

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return combinations;

        backtrack(digits, 0, new StringBuilder());

        return combinations;
    }

    private void backtrack(String digits, int index, StringBuilder sb) {
        if (sb.length() == digits.length()) {
            combinations.add(sb.toString());
            return;
        }

        var letters = keyboard.get(digits.charAt(index));

        for (Character letter : letters) {
            sb.append(letter);
            backtrack(digits, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
