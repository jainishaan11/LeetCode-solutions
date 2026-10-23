class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> ans=new ArrayList<>();
        Deque<TreeNode> pq=new ArrayDeque<>();
        
        if (root==null)
        {
          return new ArrayList<>();
        }
        pq.add(root);
        int level=0;
        while(!pq.isEmpty())
        {
        int size=pq.size();
        List<Integer> xtra = new ArrayList<>();
        for (int i=0;i<size;i++)
        {
        TreeNode temp;
        if (level%2==0)
        {
          temp=pq.pollFirst();
          if (temp.left!=null)
          {
            pq.addLast(temp.left);
          }
          if (temp.right!=null)
          {
            pq.addLast(temp.right);
          }
        }
        else
        {
          temp=pq.pollLast();
          if (temp.right!=null)
          {
            pq.addFirst(temp.right);
          }
          if (temp.left!=null)
          {
            pq.addFirst(temp.left);
          }
        }
        
        xtra.add(temp.val);
        
        }
        ans.add(xtra);
        level++;
        }
        return ans;
    }

}