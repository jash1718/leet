/**SYMMETRIC TREE
  Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */

        
class Symmetric101 {
    public boolean isSymmetric(TreeNode root)
    {    
        return isMirror(root.left, root.right);
    }
        public boolean isMirror(TreeNode T1, TreeNode T2)
        {  
            if(T1 == null && T2 == null) return true;
            if(T1 == null || T2 == null) return false;
            
            if(T1.val != T2.val) return false;
    
            return isMirror(T1.left,T2.right)
                   && isMirror(T1.right,T2.left);
        }
 }
        
   
    
        
    