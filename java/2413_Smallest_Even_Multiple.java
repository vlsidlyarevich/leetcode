/**
 * Smallest_Even_Multiple.
 *
 * @author Vladislav Sidlyarevich
 * @since 09.06.2023
 */
class Smallest_Even_Multiples {

    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;

        return n * 2;
    }
}
