# LC-125
class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        # Brute force solution-> O(N) time O(N) space: convert string to lower, remove all punct, reverse the string and compare
        # Better solution O(N) time O(1) space: user two pointers
        
        left=0
        right=len(s)-1
        
        while left<=right:
            if not s[left].isalnum(): # This function runs in O(1) since isalnum time complexity O(len_string)
                left+=1
            elif not s[right].isalnum():
                right-=1
            else: #both are alphanum
                if s[left].lower()!=s[right].lower():
                    return False
                left+=1
                right-=1
                
        return True
                
        
        
        
