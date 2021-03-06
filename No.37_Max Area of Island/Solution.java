class Solution {
	int grid[][];
	boolean[][] counted;
	public int maxAreaOfIsland(int[][] grid) {
		this.grid=grid;
		this.counted = new boolean[grid.length][grid[0].length];
		int max=0;
		int Currisland=0;
		for(int r=0; r<grid.length; r++) {
			for(int c=0; c<grid[0].length; c++) {
				if(grid[r][c]==1&&counted[r][c]==false) {
					Currisland=oneIsland(r, c);
					max=max>Currisland?max:Currisland;
				}
			}
		}
		return max;
	}
	public int oneIsland(int r, int c) {
		if(r<0||c<0||r>=grid.length||c>=grid[0].length) return 0;
		if(counted[r][c]==true) return 0;
		counted[r][c]=true;
		if(grid[r][c]==1) return 1+oneIsland(r-1, c) + oneIsland(r, c-1) + oneIsland(r+1, c) + oneIsland(r, c+1);
		else return 0;
	}
}