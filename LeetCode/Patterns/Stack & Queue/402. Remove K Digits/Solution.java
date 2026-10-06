class Solution {
    public String removeKdigits(String num, int k) 
    {
      if(k==num.length())
      {
        return "0";
      }
      StringBuilder sb = new StringBuilder("");
      for(int i=0;i<num.length()-1;i++)
      {
        if(k>0 && num.charAt(i)>num.charAt(i+1))
        {
          k--;
        }
        else
        {
            sb.append(num.charAt(i));
        }
      }
      sb.append(num.charAt(num.length()-1));
      while(sb.charAt(0)=='0')
      {
        sb.deleteCharAt(0);
      }
      return sb.toString();
        
    }
}