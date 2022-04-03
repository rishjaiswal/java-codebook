package recursion_n_backtracking;

class PowerN {
    public static boolean isPower2 (int n){
        if(n==1) return true;
        if(n<=0 || n%2!=0) return false;
        return isPower2(n/2);
    }

    public static boolean isPower3 (int n){
        if(n==1) return true;
        if(n<=0 || n%3!=0) return false;
        return isPower3(n/3);
    }

    public static boolean isPower4 (int n){
        if(n==1) return true;
        if(n<=0 || n%4!=0) return false;
        return isPower4(n/4);
    }

}