// Two sum

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        int left=0;
        int right=sortedNums.length-1;
        while(left<right)
        {
            int sum=sortedNums[left]+sortedNums[right];
            if(sum==target)
            {
                int index1 = -1;
                int index2 = -1;
                for (int i = 0; i < nums.length; i++) 
                {
                    if (nums[i] == sortedNums[left] && index1 == -1 )
                    {
                        index1 = i;
                    }
                    else if (nums[i] == sortedNums[right]) 
                    {
                        index2 = i;
                    }
                }
                return new int[]{index1, index2};

            }
            else if(sum<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return new int[0];

    }
}
