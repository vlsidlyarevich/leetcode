/**
 * Path_Sum_III.
 *
 * @author Vladislav Sidlyarevich
 * @since 25.11.2023
 */
class Path_Sum_III {

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


    int result = 0;

    public int pathSum(TreeNode root, int targetSum) {
        lol(root, targetSum);
        return result;
    }

    private void lol(TreeNode node, int targetSum) {
        if (node == null) return;
        kek(node, targetSum);

        lol(node.left, targetSum);
        lol(node.right, targetSum);
    }

    private void kek(TreeNode node, long sum) {
        if (node == null) return;
        if (node.val - sum == 0) result++;

        if (node.left != null) kek(node.left, sum - node.val);
        if (node.right != null) kek(node.right, sum - node.val);
    }
}
