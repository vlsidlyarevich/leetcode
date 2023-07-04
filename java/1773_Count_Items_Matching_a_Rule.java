import java.util.List;

/**
 * Count_Items_Matching_a_Rule.
 *
 * @author Vladislav Sidlyarevich
 * @since 26.06.2023
 */
class Count_Items_Matching_a_Rule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        return switch (ruleKey) {
            case "type" -> (int) items.stream().filter(item -> item.get(0).equals(ruleValue)).count();
            case "color" -> (int) items.stream().filter(item -> item.get(1).equals(ruleValue)).count();
            default -> (int) items.stream().filter(item -> item.get(2).equals(ruleValue)).count();
        };
    }
}
