class Solution {
    public int maxSubArray(int[] nums) 
    {
        int cursum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(cursum<0)
            {
                cursum=0;
            }
            cursum=cursum+nums[i];
            max=Math.max(max,cursum);
        }
        return max;        
    }
}