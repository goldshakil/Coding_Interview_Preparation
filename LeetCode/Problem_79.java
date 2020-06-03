class Solution {
    
   // curIdx: the index you have found until now
	public boolean DFS(int curIdx, String word, char board[][], int i, int j, StringBuilder curString) // word
	{
		//System.out.println(curString);
		if (curString.toString().equals(word)) {
			//found it
			return true;
		}

		else {
			// children: next step -> if next step is possible go down that path isSafe?
			// up
			if (i - 1 >= 0 && board[i - 1][j] == word.charAt(curIdx + 1)) {
				
				char temp=board[i-1][j];
				board[i-1][j]='.';
				
				curString.append(word.charAt(curIdx + 1));

				if (DFS(curIdx + 1, word, board, i - 1, j, curString)) {
					return true;

				}
				// back track
				curString.deleteCharAt(curString.length() - 1);
				board[i-1][j]=temp;
			}
			// down
			 if (i + 1 < board.length && board[i + 1][j] == word.charAt(curIdx + 1)) {
				//mark it as used
				 char temp=board[i+1][j];
				 board[i+1][j]='.';
				 
				 curString.append(word.charAt(curIdx + 1));

				if (DFS(curIdx + 1, word, board, i + 1, j, curString)) {
					return true;
				}
				// back track
				curString.deleteCharAt(curString.length() - 1);
				board[i+1][j]=temp;
			}
			// right
			 if (j + 1 < board[0].length && board[i][j + 1] == word.charAt(curIdx + 1)) {
				
				 char temp=board[i][j+1];
				 board[i][j+1]='.';
				 curString.append(word.charAt(curIdx + 1));

				if (DFS(curIdx + 1, word, board, i, j + 1, curString)) {
					return true;

				}
				// back track
				curString.deleteCharAt(curString.length() - 1);
				board[i][j+1]=temp;
			} 
			 if (j - 1 >= 0 && board[i][j - 1] == word.charAt(curIdx + 1)) {
				 
				 char temp=board[i][j-1];
				 board[i][j-1]='.';
				curString.append(word.charAt(curIdx + 1));

				if (DFS(curIdx + 1, word, board, i, j - 1, curString)) {
					return true;
				}
				// back track
				curString.deleteCharAt(curString.length() - 1);
				board[i][j-1]=temp;
			}
		}

		return false;
	}
    public boolean exist(char[][] board, String word) {
        
        	for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {

				// found the first character
				if (word.charAt(0) == board[i][j]) {
                    
                    char temp=board[i][j];
					board[i][j]='.';
				//	if(j==0) continue;
					StringBuilder curString = new StringBuilder();
					curString.append(word.charAt(0));
					if(DFS(0, word, board, i, j, curString)) return true;
                    
                    board[i][j]=temp;
				    
				}

			}

		}
        return false;
    }
}
