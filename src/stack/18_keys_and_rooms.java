/*
https://leetcode.com/explore/learn/card/queue-stack/239/conclusion/1391/
*/

package stack;

import java.util.*;

class KeysandRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // rooms = [[1,3],[3,0,1],[2],[0]]
        HashSet<Integer>  visited = new HashSet();
        visited.add(0);
        Stack<Integer> st = new Stack();
        st.add(0);
        while(!st.isEmpty()){
            List<Integer> keys = rooms.get(st.pop());
            for(int key : keys) {
                if(!visited.contains(key)) {
                    visited.add(key);
                    st.add(key);
                }
            }
        }
        return visited.size() == rooms.size();
    }
}