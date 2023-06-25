/**
 * XOR_Operation_in_an_Array.
 *
 * @author Vladislav Sidlyarevich
 * @since 21.06.2023
 */
class XOR_Operation_in_an_Array {

    public int xorOperation(int n, int start) {
        int res = start;
        for (int i=1; i<n; i++){
            res = res ^ (start + 2 * i);
        }
        return res;
    }
}
