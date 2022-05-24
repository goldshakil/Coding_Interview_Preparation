# LC-155
class MinStack:
    def __init__(self):
        self.stack=[] # real order
        self.min_arr=[] # min_arr[i] represes the minimum value until the index i (minimum from 0 to stack[i])
        

    def push(self, val: int) -> None:
        self.stack.append(val)
        if len(self.min_arr)==0:
            self.min_arr.append(val)
        else:
            if self.min_arr[-1]>=val: # compare minimum before that to now
                self.min_arr.append(val)
            else:
                self.min_arr.append(self.min_arr[-1])
            
                
        

    def pop(self) -> None:
        self.stack.pop()
        self.min_arr.pop()
        
        

    def top(self) -> int:
        return self.stack[-1]
        

    def getMin(self) -> int:
        return self.min_arr[-1]
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
