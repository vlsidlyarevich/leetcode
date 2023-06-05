import java.util.Arrays;

/**
 * Squares_of_a_Sorted_Array.
 *
 * @author Vladislav Sidlyarevich
 * @since 05.06.2023
 */
class Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] A) {
        if(A[0] >= 0) return povArray(A);
        A =  povArray(A);

        Arrays.sort(A);

        return A;
    }

    private int[] povArray(int[] A) {
        for(int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        return A;
    }
}
