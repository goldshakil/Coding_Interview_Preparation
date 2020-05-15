class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set=new HashSet<Integer>();
        set.add(n);
        
        while(n!=1)
        {  
            int temp=0;
            while(n!=0)
            {
                temp+=Math.pow((n%10),2);
                n/=10;
                
            }
            n=temp;
            if(set.contains(temp))
            {
                return false;
            }
            else 
            {
                set.add(temp);
            }
            
        }
        //n==1
        return true;
        
    }
}
