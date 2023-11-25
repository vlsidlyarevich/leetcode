import java.util.ArrayList;
import java.util.List;

/**
 * Leaf_Similar_Trees.
 *
 * @author Vladislav Sidlyarevich
 * @since 22.11.2023
 */
class Leaf_Similar_Trees {

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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        var leeves1 = new ArrayList<Integer>();
        var leeves2 = new ArrayList<Integer>();

        traverse(root1, leeves1);
        traverse(root2, leeves2);
        return leeves1.equals(leeves2);
    }

    private void traverse(TreeNode node, List<Integer> leafs) {
        if (node == null) return;

        if (node.left == null && node.right == null) leafs.add(node.val);

        traverse(node.left, leafs);
        traverse(node.right, leafs);
    }
}
