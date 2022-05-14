class Solution:
    def maxProfit(self, prices: List[int]) -> int:  
        #O(N)
        
        if len(prices)==0:
            return 0
        
        max_profit=0
        window_profit=0
        window_left=0
        length_arr=len(prices)
        
        for i in range(1,length_arr,1):
            if prices[i]-prices[window_left]<0: #Option 1: Start a new window since profit is negative -> found a minimum/better day to buy
                window_profit=0
                window_left=i
            else:
                window_profit=prices[i]-prices[window_left] #Option2: Add the new item to the window since profit is positive -> viable window
                
            max_profit=max(max_profit,window_profit)
                
        return max_profit
        

        
# O(N^2) -> Time exceeds
#         max_profit=0
        
#         for idx,i in enumerate(prices):
#             for j in prices[idx+1:]:
#                 diff=j-i
#                 if diff>0:
#                     # a profit
#                     max_profit=max(max_profit,diff)
                    
                    

#         return max_profit
        
