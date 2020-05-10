class Solution {
    public int titleToNumber(String s) {
        
     
        
        int number=0;
        for(int i=0;i<s.length();i++)
        {
            number*=26;
         //   System.out.println(s.charAt(i));
            number+=(s.charAt(i)-'A'+1);
           // System.out.println(number);
            
        }
        
        return number;
        
    }
}
