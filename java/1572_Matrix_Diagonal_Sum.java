/**
 * Matrix_Diagonal_Sum.
 *
 * @author Vladislav Sidlyarevich
 * @since 30.07.2023
 */
class Matrix_Diagonal_Sum {

    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        int sum = sumLeftDiagonal(mat) + sumRightDiagonal(mat);
        if (size % 2 != 0) sum -= mat[(size - 1) / 2][(size - 1) / 2];
        return sum;
    }

    public int sumLeftDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }

    public int sumRightDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = matrix.length - 1; i > -1; i--) {
            sum += matrix[matrix.length - 1 - i][i];
        }

        return sum;
    }
}
