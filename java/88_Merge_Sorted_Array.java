import java.util.Arrays;

/**
 * Merge Sorted Array.
 *
 * @author Vladislav Sidlyarevich
 * @since 05.06.2023
 */
class Merge_Sorted_Array {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n == 0) return;
        if (n == 0) {
            return;
        }

        if (m == 0 || nums1[m - 1] < nums2[0]) {
            for (int i = 0; i < n; i++) {
                nums1[m + i] = nums2[i];
            }

            return;
        }

        if (nums1[0] > nums2[n - 1]) {
            for (int i = 0; i < m; i++) {
                nums1[m + i] = nums1[i];
                nums1[i] = nums2[i];
            }

            return;
        }

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}