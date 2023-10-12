// Find Duplicate Nummber

import java.util.*;
class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            int result;
            if(nums[i]==nums[i-1])
            {
               return nums[i];
            }
        }
        return -1;
    }
}
