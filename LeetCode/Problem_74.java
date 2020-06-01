class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length==0||matrix[0].length==0) return false;
		
		int possibleRow = 0;
		for (int i = 0; i < matrix.length - 1; i++) {
			if (matrix[i][0] <= target && target < matrix[i + 1][0]) {
				possibleRow = i;
				break;
			}
		}
		if (matrix[matrix.length - 1][0] <= target) {
			possibleRow = matrix.length - 1;
		}
        
        if(Arrays.binarySearch(matrix[possibleRow], target)<0) return false;
        else
        {
            return true;
        }
        
        
    }
}
