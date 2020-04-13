class Problem_13 {
    public int romanToInt(String s) {
        
        int answer=0;
        char last_char='-';
        
        //you can create a hashmap for easy addition and a cleaner code
        
        for(int i=0;i<s.length();i++)
        {
            char current=s.charAt(i);
            if(current=='M')
            {
                answer+=1000;
                    if(last_char=='C') answer-=200;
                
                
            }
             else if(current=='I')
            {
                 answer+=1;
                
            }
              else if(current=='V')
            {
                  answer+=5;
                  if(last_char=='I') answer-=2;
                
            }
              else if(current=='X')
            {
                
                  answer+=10;
                     if(last_char=='I') answer-=2;
            }
              else if(current=='L')
            {
                  answer+=50;
                  if(last_char=='X') answer-=20;
                
            }
              else if(current=='C')
            {
                  answer+=100;
                      if(last_char=='X') answer-=20;
                
            }
              else if(current=='D')
            {
                  answer+=500;
                      if(last_char=='C') answer-=200;
                
            }
            
            
            last_char=s.charAt(i);
        }
        
        
        return answer;
        
        
    }
}
