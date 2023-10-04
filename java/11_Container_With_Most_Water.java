/**
 * Container_With_Most_Water.
 *
 * @author Vladislav Sidlyarevich
 * @since 04.10.2023
 */
class Container_With_Most_Water {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left != right) {
            int currentArea = (right - left - 1) * Math.max(height[left], height[right]);
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
