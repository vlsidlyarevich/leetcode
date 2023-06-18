/**
 * Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree.
 *
 * @author Vladislav Sidlyarevich
 * @since 13.06.2023
 */
class Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Trees {

    TreeNode result;

    public void traversePreorder(TreeNode node, TreeNode target) {
        if (node == null) {
            return;
        }
        if (node.val == target.val) {
            result = node;
            return;
        }
        traversePreorder(node.left, target);
        traversePreorder(node.right, target);
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        traversePreorder(cloned, target);

        return result;
    }


    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

