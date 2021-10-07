/*
https://leetcode.com/problems/group-anagrams/
*/

package string;

import java.util.*;

class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList();
        HashMap<String, List<String>> hm = new HashMap();
        for (String str : strs) {
            char x[] = str.toCharArray();
            Arrays.sort(x);
            String s = new String(x);
            if (hm.containsKey(s))
                hm.get(s).add(str);
            else {
                List<String> al = new ArrayList();
                al.add(str);
                hm.put(s, al);
            }
        }
        return new ArrayList(hm.values());
    }
}