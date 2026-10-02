class Solution {
    public int[] plusOne(int[] digits) 
    {
      int i=digits.length-1;
      while(i>=0 && digits[i]==9)
      {
         digits[i]=0;
         i--;
      }
      if(i==-1)
      {
         int ans[]=new int[digits.length+1];
         ans[0]=1;
         return ans;
      }
      digits[i]=digits[i]+1;
      return digits;
        
    }
}