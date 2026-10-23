class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        makelist(root,0);
        return ans;
    }
    public void makelist(TreeNode p,int l)
    {
        if(p==null)
        {
          return;
        }
        if(l>=ans.size())
        {
            ans.add(new ArrayList<>());
        }
        ans.get(l).add(p.val);
        makelist(p.left,1+l);
        makelist(p.right,1+l);
    }
}