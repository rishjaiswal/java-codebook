/*
https://leetcode.com/explore/learn/card/queue-stack/231/practical-application-queue/1375/
 */

package queue;

import java.util.*;

class Lock {
    public static int openLock(String[] deadends, String target) {
        // Base condition - for handling constraints [OPTIONAL]
        if (deadends.length < 1 && deadends.length > 500)
            return -1;
        if (target.length() != 4)
            return -1;
        for (int i = 0; i < deadends.length; i++) {
            if (deadends[i].length() != 4 || deadends[i] == target)
                return -1;
        }
        // BFS - Queue Logic
        HashSet<String> dead_ends = new HashSet(Arrays.asList(deadends));
        HashSet<String> visited = new HashSet();
        visited.add("0000");
        Queue<String> queue = new LinkedList();
        queue.offer("0000");

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                String lock_position = queue.poll();
                if (dead_ends.contains(lock_position)) {
                    size--;
                    continue;
                }
                if (lock_position.equals(target))
                    return level;
                StringBuilder sb = new StringBuilder(lock_position);
                for (int i = 0; i < 4; i++) {
                    char current_position = sb.charAt(i);
                    String s1 = sb.substring(0, i) + (current_position == '9' ? 0 : current_position - '0' + 1) + sb.substring(i + 1);
                    String s2 = sb.substring(0, i) + (current_position == '0' ? 9 : current_position - '0' - 1) + sb.substring(i + 1);

                    if (!visited.contains(s1) && !dead_ends.contains(s1)) {
                        queue.offer(s1);
                        visited.add(s1);
                    }
                    if (!visited.contains(s2) && !dead_ends.contains(s2)) {
                        queue.offer(s2);
                        visited.add(s2);
                    }
                }
                size--;
            }
            level++;
        }
        return -1;
    }
}