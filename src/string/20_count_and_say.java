/*
https://leetcode.com/problems/count-and-say/
*/

package string;

class CountandSay {
    public static String countAndSay(int n) {
        if (n <= 0)
            return "";
        String res = "1";
        while (n > 1) {
            // Mutable Object
            StringBuilder curr = new StringBuilder();
            for (int i = 0; i < res.length(); i++) {
                int count = 1;
                while (i + 1 < res.length() && res.charAt(i) == res.charAt(i + 1)) {
                    ++count;
                    ++i;
                }
                curr.append(count).append(res.charAt(i));
            }
            res = curr.toString();
            n--;
        }
        return res;
    }
}