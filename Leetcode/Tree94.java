
/**
 * BINARY TREE INORDER TRAVERSAL
 * Given the root of a binary tree, return the inorder traversal of its nodes' values....
 */
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

class Tree94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root);
        return res; // Added return statement
    }

    void dfs(List<Integer> res, TreeNode node) { // Corrected the capitalization of List
        if (node != null) {
            dfs(res, node.left);
            res.add(node.val);
            dfs(res, node.right);
        }
    }
}
