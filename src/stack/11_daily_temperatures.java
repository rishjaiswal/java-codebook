/*
https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1363/
*/

package stack;

import java.util.Stack;

class dailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temperatures.length];

        for (int currDay = 0; currDay < temperatures.length; currDay++) {
            int currentTemp = temperatures[currDay];
            // Pop until the current day's temperature is not
            // warmer than the temperature at the top of the stack
            while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemp) {
                int prevDay = stack.pop();
                answer[prevDay] = currDay - prevDay;
            }
            stack.push(currDay);
        }
        return answer;
    }

    public static int[] dailyTemperaturesSecondApproach(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] answer = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            answer[i] = st.isEmpty() ? 0 : st.peek() - i;
            st.push(i);
        }
        return answer;
    }
}

/*
[30,60,90]

[0] : 30
currentTemp = 30
stack (0)

[1] : 60
currentTemp = 60

temperatures[stack.peek()] < currentTemp
tempratures[0] < 60
30 <60

prevDay = 0;
answer[0] = currDay - prevDay = 1 - 0 = 1;
stack(1)

[2] : 90
currentTemp = 90

temperatures[stack.peek()] < currentTemp
tempratures[1] < 90
60 < 90

prevDay = 1;
answer[1] = currDay - prevDay = 2 - 1 = 1;

[1,1,0]

 */