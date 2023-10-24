import java.util.HashSet;
import java.util.List;

/**
 * Find_the_Difference_of_Two_Arrays.
 *
 * @author Vladislav Sidlyarevich
 * @since 19.10.2023
 */
class Find_the_Difference_of_Two_Arrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var set1 = new HashSet<Integer>();
        for (int i : nums1) {
            set1.add(i);
        }

        var set2 = new HashSet<Integer>();
        for (int i : nums2) {
            set2.add(i);
        }

        for (int i : nums1) {
            set2.remove(i);
        }

        for (int i : nums2) {
            set1.remove(i);
        }

        return List.of(set1.stream().toList(), set2.stream().toList());
    }
}
