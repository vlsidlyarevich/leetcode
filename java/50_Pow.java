/**
 * Pow.
 *
 * @author Vladislav Sidlyarevich
 * @since 04.08.2023
 */
class Pow {

    public double myPow(double x, int n) {
        if (x == 1) return 1;

        return multiply(x, n);
    }

    public double multiply(double x, long n) {
        if (n == 0) return 1;
        if (n <= 0) return 1.0 / multiply(x, -1 * n);

        if (n % 2 == 0) return multiply(x * x, n / 2);
        return x * multiply(x * x, (n - 1) / 2);
    }
}
