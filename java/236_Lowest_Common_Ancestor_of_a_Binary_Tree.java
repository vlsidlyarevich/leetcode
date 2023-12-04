/**
 * Lowest_Common_Ancestor_of_a_Binary_Tree.
 *
 * @author Vladislav Sidlyarevich
 * @since 29.11.2023
 */
class Lowest_Common_Ancestor_of_a_Binary_Tree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q || root == null) return root;

        var left = lowestCommonAncestor(root.left, p, q);
        var right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) return root;

        return left != null ? left : right;
    }


}
