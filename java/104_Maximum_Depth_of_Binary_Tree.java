/**
 * Maximum_Depth_of_Binary_Tree.
 *
 * @author Vladislav Sidlyarevich
 * @since 14.08.2023
 */
class Maximum_Depth_of_Binary_Tree {

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(calculateDepth(root.left), calculateDepth(root.right));
    }

    public int calculateDepth(TreeNode root) {
        if (root == null) return 1;

        return 1 + Math.max(calculateDepth(root.left), calculateDepth(root.right));
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
