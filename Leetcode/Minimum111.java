 /*MINIMUM DEPTH OF BINARY TREE...
 * Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
 class Minimum111 {
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        helper(1,root);
        return min;
    }
    public void helper(int dep , TreeNode root){
        if(root == null || dep > min) {
            return;
        }
        if(root.left == null && root.right == null){
            if(min > dep) min = dep;
            return;
        }
        helper(dep+1 , root.left);
        helper(dep+1 , root.right);
    }
}
