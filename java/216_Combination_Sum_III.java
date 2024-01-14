import java.util.ArrayList;
import java.util.List;

/**
 * Combination_Sum_III.
 *
 * @author Vladislav Sidlyarevich
 * @since 14.01.2024
 */
class Combination_Sum_III {

    private List<Integer> digits = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(n, k, 0, new ArrayList<>());

        return results;
    }

    private void backtrack(int currentSum,
                           int numberOfDigits,
                           int startingPosition,
                           List<Integer> currentSet) {
        if (currentSet.size() ==  numberOfDigits && currentSum == 0) {
            results.add(new ArrayList<>(currentSet));
            return;
        }

        if(currentSet.size() > numberOfDigits) return;

        for (int i = startingPosition; i < digits.size(); i++) {
            currentSet.add(digits.get(i));
            backtrack(currentSum - digits.get(i), numberOfDigits, i + 1, currentSet);
            currentSet.remove(currentSet.size() - 1);
        }
    }
}
