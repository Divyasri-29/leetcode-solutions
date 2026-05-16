class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1,mini=Integer.MAX_VALUE;
        while(l<=r)
        {
            int m=(l+r)>>1;
            if(nums[l]<=nums[r])
            {
                mini=Math.min(mini,nums[l]);
                break;
            }
            if(nums[l]<=nums[m])
            {
                mini=Math.min(mini,nums[l]);
                l=m+1;
            }
            else
            {
                mini=Math.min(mini,nums[m]);
                r=m-1;
            }
        }
        return mini;
    }
}