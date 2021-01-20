class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //g -> minimum size of cookie which is okay
        //size s
        //one child per one cookie
        //sort both
         Arrays.sort(g);
         Arrays.sort(s);
        int start=0;
        int count=0;
        for(int i=0;i<g.length;i++)
        {
         
        for(int j=start;j<s.length;j++)
        {
            if(s[j]>=g[i])
            {
               
                start=j+1;
                count++;
                break;
            }
            
            
        }   
        }
        
        return count;
        
        
    }
}
