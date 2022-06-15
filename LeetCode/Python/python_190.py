#LC-190
class Solution:
    def reverseBits(self, n: int) -> int:
        
        # O(1) constant time since every number needs 32 loops
        mask=1
        ans=0
        
        for _ in range(32):
            bit=n&mask
            ans=ans<<1
            ans=ans|bit
            n=n>>1
            
        return ans
        
