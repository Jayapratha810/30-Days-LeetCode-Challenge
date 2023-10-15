// Reverse String

import java.util.*;
class Solution 
{
    public void reverseString(char[] s) 
    {
        int left=0; 
        int right=s.length-1;

        while(left<right)
        {

           char temp=s[left];
           s[left]=s[right];
           s[right]=temp;
             left++;
             right--;
        }
return ;
    }
}

/*Another Method

import java.util.*;
class Solution 
{
    static String revStr(String S) 
    {
        int left = 0;
        int right = S.length() - 1;
        char[] charArray = S.toCharArray();

        while (left < right) 
        {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}*/












