/**
 * Guess_Number_Higher_or_Lower.
 *
 * @author Vladislav Sidlyarevich
 * @since 06.11.2023
 */
class Guess_Number_Higher_or_Lower {

    public int guessNumber(int n) {
        int first = 1, last = n;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            int response = guess(mid);
            if (response == 0) {
                return mid;
            } else if (response == -1) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

    int guess(int num) {
        return 0;
    }
}
