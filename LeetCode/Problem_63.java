class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        
        int dp[][]= new int[grid.length][grid[0].length];
        
        // fill the basic condition
        
        int filler=1;
        
        for(int i=0;i<dp[0].length;i++)
        {
            if(grid[0][i]==1)filler=0;  // all the elements from that point can't be reached
            
            dp[0][i]=filler;
        }
        
        filler=1;
         for(int i=0;i<dp.length;i++)
        {
            if(grid[i][0]==1)filler=0;  // all the elements from that point can't be reached
            
            dp[i][0]=filler;
        }
            
        
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(grid[i][j]==1) dp[i][j]=0;
                else
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }   
            }
        }
        
        return dp[dp.length-1][dp[0].length-1];
        
        
    }
}
