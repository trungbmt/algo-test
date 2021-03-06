class Solution {
	int[][] image;
	int oldColor;
	int newColor;
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		this.newColor = newColor;
		this.image = image;
		this.oldColor = image[sr][sc];
		if(this.oldColor!=this.newColor) setOther(sr, sc);
		return this.image;
	}
	public void setOther(int r, int c) {
		if(this.image[r][c]==this.oldColor) {
			this.image[r][c] = this.newColor; 
			if(r>0) {
				setOther(r-1, c);
			}
			if(r<this.image.length-1) {
				setOther(r+1, c);
			}
			if(c>0) {
				setOther(r, c-1);
			}
			if(c<this.image[0].length-1) {
				setOther(r, c+1);
			}
		}
	}
}