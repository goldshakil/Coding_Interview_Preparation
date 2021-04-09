class Solution {
     public double myPow(double x, int n) {
        if (n < 0)
            return 1 / myPowFrom(x, -n);
        
        return myPowFrom(x, n);
    }
    
    private double myPowFrom(double x, int n) {
        if (n == 0)
            return 1;

        return n % 2 == 0 
            ? myPowFrom(x * x, n / 2) 
            : myPowFrom(x * x, n / 2) * x;
    }
}
