/**
 * String_to_Integer_atoi.
 *
 * @author Vladislav Sidlyarevich
 * @since 10.09.2023
 */
class String_to_Integer_atoi {

    public int myAtoi(String s) {
        s = s.trim();
        Boolean isPositive = null;
        Integer result = null;

        for (Character c : s.toCharArray()) {
            // handle situation when sign is provided when number is already present
            if (result == null) {
                if (isPositive == null) {
                    if (c == '-') {
                        isPositive = false;
                        result = 0;
                        continue;
                    } else if (c == '+') {
                        isPositive = true;
                        result = 0;
                        continue;
                    }
                }
            }

            // read until end OR non digit
            if (!Character.isDigit(c)) {
                break;
            }

            // init result variable
            if (result == null) result = 0;

            // check integer boundaries
            if ((Integer.MAX_VALUE / 10) < result
                || (Integer.MAX_VALUE / 10) == result && Integer.MAX_VALUE % 10 < c - '0') {

                if (isPositive == null) isPositive = true;

                return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + Integer.parseInt(c.toString());
        }

        if (isPositive == null) isPositive = true;
        if (result == null) result = 0;

        return isPositive ? result : result * -1;
    }
}
