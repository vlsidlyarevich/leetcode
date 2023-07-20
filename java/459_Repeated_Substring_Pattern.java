/**
 * Repeated_Substring_Pattern.
 *
 * @author Vladislav Sidlyarevich
 * @since 18.07.2023
 */
class Repeated_Substring_Pattern {

    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1) return false;

        var t = s + s;
        return t.substring(1, t.length() - 1).contains(s);
    }
}
