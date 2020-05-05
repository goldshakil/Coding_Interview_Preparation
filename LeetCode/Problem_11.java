class Solution {
    
    public int area(int x,int y)
    {
        return x*y;
        
    }
    public int maxArea(int[] height) {
        
        
        
        //brute force -> 2 pointer solution is better
        int max=0;
        for(int i=0;i<height.length-1;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                
                max=Math.max(max,area(Math.min(height[i],height[j]),j-i));
            }
        }
        
        return max;
        
    }
}
