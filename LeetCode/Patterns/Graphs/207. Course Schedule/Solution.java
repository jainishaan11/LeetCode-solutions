class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
      List<List<Integer>> adj=new ArrayList<>();
      for(int i=0;i<numCourses;i++)
      {
        adj.add(new ArrayList<>());
      }
      for(int i=0;i<prerequisites.length;i++) 
      {
         int x=prerequisites[i][0];
         int y=prerequisites[i][1];
         adj.get(y).add(x);
      }
      HashSet<Integer> set = new HashSet<>();
      for (int i = 0; i < numCourses; i++) 
      {
            if (!check(i, set, adj)) 
            {
                return false;
            }
      }
      return true;
    }
    public boolean check(int ele,HashSet<Integer> set,List<List<Integer>> adj)
    {
       if(set.contains(ele))
       {
         return false;
       }
       set.add(ele);
       for(int x:adj.get(ele))
       {
          if(!check(x,set,adj))
          {return false;}
       }
       set.remove(ele);
       return true;

    }
}