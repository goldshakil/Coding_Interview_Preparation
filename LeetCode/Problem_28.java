class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.equals("")) return 0;
    
        String sub="";
        for(int i=0;i<haystack.length();i++)
        {
            if(i+needle.length()>haystack.length()) return -1;
           sub=haystack.substring(i,i+needle.length());
            
            if(sub.equals(needle)) return i;
           
        }
        
     return -1;   
    }
}
