/**
 * Find_Winner_on_a_Tic_Tac_Toe_Game.
 *
 * @author Vladislav Sidlyarevich
 * @since 29.07.2023
 */
class Find_Winner_on_a_Tic_Tac_Toe_Game {

    public String tictactoe(int[][] moves) {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < moves.length; i++) {
            var move = moves[i];
            if ((i + 2) % 2 != 0) matrix[move[0]][move[1]] = -1;
            else matrix[move[0]][move[1]] = 1;
        }

        if (checkForRow(matrix, 1)) return "A";
        if (checkForRow(matrix, -1)) return "B";

        if (checkForColumn(matrix, 1)) return "A";
        if (checkForColumn(matrix, -1)) return "B";

        if (checkForLeftDiagonal(matrix, 1)) return "A";
        if (checkForLeftDiagonal(matrix, -1)) return "B";

        if (checkForRightDiagonal(matrix, 1)) return "A";
        if (checkForRightDiagonal(matrix, -1)) return "B";

        return moves.length == 9 ? "Draw" : "Pending";
    }

    public boolean checkForRow(int[][] matrix, int player) {
        for (int[] row : matrix) {
            int counter = 0;
            for (int cell : row) {
                counter += cell;
            }
            if (counter == 3 * player) return true;
        }

        return false;
    }

    public boolean checkForColumn(int[][] matrix, int player) {
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int[] row : matrix) {
                counter += row[i];
            }
            if (counter == 3 * player) return true;
        }

        return false;
    }

    public boolean checkForLeftDiagonal(int[][] matrix, int player) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != player) return false;
        }

        return true;
    }

    public boolean checkForRightDiagonal(int[][] matrix, int player) {
        for (int i = matrix.length - 1; i > -1; i--) {
            if (matrix[2 - i][i] != player) return false;
        }

        return true;
    }
}
