# LC-703


# PS1 - Kth largest value means: kth largest from top
# PS2 - Why we're using minHeap? because we want to remove all mins except the largest K elements

# Solution 1 O(NlogN): Sorting and adding to the right position then returning the kth element 
# Solution 2 O() : Use MinHeap
from heapq import heapify, heappush, heappop

class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.nums=nums
        self.k=k
        heapify(self.nums) # Adding N nodes where each node takes O(Log(N)) -> O(N*log(N))
        
        while len(nums)>k: # O(N-K) -> Worst case K=1 => O(N)
            heappop(self.nums)
        
        # Total time complexity -> O(N*log(N))
        
        
        

    def add(self, val: int) -> int: # O(log(N))
        heappush(self.nums,val)
        
        if len(self.nums)>self.k:
            heappop(self.nums)
            
        return self.nums[0] # The root of the heap is always the largest Kth element
        
        


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)
