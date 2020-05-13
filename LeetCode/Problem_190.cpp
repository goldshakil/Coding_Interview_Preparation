class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        
          uint32_t answer=0;
        int pos=0;
        while(n!=0)
        {
           // uint32_t bit=n&1;
           // printf("%d ",bit),
            answer+=(n&1);
           // if(n&1==1) printf("POS:%d\n",pos);
        
            if(pos+1!=32)
                answer=answer<<1;
            n=n>>1;
            pos++;
        }
   
          while(pos<32)
        {
              if(pos+1!=32)
                answer=answer<<1;
            pos++;
        }
       
        
        return answer;
        
    }
};
