import java.util.ArrayList;
import java.util.List;

/**
 * Spiral_Matrix.
 *
 * @author Vladislav Sidlyarevich
 * @since 31.07.2023
 */
class Spiral_Matrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom) {
            // left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            // top to bottom
            for (int i = top + 1; i < bottom; i++) {
                result.add(matrix[i][right]);
            }
            if (bottom != top) {
                // right to left
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            if (right != left) {
                // bottom to top
                for (int i = bottom - 1; i > top; i--) {
                    result.add(matrix[i][left]);
                }
            }

            left++;
            top++;
            right--;
            bottom--;
        }

        return result;
    }
}
