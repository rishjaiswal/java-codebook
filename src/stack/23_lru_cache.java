/*
https://leetcode.com/problems/lru-cache/

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
The functions get and put must each run in O(1) average time complexity.

*/

package stack;

import java.util.*;

class LRUCache {
    DoubleNode head = new DoubleNode(0, 0);
    DoubleNode tail = new DoubleNode(0, 0);
    Map<Integer, DoubleNode> map;
    int capacity = 0;

    public LRUCache(int cap) {
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        capacity = cap;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            DoubleNode node = map.get(key);
            remove(node);
            insert(node);
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new DoubleNode(key, value));
    }

    private void remove(DoubleNode node) {
        map.remove(node.key);
        DoubleNode temp = node.prev;
        DoubleNode headnext = node.next;
        temp.next = headnext;
        headnext.prev = temp;
    }

    private void insert(DoubleNode node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
}

class DoubleNode {
    int key;
    int val;
    DoubleNode next;
    DoubleNode prev;

    DoubleNode(int d, int v) {
        key = d;
        val = v;
    }
}