/**
 * Decoded_XORed_Array.
 *
 * @author Vladislav Sidlyarevich
 * @since 17.06.2023
 */
class Decoded_XORed_Arrays {

    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            result[i + 1] = encoded[i] ^ result[i];
        }

        return result;
    }
}
