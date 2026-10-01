class Solution {
    public int orangesRotting(int[][] grid) 
    {
       Queue<Integer> pq = new LinkedList<>();
       int fresh=0;
       for(int i=0;i<grid.length;i++)
       {
         for(int j=0;j<grid[0].length;j++)
         {
            if(grid[i][j]==2)
            {
               pq.add(i);
               pq.add(j);
            }
            if(grid[i][j]==1)
            {
               fresh++;
            }
         }
       }
       if (fresh==0)
       {return 0;}
       return check(pq,grid,0,fresh);
        
    }
     public int check(Queue<Integer> pq,int[][] grid,int t,int fresh)
     {
        int s=pq.size();
        for(int i=0;i<s;i=i+2)
        {
           int x=pq.poll();
           int y=pq.poll();
           if(x+1<grid.length && grid[x+1][y]==1)
           {
              grid[x+1][y] = 2;
              pq.add(x+1);
              pq.add(y);
              fresh--;
           }
           if(x-1>=0 && grid[x-1][y]==1)
           {
              grid[x-1][y] = 2;
              pq.add(x-1);
              pq.add(y);
              fresh--;
           }
           if(y-1>=0 && grid[x][y-1]==1)
           {
              grid[x][y-1] = 2;
              pq.add(x);
              pq.add(y-1);
              fresh--;
           }
           if(y+1<grid[0].length && grid[x][y+1]==1)
           {
              grid[x][y+1] = 2;
              pq.add(x);
              pq.add(y+1);
              fresh--;
           }
        }
        t++;
        if(fresh==0)
        {
          return t;
        }
        if (pq.isEmpty())
        {
          return -1;
        }
        return check(pq,grid,t,fresh);


     }
}