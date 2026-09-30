class Solution {
    public int find(int[] dsu,int x)
    {
       if(dsu[x]==x)
       {return x;}
       return find(dsu,dsu[x]);
    }
    
    public int[] findRedundantConnection(int[][] edges) 
    {
       int[] dsu=new int[edges.length+1];
        for(int i=0;i<edges.length+1;i++)
        {
           dsu[i]=i;
        }
        for(int j=0;j<edges.length;j++)
        {
           int x=edges[j][0];
           int y=edges[j][1];
           int rootX = find(dsu, x);
           int rootY = find(dsu, y);
           if (rootX==rootY)
           {
             return new int[]{x,y};
           }
           dsu[rootY] = rootX;
        }
        return new int[]{};
    }
}