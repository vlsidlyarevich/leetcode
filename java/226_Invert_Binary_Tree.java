import java.util.ArrayList;

/**
 * Invert_Binary_Tree.
 *
 * @author Vladislav Sidlyarevich
 * @since 17.08.2023
 */
class Invert_Binary_Trees {


    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }

    private TreeNode invert(TreeNode node) {
        if (node == null) return null;

        var temp = node.left;
        node.left = node.right;
        node.right = temp;

        if (node.left != null) invert(node.left);
        if (node.right != null) invert(node.right);

        return node;
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
