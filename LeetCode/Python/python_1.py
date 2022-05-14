class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
#         O(N) Solution

        # nums=[1,2,3,5,6,3]
        # nums_hash={complement:[complement_indices]}
        # nums_hash={1:[0] ,2:[1],3:[2,5],5:[3], 6:[4]}
        nums_hash={}
        for idx,i in enumerate(nums):
            if i in nums_hash: #DON"T USE nums_hash.get(i) -> slower and possible bug when the value return is 0
                 nums_hash[i].append(idx)
            else:
                nums_hash[i]=[idx]
                
                
        for idx, i in enumerate(nums):
            complement=target-i
            # complement found
            if nums_hash.get(complement):
                complement_indices=nums_hash.get(complement)
                if i==complement and len(complement_indices)<=1:
                    #case1: same element, same index
                    pass
                elif i==complement and len(complement_indices)>1:
                    #case2: same element, different index
                    return [complement_indices[0],complement_indices[1]]
                else:
                    #case3: different elements
                    return [idx,complement_indices[0]]
                    
        
#         O(N^2) solution 
#         for i,item1 in enumerate(nums):
#             for j,item2 in enumerate(nums):
#                 if i==j:
#                     continue
#                 if item1+item2==target:
#                     return [i,j]
        
