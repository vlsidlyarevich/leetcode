import java.util.List;

/**
 * Valid_Word_Square.
 *
 * @author Vladislav Sidlyarevich
 * @since 22.08.2023
 */
class Valid_Word_Square {

    public boolean validWordSquare(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            for (int j = 0; j < word.length(); j++) {
                if (words.size() <= j) return false;
                if (words.get(j).length() <= i) return false;
                if (word.charAt(j) != words.get(j).charAt(i)) return false;
            }
        }

        return true;
    }
}
