/*
https://leetcode.com/problems/valid-palindrome/
*/

package string;

import java.util.*;

class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        int left=0;
        int right=s.length()-1;
        s = s.toLowerCase();
        while(left<right)
        {
            while(left<right && !((s.charAt(left)>='0' && s.charAt(left)<='9') || (s.charAt(left)>='a' && s.charAt(left)<='z')))
            {
                left++;
            }
            while ((left<right) && !((s.charAt(right)>='0' && s.charAt(right)<='9') || (s.charAt(right)>='a' && s.charAt(right)<='z')))
            {
                right--;
            }
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}