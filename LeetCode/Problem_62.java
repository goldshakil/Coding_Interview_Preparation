// DP Solution

class Solution {
    
    public int uniquePaths(int m, int n) {
        
        //dp[i][j] in how many way i can reach index i,j
        int dp[][]=new int[n][m];
        //n is rows
        
        //basic condition: fill the first row (only one way to reach each cell)
        for(int i=0;i<dp[0].length;i++)
        {
            dp[0][i]=1;
        }
         
        //basic condition2: fill the first column (only one way to reach each cell)
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=1;
        }
        
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        
        return dp[n-1][m-1];
        
        
    }
}

/*
//slow DFS solution
class Solution {
    
    public int paths = 0;

	public void DFS(int i, int j, int n, int m) {
		if (i == n && j == m) {
			paths++;
            return;
		}

		// visit children
		else {
			// try down
			if (i + 1 <= n) {
				// visit
				DFS(i + 1, j, n, m);
			}

			// try right
			if (j + 1 <= m) {
				// visit
				DFS(i, j + 1, n, m);
			}

		}

	}
    public int uniquePaths(int m, int n) {
        
        int i = 1; // row
		int j = 1; // column
		// exhaustive search of all different paths

		DFS(i, j, n, m);
        
        return paths;
    }
}

*/
