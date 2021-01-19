class Solution {
    public int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
		for(int r=0; r<A.length; r++) {
			for(int c=0; c<A[0].length; c++) {
				result[c][r]= A[r][c];
			}
		}
		return result;
    }
}