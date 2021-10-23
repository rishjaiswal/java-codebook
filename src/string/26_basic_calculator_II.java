/*
https://leetcode.com/problems/basic-calculator-ii/
*/

package string;

class CalculatorII {
    public static int calculate(String s) {
        if (s == null || s.isEmpty()) return 0;
        int length = s.length();
        int currentNumber = 0, lastNumber = 0, result = 0;
        char operation = '+';
        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }
            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
                if (operation == '+' || operation == '-') {
                    result += lastNumber;
                    lastNumber = (operation == '+') ? currentNumber : -currentNumber;
                } else if (operation == '*') {
                    lastNumber = lastNumber * currentNumber;
                } else if (operation == '/') {
                    lastNumber = lastNumber / currentNumber;
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        result += lastNumber;
        return result;
    }
}

/*
Problem :-
Expression : 3 + 2 * 2
Length : 5

Dry-run Solution :-
operation = + , currentNumber = 0, lastNumber = 0, result = 0;
0) 3 : currentNumber = 3
1) + : result = 0 , last number = 3
operation = +
currentNumber = 0
2) 2 : currentNumber = 2
3) * : result = 3 , lastNumber = 2
operation = *
currentNumber = 0
4) 2 : currentNumber = 2
// i== n-1 Condition for performing last operation
 lastNumber = lastNumber * currentNumber = 2 * 2 = 4

// LoopEnds

result = result + lastNumber
result = 3 + 4
return 7


Expression : 3 * 2 + 2
Length : 5

Dry-run Solution :-
operation = + , currentNumber = 0, lastNumber = 0, result = 0;
0) 3 : currentNumber = 3
1) * : result = 0 , last number = 3
operation = *
currentNumber = 0
2) 2 : currentNumber = 2
3) + : lastNumber = lastNumber * currentNumber = 3 * 2 = 6
operation = +
currentNumber = 0
4) 2 : currentNumber = 2
// i== n-1 Condition for performing last operation
result += lastNumber = 6  ,
last number = currentNumber = 2

// LoopEnds
result = result + lastNumber
result = 6 +2

return 8

 */