/**
 * Longest_ZigZag_Path_in_a_Binary_Tree.
 *
 * @author Vladislav Sidlyarevich
 * @since 28.11.2023
 */
class Longest_ZigZag_Path_in_a_Binary_Tree {

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

    public int longestZigZag(TreeNode root) {
        traverse(root, true, 0);
        traverse(root, false, 0);
        return result;
    }

    public void traverse(TreeNode node, boolean toRight, int counter) {
        if (node == null) return;
        result = Math.max(result, counter);

        if (toRight) {
            traverse(node.right, false, counter + 1);
            traverse(node.left, true, 1);
        } else {
            traverse(node.left, true, counter + 1);
            traverse(node.right, false, 1);
        }
    }
}
