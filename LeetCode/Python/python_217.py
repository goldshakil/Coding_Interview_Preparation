# LC-217
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        
        # Brute force O(n^2): double loop
        # Sorting O(n logn)
        # Hashing-set: O(N) memory O(N) time
        
        hash_set=set()
        for i in nums:
            if i in hash_set:
                return True
            hash_set.add(i)
        return False
        
        
