import java.util.Arrays;

/**
 * Set_Matrix_Zeroes.
 *
 * @author Vladislav Sidlyarevich
 * @since 15.09.2023
 */
class Set_Matrix_Zeroes {

    public void setZeroes(int[][] matrix) {

        boolean firstRowShouldBeZeroed = false;
        boolean firstColumnShouldBeZeroed = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if (i == 0) firstRowShouldBeZeroed = true;
                    if (j == 0) firstColumnShouldBeZeroed = true;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowShouldBeZeroed) Arrays.fill(matrix[0], 0);
        if (firstColumnShouldBeZeroed) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
