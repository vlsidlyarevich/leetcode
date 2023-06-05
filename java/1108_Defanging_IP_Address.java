/**
 * Defanging_IP_Address.
 *
 * @author Vladislav Sidlyarevich
 * @since 05.06.2023
 */
class Defanging_IP_Address {

    public static String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();

        for (char c : address.toCharArray()) {
            if (c == '.') builder.append("[.]");
            else builder.append(c);
        }

        return builder.toString();
    }
}
