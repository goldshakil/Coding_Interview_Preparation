class Solution {
public:
    bool isPowerOfTwo(int n) {
        
        if(n<=0) return false;
        if(n==1||n==2) return true;
        
        int count=0;
        while(n!=0)
        {
            unsigned int bit=n&1;
            if(bit==1)
                count++;
            if(count>1) return false;
            n=n>>1;
        }
        
        return true;
    }
};
