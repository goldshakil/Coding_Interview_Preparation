class Solution {
   
    //how many times can it be divded by 5,125, (power of 5) indicates how many leading zeros there are
    // you have to count how many fives there are in each number that belongs to[5,n]
    
    public int trailingZeroes(int n) {
    //  calc(n);
        if(n==0) return 0;
       
        int count=0;
        
        // shortcut: https://www.youtube.com/watch?v=GokjSyb-Z_c
        //this is shortcut
        while(n>=5)
        {
            count+=n/5;  //25/5 -> 5
            n/=5;
           
        }
        
        return count;
        
        
        
   
        
    }
}
