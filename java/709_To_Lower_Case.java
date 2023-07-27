/**
 * To_Lower_Case.
 *
 * @author Vladislav Sidlyarevich
 * @since 24.07.2023
 */
class To_Lower_Case {

    public String toLowerCase(String s) {
        var builder = new StringBuilder();

        for (char x : s.toCharArray()) {
            builder.append(isUpper(x) ? toLower(x) : x);
        }

        return builder.toString();
    }

    public boolean isUpper(char x) {
        return 'A' <= x && x <= 'Z';
    }

    public char toLower(char x) {
        return (char) ((int) x + 32);
    }
}
