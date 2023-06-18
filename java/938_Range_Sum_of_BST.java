import java.util.Stack;

/**
 * Range_Sum_of_BST.
 *
 * @author Vladislav Sidlyarevich
 * @since 16.06.2023
 */
class Range_Sum_of_BST {

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

    public int rangeSumBST(TreeNode root, int low, int high) {
        int result = 0;
        Stack<TreeNode> traverseStack = new Stack<>();
        traverseStack.push(root);

        while (!traverseStack.isEmpty()) {
            var node = traverseStack.pop();
            if (node == null) continue;
            if (low <= node.val && node.val <= high) {
                result += node.val;
            }
            if (low < node.val && node.left != null) traverseStack.push(node.left);
            if (high > node.val && node.right != null) traverseStack.push(node.right);
        }

        return result;
    }
}
