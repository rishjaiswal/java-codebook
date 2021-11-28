/*
Tail recursion is a recursion where the recursive call is the final instruction in the recursion function.
And there should be only one recursive call in the function.
 */

package recursion;

class TailRecursion {
    public static void reverseString(char[] s) {
        helper(0,s.length -1,s);
    }
    public static void helper(int start, int end,char[] s){

        //Base case
        if(start>=end){
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;


        helper(++start,--end, s);
    }


    private static int helper_non_tail_recursion(int start, int [] ls) {
        if (start >= ls.length) {
            return 0;
        }
        // not a tail recursion because it does some computation after the recursive call returned.
        return ls[start] + helper_non_tail_recursion(start+1, ls);
    }


    private static int helper_tail_recursion(int start, int [] ls, int acc) {
        if (start >= ls.length) {
            return acc;
        }
        // this is a tail recursion because the final instruction is the recursive call.
        return helper_tail_recursion(start+1, ls, acc+ls[start]);
    }

}

/**
 * The benefit of having tail recursion is that it could avoid the accumulation of stack overheads during the recursive calls,
 * since the system could reuse a fixed amount space in the stack for each recursive call.


 Note that in tail recursion, we know that as soon as we return from the recursive call we are going to immediately return as well,
 so we can skip the entire chain of recursive calls returning and return straight to the original caller.
 That means we don't need a call stack at all for all of the recursive calls, which saves us space.
 */