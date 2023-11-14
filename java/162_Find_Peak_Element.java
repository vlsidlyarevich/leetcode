/**
 * Find_Peak_Element.
 *
 * @author Vladislav Sidlyarevich
 * @since 11.11.2023
 */
class Find_Peak_Element {

    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 1) return 0;

        if (nums[0] > nums[1]) return 0;
        if (nums[right] > nums[right - 1]) return right;


        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1]) {
                left = mid;
            } else if (nums[mid] < nums[mid - 1]) {
                right = mid;
            }
        }

        return -1;
    }
}
