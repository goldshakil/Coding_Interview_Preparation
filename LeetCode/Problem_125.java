class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals("")) return true;
        
        StringBuilder a=new StringBuilder();
        
        
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))) 
            {
                a.append(Character.toLowerCase(s.charAt(i)));
            
             }
        }
        
        
        StringBuilder origin= new StringBuilder(a);
        
     
        
        a.reverse();
        return origin.toString().equals(a.toString());
    }
}
