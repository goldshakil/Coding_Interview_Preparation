class MinStack {

    //you can use a normal stack too with another stack that keeps the min availabe value on top
     List<Integer>stack=new ArrayList<Integer>();
    
    
    public MinStack() {
        
    }
    
    public void push(int x) {
        
        stack.add(x);
        //if it smaller than min stack or min stack is empty push x to min stack
    }
    
    public void pop() {
        // firest check the removed value is not the top of the min stack 
        //if it is top it should be removed from there too
        stack.remove(stack.size()-1);
    }
    
    public int top() {
       return stack.get(stack.size()-1);
        
    }
    
    public int getMin() {
        int min=stack.get(0);
        for(int i=0;i<stack.size();i++)
        {
            if(min>stack.get(i)) min=stack.get(i);
        }
        return min;
        //return top of minstack
        
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
