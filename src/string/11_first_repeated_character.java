/*
https://www.geeksforgeeks.org/find-the-first-repeated-character-in-a-string/
*/

package string;

import java.util.*;

class Duplicate {
    public static int firstRepeatChar(String s) {
        HashMap<Character, Integer> hm = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hm.containsKey(c))
                return hm.get(c);
            else
                hm.put(c, i);
        }
        return -1;
    }
}