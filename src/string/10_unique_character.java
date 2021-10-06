/*
https://leetcode.com/problems/first-unique-character-in-a-string/
*/

package string;

import java.util.*;

class Unique {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(hm.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}