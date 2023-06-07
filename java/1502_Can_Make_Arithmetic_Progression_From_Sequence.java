import java.util.Arrays;

/**
 * Can_Make_Arithmetic_Progression_From_Sequence.
 *
 * @author Vladislav Sidlyarevich
 * @since 06.06.2023
 */
class Can_Make_Arithmetic_Progression_From_Sequences {

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int gap = arr[0] - arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (gap != arr[i - 1] - arr[i]) return false;
        }

        return true;
    }
}
