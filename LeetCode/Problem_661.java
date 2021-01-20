class Solution {
    public int[][] imageSmoother(int[][] M) {
        int answer[][]=new int[M.length][M[0].length];
        for(int i=0;i<M.length;i++)//rows
        {
            //WORST SOLUTION EVER !!!!! MANY IF IF IF IF IF
            
            
            
            
            for(int j=0;j<M[0].length;j++)//columns
            {
                int sum=0;
                int counter=0;
                //check each direction
                if(j-1>=0)//can move left
                {
                    //add left
                    sum=sum+M[i][j-1];
                    counter++;
                    
                    //left up
                    if(i-1>=0)
                    {
                         sum=sum+M[i-1][j-1];
                        counter++;
                    }
                    
                    //left down
                     if(i+1<M.length)
                     {
                         sum=sum+M[i+1][j-1];
                         counter++;
                         
                     }
                    
                }
                if(j+1<M[0].length)//can move right
                {
                     //add right
                    sum=sum+M[i][j+1];
                    counter++;
                    
                    //right up
                    if(i-1>=0)
                    {
                         sum=sum+M[i-1][j+1];
                        counter++;
                    }
                    
                    //right down
                     if(i+1<M.length)
                     {
                         sum=sum+M[i+1][j+1];
                         counter++;
                         
                     }
                    
                    
                }
                //same column up
                if(i-1>=0)
                {
                    //up
                    sum=sum+M[i-1][j];
                    counter++;
                }
                //same column down
                if(i+1<M.length)
                { 
                    sum=sum+M[i+1][j];
                    counter++;
                }
                sum=sum+M[i][j];
                counter++;
                answer[i][j]=sum/counter;                
                
                
            }
            
            
        }
        return answer;
        
    }
}
