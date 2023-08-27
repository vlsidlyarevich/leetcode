import java.util.Map;

/**
 * Confusing_Number.
 *
 * @author Vladislav Sidlyarevich
 * @since 25.08.2023
 */
class Confusing_Number {

    public boolean confusingNumber(int n) {
        var dictionary = Map.of(0, 0, 1, 1, 6, 9, 8, 8, 9, 6);
        if(n == 0) return false;

        StringBuilder result = new StringBuilder();
        int copy = n;
        while (copy > 0) {
            int remainder = copy % 10;
            Integer confusingLetter = dictionary.get(remainder);
            if (confusingLetter == null) return false;
            result.append(confusingLetter);
            copy /= 10;
        }

        return n != Integer.parseInt(result.toString());
    }
}
