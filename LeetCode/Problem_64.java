class Solution {
    
    // Remember that DP is am imporvement over DFS thus this problem can be solved using DFS
    public int minPathSum(int[][] grid) {
        
        //dp[i][j]-> the minmum sum to reach a cell indexed by i,j
        int dp[][]=new int[grid.length][grid[0].length];
        
        //bsaic condition (you have no choice actually) -> no need for minumum
        dp[0][0]=grid[0][0]; 
        // fill the first row
        for(int i=1;i<dp[0].length;i++)
        {
            dp[0][i]=dp[0][i-1]+grid[0][i];
            
        }
        
         for(int i=1;i<dp.length;i++)
        {
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j]; // always find the min to the cell + cost
              
            }
            
       
        }
        
    return dp[dp.length-1][dp[0].length-1];
    }
    
}
