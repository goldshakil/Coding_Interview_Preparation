# LC-338

# Solution 1: Count bits manually for each number - O(n) time complexity

# def countBitsinNumber(n): # You can use the function in LC-191
#     # Since the loop will be run at max 32 time (10^5<2^32) -> time is O(1)
#     # The number of bits to represent x are log2(x)+1
#     mask=1
#     counter=0

#     while n!=0:
#         n&=(n-1) # Sets the LSB 1 to zero
#         counter+=1
#     return counter

# class Solution:

#     def countBits(self, n: int) -> List[int]:
        
#         ans=[0]
        
#         for i in range(1,n+1):
#            ans.append(countBitsinNumber(i))
            
#         return ans
   
    
    
# Solution 2: DP solution - O(n) time but a bit more efficient
# the idea is to compute the number of bits using alredy computed ones
# basic idea is 1,2,4,8.16... differ by one bit from 0

class Solution:
    def countBits(self, n: int) -> List[int]:
        
        dp=[0]*(n+1) # dp[i] -> the number of bits in number i
        
        offset=1
        
        for i in range(1,n+1):
            # Updating offset (offset*2 => next offset)
            if i==offset*2: # 1,2,4,8,16...
                offset*=2
                
            dp[i]=1+dp[i-offset]
            
            
        return dp
