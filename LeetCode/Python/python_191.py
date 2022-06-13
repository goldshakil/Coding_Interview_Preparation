# LC-191
class Solution:
    def hammingWeight(self, n: int) -> int:
        
        # Since the loop will be run at max 32 time -> time is O(1)
        
        mask=1
        counter=0
        
        
        # Method 1: Shift n instead of mask
        while n!=0:
            bit = n&mask
            if bit:
                counter+=1          
            n=n>>1
            
        # Method 2: Shifting the mask
#         while n!=0:
#             bit = n&mask
#             if bit:
#                 counter+=1
#             # clear used bit in n
#             inverted_mask=~mask
#             n=n&inverted_mask
            
#             mask=mask<<1
            
        return counter
            
        
