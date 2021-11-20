/*
https://leetcode.com/explore/learn/card/queue-stack/239/conclusion/1391/
*/

package queue;

import java.util.*;

class KeysandRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // rooms = [[1,3],[3,0,1],[2],[0]]
        HashSet<Integer>  visited = new HashSet();
        visited.add(0);
        Queue<Integer> q = new LinkedList();
        q.add(0);
        while(!q.isEmpty()) {
            for(int key : rooms.get(q.poll()))
            {
                if(!visited.contains(key)) {
                    visited.add(key);
                    q.offer(key);
                }
            }
        }
        return visited.size() == rooms.size();
    }
}