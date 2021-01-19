class Solution {
	public int islandPerimeter(int[][] grid) {
		int result=0;
		for(int row=0; row<grid.length; row++) {
			for(int column=0; column< grid[0].length; column++) {
				if(grid[row][column]==1) {
					if(row==grid.length-1) result++;
					else if(grid[row+1][column]==0) result++;
					if(row==0) result++; 
					else if(grid[row-1][column]==0) result++;
					if(column==grid[0].length-1) result++;
					else if(grid[row][column+1]==0) result++;
					if(column==0) result++;
					else if(grid[row][column-1]==0) result++;
					
				}
			}
		}
		return result;
	}
}