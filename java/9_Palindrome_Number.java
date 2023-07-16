/**
 * Palindrome_Number.
 *
 * @author Vladislav Sidlyarevich
 * @since 14.07.2023
 */
class Palindrome_Number {

    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        int len = num.length();
        for (int i = 0; i < len / 2; i++) {
            if (num.charAt(i) != num.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeWithPretty(int x) {
        if (x < 0) return false;

        // the max length of string here is 11, so no need to brainfuck
        var string = String.valueOf(x);

        return string.contentEquals(new StringBuilder(string).reverse());
    }
}
