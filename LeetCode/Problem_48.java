class Solution {
    	public void transpose(int matrix[][]) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	public void swap(int matrix[]) {
		int i = 0;
		int j = matrix.length-1;
		
		while(i<j)
		{
			int temp=matrix[i];
			matrix[i]=matrix[j];
			matrix[j]=temp;
			i++;
			j--;
		}
	}
    public void rotate(int[][] matrix) {
        
        transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
			swap(matrix[i]);

		}
    }
}
