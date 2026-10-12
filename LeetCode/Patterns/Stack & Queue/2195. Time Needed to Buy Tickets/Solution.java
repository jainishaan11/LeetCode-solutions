class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) 
    {
        Queue<Integer> st=new LinkedList<>();
        for(int i=0;i<tickets.length;i++)
        {
          st.offer(i);
        }
        int t=0;
        while(!st.isEmpty())
        {
           int x=st.poll();
           if(x==k && tickets[k]==1)
           {
             return ++t;
           }
           if(tickets[x]>0)
           {
             tickets[x]--;
             st.offer(x);
             t++;
           }
        }
        return -1;
 
    }
}