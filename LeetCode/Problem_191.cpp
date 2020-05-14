class Solution {
public:
    int hammingWeight(uint32_t n) {
        
       
         int count=0;
        while(n!=0) //no more 1's left
        {
            if(n&1==1)
            {
                count++;
            }
            n=n>>1;
        }
        
        return count;
    }
};
