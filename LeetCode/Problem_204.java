class Solution {

    public int countPrimes(int n) {
        
        
        //simple solution using brtute force doesnn't work
        //use ERATOSTHENES algorithm
        
        boolean prime[]=new boolean[n];
        
        //step1: assume all numbers are prime
        for(int i=0;i<n;i++)
        {
            prime[i]=true; 
        }
        
        //start from two (lowet prime number)
        for(int i=2;i*i<n;i++) //there are no prime numbers greater than the current number in its square -> optimization
        {
            if(prime[i]) //if the number is prime its multiples are not prime
            {
                for(int j=i;i*j<n;j++) //while it's next multiple is smaller than n
                {
                    prime[i*j]=false;
                }
            }
        }
        int count=0;
       
         for(int i=2;i<n;i++)
        {
            if(prime[i]) //if the number is prime its multiples are not prime
            {
               count++;
            }
        }
        
        return count;
    }
}
