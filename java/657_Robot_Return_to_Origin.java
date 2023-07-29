/**
 * Robot_Return_to_Origin.
 *
 * @author Vladislav Sidlyarevich
 * @since 27.07.2023
 */
class Robot_Return_to_Origin {

    public boolean judgeCircle(String moves) {
        int up = 0;
        int right = 0;

        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'R' -> right++;
                case 'L' -> right--;
                case 'G' -> up++;
                case 'D' -> up--;
            }
        }

        return up == 0 && right == 0;
    }
}
