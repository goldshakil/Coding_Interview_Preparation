#LC-746

# Solution-1: O(2^N) DFS brute force solution: 1 DFS strating from idx 0 and one from idx 1
# At every node you have two options either go one index or two indices
'''
min_cost=-1
def dfs(arr,idx,total_cost): #You can do this top-down
    global min_cost
    
    if idx>len(arr):
        return
    if idx==len(arr):
        if min_cost==-1:
            min_cost=total_cost
        else:
            min_cost=min(min_cost,total_cost)
        return
            
    # Option1: Pick & Jump 1
    dfs(arr,idx+1,total_cost+arr[idx])
    # Option2: Pick & Jump 2
    dfs(arr,idx+2,total_cost+arr[idx])
    
class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        global min_cost
        
        dfs(cost,0,0)
        dfs(cost,1,0)
        temp=min_cost
        min_cost=-1
        return temp
'''

# Solution-2: O(N) time and space DP - Bottom-up
# Remember:I have to climb i stairs
# cost=[10,8,1]
#.  dp=[0,0,8,9] -> dp[3]-> min cost to climb 3 stairs
'''
class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        n=len(cost)
        dp=[0]*(n+1) # dp[i] the minimum cost to reach ith position 
        
        dp[0]=0
        dp[1]=0
        dp[2]=min(cost[0],cost[1])
        
        for i in range(3,n+1):
            dp[i]=min(cost[i-1]+dp[i-1],cost[i-2]+dp[i-2])
        
        return dp[n]
'''
    
# Solution-3: O(N) time and O(1) space (Solution 2 optimized)
# We only need the min cost for the previous 2
class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        n=len(cost)
        
        prv_prv_cost=0
        prv_cost=min(cost[0],cost[1])
        
        for i in range(3,n+1):
            temp_cost=min(cost[i-1]+ prv_cost,cost[i-2]+prv_prv_cost)
            
            prv_prv_cost,prv_cost=prv_cost,temp_cost
        
        
        return prv_cost
        
