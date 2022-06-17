# LC-841

# Timw complexity O(N) space complexity O(N) 

def dfs(idx, visited, rooms):
    if idx>=len(rooms):
        return
    
    keys=rooms[idx]

    for key in keys:
        # key represent the index of the room to visit
        if not visited[key]:
            visited[key]=True
            dfs(key,visited,rooms)
            
class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        
        visited=[False]*len(rooms)
        visited[0]=True
        dfs(0,visited,rooms)
        
        for i in visited:
            if not i:
                return False
            
        return True
        
