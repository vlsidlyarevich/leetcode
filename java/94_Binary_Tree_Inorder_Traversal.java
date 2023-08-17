import java.util.ArrayList;
import java.util.List;

/**
 * Binary_Tree_Inorder_Traversal.
 *
 * @author Vladislav Sidlyarevich
 * @since 16.08.2023
 */
class Binary_Tree_Inorder_Traversals {

    public List<Integer> inorderTraversal(TreeNode root) {
        return traverse(root);
    }

    public List<Integer> traverse(TreeNode node) {
        if(node == null) return new ArrayList<>();
        var result = new ArrayList<Integer>();

        result.addAll(traverse(node.left));
        result.add(node.val);
        result.addAll(traverse(node.right));

        return result;
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
