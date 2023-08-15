/**
 * Minimum_Depth_of_Binary_Tree.
 *
 * @author Vladislav Sidlyarevich
 * @since 15.08.2023
 */
class Minimum_Depth_of_Binary_Tree {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return calculateDepth(root);
    }

    public int calculateDepth(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null) {
            return 1 + calculateDepth(root.right);
        } else if (root.right == null) {
            return 1 + calculateDepth(root.left);
        }

        return 1 + Math.min(calculateDepth(root.left), calculateDepth(root.right));
    }

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
}
