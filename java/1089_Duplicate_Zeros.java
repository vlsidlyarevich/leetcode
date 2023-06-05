/**
 * Duplicate_Zeros.
 *
 * @author Vladislav Sidlyarevich
 * @since 05.06.2023
 */
class Duplicate_Zeros {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 0) {
                for(int x = arr.length-1; x >= i+1; x--) {
                    arr[x] = arr[x - 1];
                }
                arr[++i] = 0;
            }
        }
    }
}
