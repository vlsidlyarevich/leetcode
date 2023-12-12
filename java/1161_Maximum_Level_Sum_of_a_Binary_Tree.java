import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Maximum_Level_Sum_of_a_Binary_Tree.
 *
 * @author Vladislav Sidlyarevich
 * @since 08.12.2023
 */
class Maximum_Level_Sum_of_a_Binary_Tree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxLevelSum(TreeNode root) {
        if (root == null) return 1;

        int maxSum = Integer.MIN_VALUE;
        int maxSumLevel = 0;
        int curLevel = 0;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            curLevel++;
            int sum = 0;

            for (int i = queue.size(); i > 0; i--) {
                var node = queue.poll();

                sum += node.val;

                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxSumLevel = curLevel;
            }
        }

        return maxSumLevel;
    }
}
