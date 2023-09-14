import java.util.HashMap;
import java.util.Map;

/**
 * Valid_Number.
 *
 * @author Vladislav Sidlyarevich
 * @since 12.09.2023
 */
class Valid_Number {

    public boolean isNumber(String s) {
        s = s.trim();

        // 0-blank, 1-sign, 2-digit, 3-dot, 4-exponent, 5-invalid

        int[][] states = new int[][]{
            {0, 1, 2, 3, 8, 8}, // 0 - blank
            {8, 1, 2, 3, 8, 8}, // 1 - sign
            {8, 8, 2, 3, 4, 8}, // 2 - digit
            {8, 8, 2, 8, 4, 8}, // 3 - dot
            {8, 5, 6, 8, 8, 8}, // 4 - exponent
            {8, 8, 2, 8, 8, 8}, // 5 - exponent_sign
            {8, 8, 2, 8, 8, 8}, // 6 - exponent_digit
            {8, 8, 8, 8, 8, 8}  // 7 - invalid
        };

        Map<Character, Integer> symbols = new HashMap<>();
        symbols.put(' ', 0);
        symbols.put('+', 1);
        symbols.put('-', 1);
        for (int i = 0; i < 10; i++) {
            symbols.put((char) i, 2);
        }
        symbols.put('.', 3);
        symbols.put('e', 4);
        symbols.put('E', 4);


        for (char c : s.toCharArray()) {


        }

        return true;
    }
}
