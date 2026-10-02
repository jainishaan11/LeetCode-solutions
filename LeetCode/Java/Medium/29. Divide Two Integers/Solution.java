class Solution {
    public int divide(int dividend, int divisor) 
    {
        int c=0;
        int sum=0;
        int n=1;
        if(divisor<0 ^ dividend<0)
        {
          n=-1;
        }
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        
        while(sum<dividend)
        {
            sum=sum+divisor;
            c++;
        }
        c=c*n;
        if(sum==dividend)
        {
            return c;
        }
        else
        {
            return c-n;
        }
        
    }
}