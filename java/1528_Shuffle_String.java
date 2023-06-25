/**
 * Shuffle_String.
 *
 * @author Vladislav Sidlyarevich
 * @since 20.06.2023
 */
class Shuffle_String {

    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];

        for (int index : indices) {
            result[indices[index]] = s.charAt(index);
        }

        return new String(result);
    }
}
