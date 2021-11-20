/*
https://leetcode.com/problems/find-the-celebrity/
https://www.geeksforgeeks.org/the-celebrity-problem/

In a party of N people, only one person is known to everyone.
Such a person may be present in the party, if yes, (s)he doesn’t know anyone in the party.
We can only ask questions like “does A know B? “.
Find the stranger (celebrity) in the minimum number of questions.
 */

package queue;

class Celeberity {
    public int findCeleberity(int n){
        int candidate =0;
        for(int i=0;i<n;i++) {
            if(knows(candidate,i))
                candidate = i;
        }

        for(int i=0;i<n;i++){
            if(i!=candidate && (knows(candidate,i) || !knows(i,candidate)))
                return -1;
        }
        return candidate;

    }

    // Helper function provided utility for above problem which tells a knows b
    public boolean knows(int a,int b){
        return true;
    }
}