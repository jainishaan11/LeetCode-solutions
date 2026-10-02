class Solution
{
  public boolean isPalindrome(int x) {
    if (x < 0) 
    {return false;}
    int y=x;
    int z;
    int s=0;
    while(y>0)
    {
        z=y%10;
        s=10*s+z;
        y=y/10;
    }
    if (s==x)
    {
        return true;
    }
    else
    {
      return false;
    }
}
}