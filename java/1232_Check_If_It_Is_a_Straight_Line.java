/**
 * Check_If_It_Is_a_Straight_Line.
 *
 * @author Vladislav Sidlyarevich
 * @since 02.08.2023
 */
class Check_If_It_Is_a_Straight_Line {

    public boolean checkStraightLine(int[][] coordinates) {
        int deltaY = coordinates[1][0] - coordinates[0][0];
        int deltaX = coordinates[1][1] - coordinates[0][1];

        for (int i = 0; i < coordinates.length - 1; i++) {
            if ((coordinates[i + 1][0] - coordinates[i][0]) * deltaX != (coordinates[i + 1][1] - coordinates[i][1]) * deltaY) {
                return false;
            }
        }

        return true;
    }
}
