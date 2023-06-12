/**
 * Goal_Parser_Interpretation.
 *
 * @author Vladislav Sidlyarevich
 * @since 12.06.2023
 */
class Goal_Parser_Interpretation {

    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') result.append("G");
            else if (command.charAt(i) == ')') result.append("o");
            else if (command.charAt(i) == 'a') {
                result.append("al");
                i += 2;
            }
        }

        return result.toString();
    }
}
