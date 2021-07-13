class Solution {
    public int findPeakElement(int[] nums) 
    {
        int peak =0;
        //this covers the middle edge case (given an odd length array)
        if(nums[nums.length/2] > peak)
            {
                peak = nums.length/2;
            }
            //this for loop covers all cases except the middle where i = nums.length/2
            for(short i = 0; i < (nums.length)/2; i++) // shorts are <= 1000 in range (data minimization)
            {
               if(nums[peak] < nums[nums.length-1-i])
               {
                   peak = nums.length-1-i;
               }
                if(nums[peak] < nums[i])
                {
                    peak = i;
                }
            }
            return peak;
    }
}
