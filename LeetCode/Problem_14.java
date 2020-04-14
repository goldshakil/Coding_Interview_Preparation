class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length==0) return "";
        
        int shortestIDX=0;
        // find the shortest word
        int i=0;
        for(i=0;i<strs.length;i++)
        {
            if(strs[i].length()<strs[shortestIDX].length())
                shortestIDX=i;
        }
        
        //loop to letter and keep checking
        for(int j=strs[shortestIDX].length()-1;j>=0;j--)
        {
            //subtring to last index-1
            String newString=strs[shortestIDX].substring(0,j+1);
          //  System.out.println(newString+"  12");
            // check each string if it has the substring
            boolean matching=false;
             for(int k=0;k<strs.length;k++)
             {
                
                 if(strs[k].indexOf(newString)==0&& !newString.equals("")) // a substring at this index
                 {      
                     matching=true;   
                 }
                 else
                 {
                     matching=false;
                     break;
                 }
             }
            if(matching==true) //matched with all letter
            {
                return newString;
            }
       
            
        }
        return "";
    }
}
