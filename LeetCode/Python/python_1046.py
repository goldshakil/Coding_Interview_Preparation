# LC-1046
# Solution 1: Sort in descending then simulate inserting N stones while take O(N^2) (see Simulate block)
# Solution 2: Use max heap O(NLogN)
# Ps. heapify() actually takes linear time

from heapq import heapify, heappush, heappop

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        
        max_heap=[]
        
        for i in stones:
            heappush(max_heap,-1*i) # easiest trick to change min to max heap
        
        # Simiulate
        while len(max_heap)>1: # O(NLog(N)) -> Worst case the stones are not equal every time (size-=1 not size-=2)
            item1=heappop(max_heap)*-1
            item2=heappop(max_heap)*-1
            
            diff=item1-item2 # Guaranteed position since item1 is larger
            if diff>0:
                heappush(max_heap,diff*-1)
                
        if len(max_heap)==0: # All stones destroyed
            return 0
        else:
            return heappop(max_heap)*-1
            
                
            
            
        
        
