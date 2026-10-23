class Solution {
    public boolean isSymmetric(TreeNode root) 
    {
        return issame(root.right,root.left);
    }
    public boolean issame(TreeNode p,TreeNode q)
    {
        if (p==null && q==null)
        {
            return true;
        }
        else if(p==null || q==null)
        {
            return false;
        }
        else if(p.val!=q.val)
        {
            return false;
        }
        else 
        {
            return issame(p.left,q.right) && issame(p.right,q.left);
        }
    }

}