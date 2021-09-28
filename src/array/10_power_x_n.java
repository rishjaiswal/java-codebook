/*
https://leetcode.com/problems/powx-n/
*/


package array;

class Power {
    public static double myPowRecursive(double x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        if (n % 2 == 0)
            return (myPowRecursive(x, n / 2) * myPowRecursive(x, n / 2));
        if (n % 2 < 0)
            return (1 / x * myPowRecursive(x, n / 2) * myPowRecursive(x, n / 2));
        return (x * myPowRecursive(x, n / 2) * myPowRecursive(x, n / 2));
    }

    public static double myPow(double x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        
        double answer = 1.0;
        long num = n;
        boolean flag = false;
        if(num < 0) flag = true;
        num = Math.abs(num);
        while(num != 1){
            if(num % 2 == 0){
                x*=x;
                num/=2;
            }
            else{
                answer *= x;
                num--;
            }
        }
        answer*=x;
        if(flag == true) return (1.0/answer);
        return answer;
    }
}