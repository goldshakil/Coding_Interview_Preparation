class Solution {
    public String countAndSay(int n) {
        //type and frequencey
        // if you're gonna change the string alot use string builder
        //String builder is slightly faster
        
        String number="1";
      
        
        for(int i=2;i<=n;i++)
        {
            StringBuilder temp = new StringBuilder();
            int last_idx=0;
            //for every n scan the elements of number
            for(int j=0;j<number.length()-1;j++)
            {
                //instead of last index you can make a counter
                if(number.charAt(j)!=number.charAt(j+1))
                {
                    temp.append(String.valueOf(j-last_idx+1)); //frequency
    
                   temp.append(number.charAt(j)); //value
                    last_idx=j+1;
                }
            }
             temp.append(String.valueOf(number.length()-last_idx));
             temp.append(number.charAt(number.length()-1));
            number=temp.toString();
            
            
        }
        
        return number;
        
    }
}
