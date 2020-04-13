class Problem_9 {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;
        else
        {
            int reversed=0;
            int temp=x;
             while(temp!=0)
        {
            reversed=reversed*10+(temp%10);
            temp=temp/10;
        }
            if(x==reversed) return true;
            else return false;
        }
        
    }
}
