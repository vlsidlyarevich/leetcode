/**
 * Multiply_Strings.
 *
 * @author Vladislav Sidlyarevich
 * @since 04.08.2023
 */
class Multiply_Strings {

    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) return "0";

        int[] result = new int[num1.length() + num2.length()];


        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                result[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }

        for (int i = result.length - 1; i > 0; i--) {
            if (result[i] >= 10) {
                result[i - 1] += result[i] / 10;
                result[i] = result[i] % 10;
            }
        }

        var sb = new StringBuilder();
        for (int j : result) {
            if (sb.length() == 0 && j == 0) {
                continue;
            }
            sb.append(j);
        }
        return sb.toString();
    }
}
