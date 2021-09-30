/*
https://leetcode.com/problems/majority-element/
*/


package array;

import java.util.*;

class Majority {
    public static int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;
        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }
            if (count > majorityCount) {
                return num;
            }
        }
        return -1;
    }

    public static int majorityElementHashMapApproach(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap();
        for (int num : nums)
        {
            if(hm.containsKey(num))
                hm.put(num,hm.get(num)+1);
            else
                hm.put(num,1);
        }

        for(Map.Entry<Integer,Integer> m : hm.entrySet()){
            if(m.getValue() > (nums.length/2))
                return m.getKey();
        }
        return -1;
    }

    public static int majorityElementOptimisedApproach(int[] nums) {
        //  Boyer-Moore Voting Algorithm
        int can=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(can==nums[i])
            {
                count++;
            }
            else
                count--;
            if(count==0)
            {
                can=nums[i];
                count=1;
            }
        }
        // We can calculate the can iterations and then return accordingly either -1 or can.
        return can;
    }
}

