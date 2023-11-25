import java.util.ArrayList;
import java.util.List;

/**
 * Count_Good_Nodes_in_Binary_Tree.
 *
 * @author Vladislav Sidlyarevich
 * @since 23.11.2023
 */
class Count_Good_Nodes_in_Binary_Tree {

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

    public int goodNodes(TreeNode root) {

        int curMax = root.val;
        traverse(root, curMax);
        return result;
    }

    private void traverse(TreeNode node, Integer max) {

        max = Math.max(node.val, max);
        if (node.val >= max) {
            result++;
        }

        if (node.left != null) traverse(node.left, max);
        if (node.right != null) traverse(node.right, max);
    }
}
