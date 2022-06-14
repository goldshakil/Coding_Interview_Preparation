# LC-54

# Solution 1: O(M*N) time O(M*N) Memory -> DFS

# R D L U
row_dir=[0,1,0,-1] 
col_dir=[1,0,-1,0]

def valid_idx(i,j,rows,cols):
    if i<0 or i>=rows or j<0 or j>=cols:
        return False
    return True
    
def dfs(i,j,matrix,visited,rows,cols,count,res,k):
    
    # DFS will be only for valid indices
    res.append(matrix[i][j])
    
    if count>=(rows*cols):
        return
    
    # The direction should be the same as the previous one or a new one RDLUP
    # k maintains the previous direction
    # At every node you only have to move in one direction - once we find valid break
    for c in range(4):
        new_k=(k+c)%4  # when c=0 -> new_k == k -> maintaining same direction
        new_i=i+row_dir[new_k]
        new_j=j+col_dir[new_k]
        if valid_idx(new_i,new_j,rows,cols) and not visited[new_i][new_j]:
            visited[new_i][new_j]=True
            dfs(new_i,new_j,matrix,visited,rows,cols,count+1,res,new_k)
            break         
    
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        res=[]
        
        rows=len(matrix)
        cols=len(matrix[0])
        
        visited=[]
        for i in range(rows):
            row=[]
            for j in range(cols):
                row.append(False)
            visited.append(row)
        
        visited[0][0]=True
        dfs(0,0,matrix,visited,rows,cols,1,res,0)
        
        return res


# Solution 2: O(M*N) time O(1) space
'''
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        # Basic idea: we're moving positive columns , positive row THEN negative cols, negative row
        
        res=[]

        direction=1 # indicates we're moving in the plus or minus
        
        rows=len(matrix)
        cols=len(matrix[0])
        
        col_limit=cols # How many numbers we're printing while moving through cols
        row_limit=rows-1 # How many numbers we're printing while moving through rows
        
        i=0
        j=0
        
        
        while len(res)<(rows*cols): # len(res) == numbers added
            # Step 1: Move through cols
            for _ in range(col_limit):
                res.append(matrix[i][j])
                j+=direction
            
            # Adjust indices
            if direction==1:
                j-=1
                i+=1
            else:
                j+=1
                i-=1
                
                
            # Step2: Move through rows
            for _ in range(row_limit):
                res.append(matrix[i][j])
                i+=direction
            
            # Adjust indices
            if direction==1:
                i-=1
                j-=1
            else:
                i+=1
                j+=1

            # Step3: Flip the direction and adjust limits
            row_limit-=1
            col_limit-=1  
            direction*=-1
            
            
        return res
'''
