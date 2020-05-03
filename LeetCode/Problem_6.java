class Solution {
	public String convert(String s, int numRows) {
        
        if(numRows==1) return s;
        

        StringBuilder a[]=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            a[i]=new StringBuilder();
        }

			int pos = 0; // actual number
			int limit = numRows - 1;

			for (int counter = 0; counter < s.length(); counter++) {
			
                    a[pos].append((s.charAt(counter)));
                
				if (pos < limit) // going down
				{
					pos++;
				} else if (pos == limit) // rached limit
				{
					if (limit == numRows - 1) {
						limit = 0;
						pos--;
					} else {
						limit = numRows - 1;
						pos++;

					}
				} else if (pos > limit) // going up
				{
					pos--;
				}

			}
			//System.out.println("\n--------------------");
        
      //  System.out.println(Arrays.toString(a));
        StringBuilder answer=new StringBuilder();
        for(int i=0;i<numRows;i++)
            answer.append(a[i]);
			return answer.toString();

		}
	}


/*
//less optimized:

class Solution {
	public String convert(String s, int numRows) {
        
        if(numRows==1) return s;
        if(s.length()<2) return s;

        
        StringBuilder a=new StringBuilder();
        

        
		for (int starting_position = 0; starting_position < numRows; starting_position++)
		// cs index
		{
			int pos = starting_position; // actual number
			int limit = numRows - 1;

			for (int counter = starting_position; counter < s.length(); counter++) {
				if (pos == starting_position)
                {//System.out.print(s.charAt(counter));
                    a.append(s.charAt(counter));
                }
				if (pos < limit) // going down
				{
					pos++;
				} else if (pos == limit) // rached limit
				{
					if (limit == numRows - 1) {
						limit = 0;
						pos--;
					} else {
						limit = numRows - 1;
						pos++;

					}
				} else if (pos > limit) // going up
				{
					pos--;
				}

			}
			//System.out.println("\n--------------------");
        }
			return a.toString();

		}
	}
*/
