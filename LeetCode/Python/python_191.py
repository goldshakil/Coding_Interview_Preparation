# LC-191
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # O(N^2) -> double loop search
        # O(N*LOG(N)) -> sort then linear search
        # O(N) -> Create a hashmap then linear search -> O(N) Space
        
        # Keyword is "TWICE" -> XOR
        
        unique=0 # 0 ^ X = X
        
        for i in nums:
            unique^=i #Edge case of when len(nums)==1 is handled -> 0^ANY=ANY
        
        return unique
