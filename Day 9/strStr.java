// Find the Index of the First Occurrence in a String

import java.util.*;
class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        int m=haystack.length();
        int n=needle.length();
        if(m < n)
        {
            return -1;
        }
        for(int i=0;i<=m-n;i++)
        {
            int j=0;
            while(j<n && haystack.charAt(i+j) == needle.charAt(j))
            {
                j++;
                if(j==n)
                {
                    return i;
                    
                }
            }
        }
        return -1;
    }
}
