class Problem_7 {
    public int reverse(int x) {
        
        double answer=0;
        while(x!=0)
        {
            answer=answer*10+(x%10);
            x=x/10;
        }
        if(answer>=(Math.pow(2,31)-1)) answer=0;
        if(answer<=Math.pow(-2,31))answer=0;
        return (int)answer;
        
    }
}
