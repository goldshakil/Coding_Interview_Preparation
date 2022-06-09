# LC-242
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # O(s*t), O(1) space solution:  for every letter in s find in t
        # O(slogs+tlogt) time and O(1) space solution : sort both and compare
        # Hashing -> O(s+t) time O(s+t) space solution
        
        # Counter(s) -> python function creates a hashmap of s by counting its characters
        
        s_hashmap={}
        for c in s:
            if c in s_hashmap:
                s_hashmap[c]+=1
            else:
                 s_hashmap[c]=1
                    
        t_hashmap={}
        for c in t:
            if c in t_hashmap:
                t_hashmap[c]+=1
            else:
                 t_hashmap[c]=1
        
        return s_hashmap==t_hashmap
