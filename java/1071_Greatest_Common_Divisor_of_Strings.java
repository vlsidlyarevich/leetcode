/**
 * Greatest_Common_Divisor_of_Strings.
 *
 * @author Vladislav Sidlyarevich
 * @since 20.09.2023
 */
class Greatest_Common_Divisor_of_Strings {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str2 + str1).equals(str1 + str2)) return "";

        int x = str1.length();
        int y = str2.length();

        for (int i = Math.min(x, y); i >= 0; i--) {
            if (x % i == 0 && y % i == 0) {
                return str1.substring(0, i);
            }
        }

        return "";
    }
}
