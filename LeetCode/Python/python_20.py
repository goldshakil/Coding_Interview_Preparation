#LC-20
def top(stack):
    return stack[-1]

def is_left_brace(c):
    if c=="(" or c=="{" or c=="[":
        return True
    return False

class Solution:
    def isValid(self, s: str) -> bool:
        
        # O(N) solution , O(N) space
        stack=[]
        for c in s:
            if len(stack)==0 or is_left_brace(c): #left_brace
                stack.append(c)
            else:
                #right brace -> decisive factor
                
                #case 1:found a match
                stack_top=top(stack)
                if c ==")" and stack_top=="(":
                    stack.pop()
                elif c =="}" and stack_top=="{":
                    stack.pop()
                elif c =="]" and stack_top=="[":
                    stack.pop()
                    
                #case 2: no match for the right brace -> invalid
                else:
                    return False
                
        if len(stack)==0:
            return True
        
        return False
        
            
        
